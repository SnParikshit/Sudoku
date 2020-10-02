package SudokuGame.ComputationLogic;

import SudokuGame.ProblemDomain.Sudoku;

public class SudokuUtilities {
    public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray){
        for(int xIndex =0; xIndex< Sudoku.GRID_BOUNDARY; xIndex++){
            for(int yIndex=0; yIndex< Sudoku.GRID_BOUNDARY; yIndex++){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }

    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[Sudoku.GRID_BOUNDARY][Sudoku.GRID_BOUNDARY];

        for(int xIndex = 0; xIndex< Sudoku.GRID_BOUNDARY; xIndex++){
            for(int yIndex = 0; yIndex< Sudoku.GRID_BOUNDARY; yIndex++){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }

        return newArray;
    }
}
