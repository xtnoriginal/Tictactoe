package Model;

import java.util.Arrays;

public class Game {

    private  Grid grid;
    private  int counter;
    char player='X';

    public  Game (){
        counter=9;
        this.grid=new Grid();

    }

    public Result checkWinner(){

        if(counter>6) return  new Result(false,' ');
        return grid.checkIfWinner();
    }


    public  boolean gameOver(){
        if(counter==0) return true;
        return false;
    }

    private  void changePlayer(){

        if(player=='X'){
            player='O';
        }else {
            player='X';
        }

    }

    public char getPlayer(){
        return player;
    }
    public void set(int x,int y){
        counter--;
        grid.setXY(x,y,player);
        changePlayer();
    }


    public  void newGame(){

        counter=9;
        grid=new Grid();

    }



}
