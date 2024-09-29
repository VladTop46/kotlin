fun linearSearch(array: IntArray, element: Int): Boolean {
    return array.contains(element)
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Введите число для поиска:")
    val target = readLine()?.toIntOrNull()
    if (target != null) {
        val isFound = linearSearch(numbers, target)
        println("Число найдено: $isFound")
    }
}
