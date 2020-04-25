package business;

import entities.Board;

import java.util.ArrayList;
import java.util.List;

public class WinnerVerify {

    /*private List<WinnerVerification> listWinner;

    public WinnerVerify()
    {
        listWinner = new ArrayList<>();

        listWinner.add(new WinnerColumn());
        listWinner.add(new WinnerLine());
        listWinner.add(new WinnerMainDiagonal());
        listWinner.add(new WinnerSecundaryDiagonal());
    }*/

    public static boolean WinnerVerification(Board board)
    {
        boolean verify, winner = false;
        List<WinnerVerification> listWinner = new ArrayList<>();

        listWinner.add(new WinnerColumn());
        listWinner.add(new WinnerLine());
        listWinner.add(new WinnerMainDiagonal());
        listWinner.add(new WinnerSecundaryDiagonal());

        for(WinnerVerification verification : listWinner)
        {
            verify = verification.WinnerVerify(board);

            if(verify == true) {
                winner = verify;
            }
        }
        return winner;
    }
}
