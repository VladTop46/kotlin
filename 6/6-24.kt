fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val cols = matrix[0].size
    val transposedMatrix = Array(cols) { IntArray(rows) }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    return transposedMatrix
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    val transposed = transposeMatrix(matrix)
    transposed.forEach { row ->
        println(row.joinToString(" "))
    }
}
