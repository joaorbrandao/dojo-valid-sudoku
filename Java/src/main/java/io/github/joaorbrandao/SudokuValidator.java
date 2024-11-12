package io.github.joaorbrandao;

import java.util.List;

public class SudokuValidator {
    private List<List<Character>> input;

    public SudokuValidator(List<List<Character>> input) {
        this.input = input;
    }

    public String evaluate() {
        return "you should return 'Valid' or 'Not Valid'";
    }
}
