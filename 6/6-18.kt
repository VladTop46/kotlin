fun main() {
    val numbers = IntArray(15) { it + 1 }
    val grouped = numbers.toList().chunked(5)
    grouped.forEachIndexed { index, group ->
        println("Группа ${index + 1}: ${group.joinToString(", ")}")
    }
}
