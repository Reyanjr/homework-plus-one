class `solution 1` {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val numRows = matrix.size
        val numCols = matrix[0].size

        val transposedMatrix = Array(numCols) { IntArray(numRows) }

        for (i in 0 until numRows) {
            for (j in 0 until numCols) {
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

        val transposedMatrix = transpose(matrix)

        for (row in transposedMatrix) {
            println(row.joinToString())
        }
    }

}