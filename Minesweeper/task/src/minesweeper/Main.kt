package minesweeper

fun main() {
    print("How many mines do you want on the field? > ")
    val numberOfMines = readln().toInt()
    val field = MutableList(9) { MutableList(9) {'.'} }

    repeat(numberOfMines) {
        var row = (0..8).random()
        var col = (0..8).random()

        while (field[row][col] == 'X') {
            row = (0..8).random()
            col = (0..8).random()
        }

        field[row][col] = 'X'
    }
    for (i in 0..8) {
        for (j in 0..8) {
            print(field[i][j])
        }
        println()
    }
}
