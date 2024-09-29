fun main() {
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    val copiedArray = originalArray.copyOf()
    println("Скопированный массив: ${copiedArray.joinToString(", ")}")
}
