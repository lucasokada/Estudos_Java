package business;

import entities.Board;
import entities.PlayerSimbol;

public class WinnerMainDiagonal implements WinnerVerification{

    @Override
    public boolean WinnerVerify(Board board) {
        return board.getPosition(0, 0).
                equals(board.getPosition(1, 1)) && board.
                getPosition(0, 0).
                equals(board.getPosition(2, 2)) && board.
                getPosition(0, 0) != PlayerSimbol.__;
    }
}
