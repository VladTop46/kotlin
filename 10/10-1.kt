fun countdown(n: Int): List<Int> {
    return if (n > 0) (n downTo 1).toList() else emptyList()
}

fun main() {
    println(countdown(5))  // Вывод: [5, 4, 3, 2, 1]
}
