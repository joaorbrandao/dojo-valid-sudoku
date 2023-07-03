using System.Text.Json;
using Friday.Sudoku;

var sudokuMatrix = JsonSerializer.Deserialize<string[][]>(args.FirstOrDefault() ?? string.Empty); 

var game = new SudokuValidator(sudokuMatrix);
var result = game.Evaluate();
Console.WriteLine(result);