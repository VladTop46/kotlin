fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    val numbers = intArrayOf(56, 23, 89, 12, 45, 67, 34, 78)
    println("До сортировки: ${numbers.joinToString(",")}")
    bubbleSort(numbers)
    println("После сортировки: ${numbers.joinToString(",")}")

}