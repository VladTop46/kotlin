fun main() {
    println("Введите целое число:")
    val number = readLine()?.toIntOrNull() ?: return

    val binary = Integer.toBinaryString(number)
    println("Двоичное представление числа $number: $binary")
}