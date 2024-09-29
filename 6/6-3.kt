fun main() {
    val numbers = intArrayOf(10, 5, 2, 20, 8, 3, 7, 15, 6, 12)
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()
    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}
