package business;

import entities.Board;
import entities.Player;
import entities.PlayerSimbol;

import javax.swing.*;

public class PlayerOperations extends Player{

    public PlayerOperations(PlayerSimbol simbol) {
        super(simbol);
    }

    public static void move(Player player, Board board, int line, int column)
    {
        boolean free = BoardOperations.verifyPosition(board, line, column);

        if(free == true){
            board.setPosition(player.getSimbol(), line, column);
            board.setEmpty(false, line, column);
        }else{
            System.out.println("that position is occupied");
        }
    }

    public static boolean verifyWinner(Board board)
    {
        boolean winner = false;

        if(!winner){
            winner = BoardOperations.verifyLines(board);
        }
        if(!winner){
            winner = BoardOperations.verifyColumns(board);
        }
        if(!winner){
            winner = BoardOperations.verifyMainDiagonal(board);
        }
        if(!winner){
            winner = BoardOperations.verifySecundaryDiagonal(board);
        }

        return winner;
    }

    public static boolean draw(Board board, boolean winner)
    {
        int count = 0;
        boolean draw = false;

        for(int i=0; i < board.getSIZE(); i++)
        {
            for(int j=0; j < board.getSIZE(); j++)
            {
                if(board.getPosition(i ,j) != PlayerSimbol.__){
                   count++;
                }
            }
        }

        if(count == 9 && winner)
        {
            draw = true;
            System.out.println("DRAW");
        }

        return draw;
    }
}
