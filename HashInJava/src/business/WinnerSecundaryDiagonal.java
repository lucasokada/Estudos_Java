package business;

import entities.Board;
import entities.PlayerSimbol;

public class WinnerSecundaryDiagonal implements WinnerVerification{


    @Override
    public boolean WinnerVerify(Board board) {
        return board.getPosition(0, 2).
                equals(board.getPosition(1, 1)) && board.
                getPosition(0, 2).
                equals(board.getPosition(2, 0)) && board.
                getPosition(1, 1) != PlayerSimbol.__;
    }
}
