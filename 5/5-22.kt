import kotlin.random.Random

fun main() {
    val targetNumber = Random.nextInt(1, 101)
    var guess: Int?

    println("Угадай число от 1 до 100:")
    do {
        print("Введите ваше число: ")
        guess = readLine()?.toIntOrNull()

        when {
            guess == null -> println("Пожалуйста, введите число")
            guess < targetNumber -> println("Слишком мало")
            guess > targetNumber -> println("Слишком много")
            else -> println("Вы угадали!")
        }
    } while (guess != targetNumber)
}