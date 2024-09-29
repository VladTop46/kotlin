fun mergeSortedArrays(array1: IntArray, array2: IntArray): IntArray {
    return (array1 + array2).sortedArray()
}

fun main() {
    val array1 = intArrayOf(1, 3, 5)
    val array2 = intArrayOf(2, 4, 6)
    val mergedArray = mergeSortedArrays(array1, array2)
    println("Слитый массив: ${mergedArray.joinToString(", ")}")
}
