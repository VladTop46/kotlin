fun main() {
    val numbers = intArrayOf(1, 2, 2, 3, 4, 4, 5)
    val uniqueNumbers = numbers.distinct()
    println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")
}
