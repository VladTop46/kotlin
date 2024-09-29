fun removeElement(array: IntArray, element: Int): IntArray {
    return array.filter { it != element }.toIntArray()
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val elementToRemove = 3
    val newArray = removeElement(numbers, elementToRemove)
    println("Массив после удаления $elementToRemove: ${newArray.joinToString(", ")}")
}
