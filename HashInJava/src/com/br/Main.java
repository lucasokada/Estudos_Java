package com.br;

import business.BoardOperations;
import business.PlayerOperations;
import entities.Board;
import entities.Player;
import entities.PlayerSimbol;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Board board = BoardOperations.initializeBoard();
        Player player1 = new Player(PlayerSimbol.x);
        Player player2 = new Player(PlayerSimbol.o);
        boolean winner = false;
        boolean draw = false;

        while(winner == false && draw == false){

            if(winner == false && draw == false){
                System.out.println("player x");
                printBoard(board);
                winner = playerMove(input, board, player1);
                draw = PlayerOperations.draw(board, winner);
            }

            System.out.println();

            if(winner == false && draw == false){
                System.out.println("player o");
                printBoard(board);
                winner = playerMove(input, board, player2);
                draw = PlayerOperations.draw(board, winner);
            }

            if(draw == true)
            {
                System.out.println("DRAW");
            }
        }

        printBoard(board);

    }

    public static void printBoard(Board board)
    {
        int i, j;

        for(i=0; i<board.getSIZE(); i++)
        {
            for (j = 0; j < board.getSIZE(); j++)
            {
                System.out.print(board.getPosition(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static boolean verifyValidValue(int i, int j)
    {
        boolean valid = i < 3 && i >= 0 && j < 3 && j >= 0 ? true : false;

        if(valid == false){
            System.out.println("invald position, try again");
        }

        return valid;
    }

    public static boolean playerMove(Scanner input, Board board, Player player)
    {
        int i = 0, j = 0;
        boolean validPosition = false;
        boolean winner;

        while(validPosition == false) {
            System.out.println("enter the coordenates (x, y)");

            i = input.nextInt();
            j = input.nextInt();
            validPosition = verifyValidValue(i, j);
        }

        PlayerOperations.move(player, board, i, j);
        winner = PlayerOperations.verifyWinner(board);

        if(winner == true){
            System.out.println("the player " + player.getSimbol() + " win!");
        }

        return winner;
    }
}






