package SudokuGame.UserInterface;

import SudokuGame.ProblemDomain.Sudoku;

public interface IUserInterfaceContract {
    interface EventListener {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(Sudoku game);
        void showDialog(String message);
        void showError(String message);
    }
}
