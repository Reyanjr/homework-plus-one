package plusone

class `Solution 1` {
    class solution {
        fun transpose(matrix: Array<IntArray>): Array<IntArray> {
            val rows = matrix.size
            val cols = matrix[0].size

            val transposedMatrix = Array(cols) { IntArray(rows) }

            for (i in 0 until rows) {
                for (j in 0 until cols) {
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

            val transposedMatrix = transpose(matrix)

            println("Original Matrix:")
            for (row in matrix) {
                println(row.joinToString())
            }

            println("\nTransposed Matrix:")
            for (row in transposedMatrix) {
                println(row.joinToString())
            }
        }
    }
}
