fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val concatenatedArray = array1 + array2
    println("Конкатенированный массив: ${concatenatedArray.joinToString(", ")}")
}
