fun main() {
    val numbers = IntArray(100) { it + 1 }
    val grouped = numbers.toList().chunked(10)
    grouped.forEachIndexed { index, group ->
        println("Группа ${index + 1}: ${group.joinToString(", ")}")
    }
}
