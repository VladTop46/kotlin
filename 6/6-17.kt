fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val sum = numbers.sum()
    val product = numbers.fold(1) { acc, num -> acc * num }
    println("Сумма элементов: $sum")
    println("Произведение элементов: $product")
}
