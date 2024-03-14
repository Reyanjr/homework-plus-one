fun main (args: Array<String>) {
    class Solution {
        fun transpose(matrix: Array<IntArray>): Array<IntArray> {
            val ans: Array<IntArray> = Array(matrix[0].size) { IntArray(matrix.size) { 0 } }
            for (i: Int in 0 until matrix.size) {
                for (j: Int in 0 until matrix[0].size) {
                    ans[j][i] = matrix[i][j]
                }
            }

            return ans
        }
    }
}