fun main() {
    println("Введите количество чисел N:")
    val n = readLine()?.toIntOrNull() ?: return

    val numbers = mutableListOf<Int>()
    println("Введите $n чисел:")
    repeat(n) {
        numbers.add(readLine()?.toIntOrNull() ?: return)
    }

    numbers.sort()
    println("Числа в порядке возрастания: ${numbers.joinToString(", ")}")
}