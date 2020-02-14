package business;

import entities.Board;
import entities.Player;
import entities.PlayerSimbol;

public class BoardOperations{

    public static Board initializeBoard()
    {
        Board board = new Board();
        int i, j;
        PlayerSimbol[][] position = new PlayerSimbol[board.getSIZE()][board.getSIZE()];
        boolean[][] empty = new boolean[board.getSIZE()][board.getSIZE()];

        for(i=0; i<board.getSIZE(); i++)
        {
            for(j=0; j<board.getSIZE(); j++)
            {
                board.setPosition(PlayerSimbol.__, i, j);
                board.setEmpty(true, i, j);
            }
        }

        return board;
    }

    public static boolean verifyPosition(Board board, int line, int column)
    {
        return board.getEmpty(line, column);
    }

    public static boolean verifyLines(Board board)
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

    public static boolean verifyColumns(Board board)
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

    public static boolean verifyMainDiagonal(Board board)
    {
        return board.getPosition(0, 0).equals(board.getPosition(1, 1)) && board.getPosition(0, 0).equals(board.getPosition(2, 2)) && board.getPosition(0, 0) != PlayerSimbol.__;
    }

    public static boolean verifySecundaryDiagonal(Board board)
    {
        return board.getPosition(0, 2).equals(board.getPosition(1, 1)) && board.getPosition(0, 2).equals(board.getPosition(2, 0)) && board.getPosition(1, 1) != PlayerSimbol.__;
    }
}
