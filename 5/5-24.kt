fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val cols = matrix[0].size
    val transposedMatrix = Array(cols) { IntArray(rows) }

    for (i in matrix.indices) {
        for (j in matrix.indices) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    return transposedMatrix
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val transposed = transposeMatrix(matrix)
    println("Транспонированая матрица:")
    for (row in transposed) {
        println(row.joinToString(" "))
    }
}