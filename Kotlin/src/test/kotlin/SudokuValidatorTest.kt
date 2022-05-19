import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SudokuValidatorTest {
    @Test
    fun `it should say it is valid`() {
        val given = listOf(
            listOf('5','3','.','.','7','.','.','.','.')
                ,listOf('6','.','.','1','9','5','.','.','.')
                ,listOf('.','9','8','.','.','.','.','6','.')
                ,listOf('8','.','.','.','6','.','.','.','3')
                ,listOf('4','.','.','8','.','3','.','.','1')
                ,listOf('7','.','.','.','2','.','.','.','6')
                ,listOf('.','6','.','.','.','.','2','8','.')
                ,listOf('.','.','.','4','1','9','.','.','5')
                ,listOf('.','.','.','.','8','.','.','7','9')
        )

        val validator = SudokuValidator(given)
        val result = validator.evaluate()
        assertEquals("Valid", result)
    }
}