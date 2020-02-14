package entities;

import business.BoardOperations;

public class Player {

    protected PlayerSimbol simbol;

    public Player(PlayerSimbol simbol) {
        this.simbol = simbol;
    }


    public PlayerSimbol getSimbol() {
        return simbol;
    }
}

