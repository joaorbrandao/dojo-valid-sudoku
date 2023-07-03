namespace Friday.Sudoku;

public class SudokuValidator
{
    private string[][] _sudokuMatrix;
    
    public SudokuValidator(string[][] sudokuMatrix)
    {
        _sudokuMatrix = sudokuMatrix;
    }
    
    public string Evaluate()
    {
        return "you should return Valid or Not Valid";
    }
}