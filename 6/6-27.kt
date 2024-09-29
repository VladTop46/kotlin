fun maxSequence(array: IntArray): Pair<Int, Int> {
    var maxLength = 0
    var currentLength = 1
    var element = array[0]
    var maxElement = element
    
    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentLength++
        } else {
            if (currentLength > maxLength) {
                maxLength = currentLength
                maxElement = array[i - 1]
            }
            currentLength = 1
        }
    }
    if (currentLength > maxLength) {
        maxLength = currentLength
        maxElement = array.last()
    }
    return Pair(maxElement, maxLength)
}

fun main() {
    val numbers = intArrayOf(1, 1, 2, 2, 2, 3, 3, 1)
    val (element, length) = maxSequence(numbers)
    println("Максимальная последовательность: $element длиной $length")
}
