fun areEqual(a: Int, b: Int): Boolean {
    return a == b
}

fun main() {
    println("Введите первое число:")
    val firstNumber = readLine()!!.toInt()
    println("Введите второе число:")
    val secondNumber = readLine()!!.toInt()

    val result = areEqual(firstNumber, secondNumber)
    println("Числа равны: $result")
}