package Model;

import java.util.Arrays;

/***
 * @author  Claudios Nhemwa
 * @date 21 Feb 2021
 * Class is the grid of the  game where all user inputs  is
 * simulated
 */

public class Grid {

    private char [][]  grid;

    public  Grid(){
        grid=new char[3][3];
        populate();
    }


    void populate(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {

                grid[i][j]='@';

            }
        }


    }


    /***
     *
     * @param x
     * @param y
     * @param player
     *
     * class to set a part of the grid.
     */
    public  void  setXY(int x,int y, char player){

        grid[x][y]=player;

    }


    public  Result checkIfWinner(){
        for (int i = 0; i < 3; i++) {
            if(grid[i][0]!='@'&&grid[i][0]==grid[i][1] && grid[i][1]==grid[i][2]){
                return new Result(true,grid[i][0]);
            }

        }

        for (int i = 0; i < 3; i++) {
            if(grid[0][i]!='@'&& grid[0][i]==grid[1][i] && grid[1][i]==grid[2][i] ){

                return new Result(true,grid[i][0]);
            }

        }


        if(grid[0][0]!='@'&& grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2]){
            if(grid[0][0]!=' ') return new Result(true,grid[0][0]);
        }

        if(grid[0][2]!='@'&&grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0]){
            if(grid[0][2]!=' ') return new Result(true,grid[0][0]);

            return new Result(true,grid[0][2]);
        }




        return new Result(false,' ');




    }




    /***
     *
     * @return  string of the grid.
     */
    @Override
    public String toString() {
        String temp="";

        for (int i = 0; i < 3; i++) {

            temp+=Arrays.toString(grid[i])+'\n';

        }

        return  temp;
    }




}
