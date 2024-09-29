fun median(array: IntArray): Double {
    val sortedArray = array.sorted()
    val middle = sortedArray.size / 2
    return if (sortedArray.size % 2 == 0) {
        (sortedArray[middle - 1] + sortedArray[middle]) / 2.0
    } else {
        sortedArray[middle].toDouble()
    }
}

fun main() {
    val numbers = intArrayOf(1, 3, 5, 7, 9)
    println("Медиана: ${median(numbers)}")
}
