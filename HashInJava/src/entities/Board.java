package entities;

public class Board {

    private final int SIZE = 3;
    private PlayerSimbol[][] position = new PlayerSimbol[SIZE][SIZE];
    private boolean[][] empty = new boolean[SIZE][SIZE];

    public PlayerSimbol getPosition(int line, int column) {
        return position[line][column];
    }

    public void setPosition(PlayerSimbol position, int line, int column) {
        this.position[line][column] = position;
    }

    public boolean getEmpty(int line, int column) {
        return empty[line][column];
    }

    public void setEmpty(boolean empty, int line, int column) {
        this.empty[line][column] = empty;
    }

    public int getSIZE() {
        return SIZE;
    }
}