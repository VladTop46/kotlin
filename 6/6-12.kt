fun swapElements(array: IntArray, index1: Int, index2: Int) {
    if (index1 in array.indices && index2 in array.indices) {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    }
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("Массив до перестановки: ${numbers.joinToString(", ")}")
    swapElements(numbers, 1, 3)
    println("Массив после перестановки: ${numbers.joinToString(", ")}")
}
