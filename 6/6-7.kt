fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val reversedNumbers = numbers.reversedArray()
    println("Реверсированный массив: ${reversedNumbers.joinToString(", ")}")
}
