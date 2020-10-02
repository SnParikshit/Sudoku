package SudokuGame.BuildLogic;

import SudokuGame.ComputationLogic.GameLogic;
import SudokuGame.Persistence.LocalStorageImpl;
import SudokuGame.ProblemDomain.IStorage;
import SudokuGame.ProblemDomain.Sudoku;
import SudokuGame.UserInterface.IUserInterfaceContract;
import SudokuGame.UserInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
         Sudoku initialState;
        IStorage storage = new LocalStorageImpl();

        try{
            initialState = storage.getGameData();
        } catch(IOException e) {
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
