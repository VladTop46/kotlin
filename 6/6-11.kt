fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(4, 5, 6, 7, 8)
    val intersection = array1.intersect(array2.toList())
    println("Пересечение массивов: ${intersection.joinToString(", ")}")
}
