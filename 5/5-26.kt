fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull() ?: return

    var sumEven = 0
    var sumOdd = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            sumEven += i
        } else {
            sumOdd += i
        }
    }

    println("Сумма чётных чисел: $sumEven")
    println("Сумма нечётных чисел: $sumOdd")
}