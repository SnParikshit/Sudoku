package SudokuGame.ProblemDomain;



import SudokuGame.ComputationLogic.SudokuUtilities;
import SudokuGame.constant.GameState;

import java.io.Serializable;

public class Sudoku implements Serializable {
    private final GameState gameState;
    private final int[][] gridstate;

    public static final int GRID_BOUNDARY = 9;

    public Sudoku(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridstate = gridState;
    }

    public int[][] getGridstate() {
        return gridstate;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridstate);
    }

    public GameState getGameState() {
        return gameState;
    }
}
