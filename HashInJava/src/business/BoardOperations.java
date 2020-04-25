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
}
