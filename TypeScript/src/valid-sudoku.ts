export type SudokuMatrix = string[][];

export class SudokuValidator {
  constructor(private readonly input: SudokuMatrix) {}

  evaluate(): string {
    return 'you should return "Valid" or "Not Valid"';
  }
}
