package Model;

public class Result {

    public Result(boolean win, char player) {
        this.win = win;
        this.player = player;
    }

    private boolean win;
    private char player;


    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }





}
