import kotlin.random.Random

fun main() {
    val randomNumbers = IntArray(20) { Random.nextInt(1, 101) }
    println("Случайные числа: ${randomNumbers.joinToString(", ")}")
}
