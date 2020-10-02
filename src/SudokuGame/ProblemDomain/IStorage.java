package SudokuGame.ProblemDomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(Sudoku game) throws IOException;
    Sudoku getGameData() throws IOException;
}
