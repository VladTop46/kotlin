fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull() ?: return

    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    println("Сумма ряда: $sum")
}
