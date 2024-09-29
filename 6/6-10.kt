fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumEven = numbers.filter { it % 2 == 0 }.sum()
    println("Сумма чётных чисел: $sumEven")
}
