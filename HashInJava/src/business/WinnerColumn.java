package business;

import entities.Board;
import entities.PlayerSimbol;

public class WinnerColumn implements WinnerVerification{

    @Override
    public boolean WinnerVerify(Board board)
    {
        boolean filled = false;
        int i, j = 0;

        while(j < board.getSIZE() && !filled)
        {
            i=0;
            if(board.getPosition(i, j).equals(board.getPosition(i+1, j)) && board.getPosition(i, j).equals(board.getPosition(i+2, j)) && board.getPosition(i, j) != PlayerSimbol.__){
                filled = true;
            }
            j++;
        }

        return filled;
    }
}
