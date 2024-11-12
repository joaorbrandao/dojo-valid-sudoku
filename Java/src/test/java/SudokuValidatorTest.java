import io.github.joaorbrandao.SudokuValidator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SudokuValidatorTest {
    @Test
    void itShouldSayItIsValid() {
        List<List<Character>> given = List.of(
            List.of('5','3','.','.','7','.','.','.','.')
            ,List.of('6','.','.','1','9','5','.','.','.')
            ,List.of('.','9','8','.','.','.','.','6','.')
            ,List.of('8','.','.','.','6','.','.','.','3')
            ,List.of('4','.','.','8','.','3','.','.','1')
            ,List.of('7','.','.','.','2','.','.','.','6')
            ,List.of('.','6','.','.','.','.','2','8','.')
            ,List.of('.','.','.','4','1','9','.','.','5')
            ,List.of('.','.','.','.','8','.','.','7','9')
        );

        var validator = new SudokuValidator(given);
        var result = validator.evaluate();
        assertEquals("Valid", result);
    }
}
