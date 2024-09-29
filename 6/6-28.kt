fun main() {
    println("Введите числа через пробел:")
    val input = readLine()
    if (input != null) {
        val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }.toIntArray()
        println("Введённый массив: ${numbers.joinToString(", ")}")
    }
}
