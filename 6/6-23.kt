fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val array3 = intArrayOf(7, 8, 9)
    val combinedArray = array1 + array2 + array3
    println("Объединённый массив: ${combinedArray.joinToString(", ")}")
}
