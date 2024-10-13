fun main() {
    println("Введите первое число:")
    val firstNumber = readLine()!!.toDouble()

    println("Введите оператор (+, -, *, /):")
    val operator = readLine()

    println("Введите второе число:")
    val secondNumber = readLine()!!.toDouble()

    val result = when (operator) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else "Деление на ноль невозможно"
        else -> "Некорректный оператор"
    }

    println("Результат: $result")
}