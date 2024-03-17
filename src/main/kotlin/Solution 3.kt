class `Solution 3` {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = HashSet<String>()

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val value = board[i][j]
                if (value != '.') {
                    if (!seen.add("$value в строке $i") ||
                        !seen.add("$value в столбце $j") ||
                        !seen.add("$value в подсети ${i / 3}-${j / 3}")
                    ) {
                        return false
                    }
                }
            }
        }

        return true
    }

    fun main() {
        val board = arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )

        println(isValidSudoku(board)) // Output: true
    }

}