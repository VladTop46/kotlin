fun arithmeticProgression(start: Int, step: Int, count: Int): IntArray {
    return IntArray(count) { start + it * step }
}

fun main() {
    val progression = arithmeticProgression(1, 2, 10)
    println("Арифметическая прогрессия: ${progression.joinToString(", ")}")
}
