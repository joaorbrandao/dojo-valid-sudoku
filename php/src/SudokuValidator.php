<?php

namespace TwentyFiveFriday;

class SudokuValidator
{
    /**
     * @param string[][] $sudoku
     */
    public function __construct(private array $sudoku) {}
    
    public function validate(): string {
        return 'you should return "Valid" or "Not Valid"';
    }
}