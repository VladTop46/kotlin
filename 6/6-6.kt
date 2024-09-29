fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val oddNumbers = numbers.filter { it % 2 != 0 }
    println("Чётные числа: ${evenNumbers.joinToString(", ")}")
    println("Нечётные числа: ${oddNumbers.joinToString(", ")}")
}
