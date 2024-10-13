import kotlin.random.Random

// Определение карты
data class Card(val rank: String, val suit: String, val value: Int)

// Создаем колоду 36 карт (от 6 до туза)
fun createDeck(): MutableList<Card> {
    val suits = listOf("Червы", "Бубны", "Пики", "Трефы")
    val ranks = listOf("6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз")
    val values = listOf(6, 7, 8, 9, 10, 2, 3, 4, 11) // Значения карт, включая туз как 11

    val deck = mutableListOf<Card>()
    for (suit in suits) {
        for (i in ranks.indices) {
            deck.add(Card(ranks[i], suit, values[i]))
        }
    }
    deck.shuffle() // Перемешиваем колоду
    return deck
}

// Функция для пересчета туза как 1 очко, если перебор
fun adjustForAce(score: Int, aces: Int): Int {
    var adjustedScore = score
    var aceCount = aces
    while (adjustedScore > 21 && aceCount > 0) {
        adjustedScore -= 10
        aceCount--
    }
    return adjustedScore
}

fun main() {
    val deck = createDeck() // Создаем перемешанную колоду
    var playerScore = 0
    var dealerScore = 0
    var playerAces = 0
    var dealerAces = 0

    // Функция для раздачи карты
    fun dealCard(): Card {
        return deck.removeAt(0) // Извлекаем карту из колоды
    }

    // Игровой процесс для игрока
    while (true) {
        val card = dealCard()
        println("Вы получили карту: ${card.rank} ${card.suit} (Очки: ${card.value})")
        if (card.rank == "Туз") playerAces++ // Если это туз
        playerScore += card.value
        playerScore = adjustForAce(playerScore, playerAces)
        println("Ваш счет: $playerScore")

        if (playerScore > 21) {
            println("Вы проиграли!")
            return
        }

        println("Хотите еще карту? (да/нет)")
        val answer = readLine()!!
        if (answer.lowercase() != "да") break
    }

    // Ход дилера
    while (dealerScore < 17) {
        val card = dealCard()
        println("Дилер получил карту: ${card.rank} ${card.suit} (Очки: ${card.value})")
        if (card.rank == "Туз") dealerAces++ // Если это туз
        dealerScore += card.value
        dealerScore = adjustForAce(dealerScore, dealerAces)
    }
    println("Счет дилера: $dealerScore")

    // Определение победителя
    when {
        dealerScore > 21 -> println("Вы выиграли! Дилер перебрал.")
        playerScore > dealerScore -> println("Вы выиграли!")
        dealerScore > playerScore -> println("Вы проиграли!")
        else -> println("Ничья!")
    }
}