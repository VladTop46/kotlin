fun findMinNumber(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}

fun main() {
    println("Введите список чисел (через пробел):")
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val minNumber = findMinNumber(numbers)
    println("Самое маленькое число: $minNumber")
}