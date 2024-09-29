fun main() {
    val numbers = intArrayOf(1, 3, 4, 6, 7, 9, 11, 12, 14, 15)
    val divisibleByThree = numbers.filter { it % 3 == 0 }
    println("Числа, делящиеся на 3: ${divisibleByThree.joinToString(", ")}")
}
