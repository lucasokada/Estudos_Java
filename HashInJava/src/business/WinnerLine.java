package business;

import entities.Board;
import entities.PlayerSimbol;

public class WinnerLine implements WinnerVerification{


    @Override
    public boolean WinnerVerify(Board board)
    {
        boolean filled = false;
        int i = 0, j;

        while(i < board.getSIZE() && !filled)
        {
            j=0;
            if(board.getPosition(i, j).equals(board.getPosition(i, j+1)) && board.getPosition(i, j).equals(board.getPosition(i, j+2)) && board.getPosition(i, j) != PlayerSimbol.__){
                filled = true;
            }
            i++;
        }

        return filled;
    }
}
