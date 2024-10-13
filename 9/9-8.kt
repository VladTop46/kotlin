import kotlin.random.Random
import kotlin.math.sign

fun main() {
    val number = Random.nextInt(1, 101)
    var guess: Int
    
    do {
        println("Введите ваше предположение:")
        guess = readLine()?.toIntOrNull() ?: 0
        
        when {
            guess < number -> println("Больше")
            guess > number -> println("Меньше")
            else -> println("Вы угадали!")
        }
    } while (guess != number)
}
