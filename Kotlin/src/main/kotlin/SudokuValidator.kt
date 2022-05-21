import kotlin.math.floor

typealias SudokuMatrix = List<List<Char>>
typealias Row = List<Char>
typealias Column = MutableList<Char>
typealias Box = MutableList<Char>


class SudokuValidator(private val input: SudokuMatrix) {
    private val BOARD_LENGTH = 9
    private val BOARD_BOXES_LENGTH = 3

    private fun hasValidMatrix(sudoku: SudokuMatrix): Boolean {
        for (row in sudoku) {
            val uniqueRowValues = mutableListOf<Char>()

            for (rowValue in row) {
                if (rowValue == '.') continue
                if (uniqueRowValues.contains(rowValue)) return false
                uniqueRowValues.add(rowValue)
            }
        }
        return true
    }

    private fun buildColumns(sudoku: SudokuMatrix): List<Column> {
        // Matrix needs to be transposed
        // 00 -> 00
        // 01 -> 10
        // 02 -> 20
        // ...
        val columns = mutableListOf<Column>()
        for (rowIndex in 0..(BOARD_LENGTH - 1)) {
            for (columnIndex in 0..(BOARD_LENGTH - 1)) {
                if (rowIndex == 0) columns.add(mutableListOf<Char>())

                val element = sudoku[rowIndex][columnIndex]
                columns[columnIndex].add(element)
            }
        }

        return columns
    }

    private fun buildBoxes(sudoku: SudokuMatrix): List<Box> {
        // Need to break rows in 3 and group them
        // [00, 01, 02, 10, 11, 12, 20, 21, 22]
        // [03, 04, 05, 13, 14, 15, 23, 24, 25]
        // [06, 07, 08, 16, 17, 18, 26, 27, 28]
        // ...
        val boxes = mutableListOf<MutableList<Char>>()
        
        for (row in 0 until sudoku.size step BOARD_BOXES_LENGTH) {
            for (column in 0 until sudoku.size step BOARD_BOXES_LENGTH) {
                val box = mutableListOf<Char>()

                for (i in 0 until BOARD_BOXES_LENGTH) {
                    val subRow = sudoku[row + i].toMutableList().subList(column, column + i)
                    box += subRow
                }
                boxes.add(box)
            }
        }

        return boxes
    }

    fun evaluate(): String {
        val rows = input.toMutableList()
        val hasValidRows = hasValidMatrix(rows)
        if (!hasValidRows) return "Not Valid"

        val columns = buildColumns(input.toMutableList())
        val hasValidColumns = hasValidMatrix(columns)
        if (!hasValidColumns) return "Not Valid"

        val boxes = buildBoxes(input.toMutableList())
        val hasValidBoxes = hasValidMatrix(boxes)
        if (!hasValidBoxes) return "Not Valid"

         return "Valid"
    }
}