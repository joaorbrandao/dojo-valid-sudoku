import { SudokuValidator } from '@/valid-sudoku';

describe('Valid Sudoku Unit Tests', () => {
  it('it should say it is valid', () => {
    const given = [["5","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]];

    const validator = new SudokuValidator(given);
    const result = validator.evaluate();
    expect(result).toEqual("Valid");
  });
});
