fun secondMax(array: IntArray): Int? {
    val sortedUnique = array.distinct().sortedDescending()
    return if (sortedUnique.size >= 2) sortedUnique[1] else null
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 6)
    val secondMaxElement = secondMax(numbers)
    println("Второй по величине элемент: $secondMaxElement")
}
