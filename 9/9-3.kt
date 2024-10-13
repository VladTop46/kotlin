fun convertCurrency(amount: Double, rate: Double): Double {
    return amount * rate
}

fun main() {
    println(convertCurrency(100.0, 0.85))  // Пример конвертации долларов в евро
}
