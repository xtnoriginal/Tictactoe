package Controller;

import Model.Game;
import Model.Result;
import View.Board;
import View.Cell;
import View.GameGUI;
import View.IntroPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Board board;
    private GameGUI gameGUI;
    private IntroPanel introPanel;
    private Game model;


    public  Controller(){

        this.board=new Board();
        this.gameGUI=new GameGUI();
        this.model=new Game();
        this.introPanel=new IntroPanel();



    }

    public  void addIntro(){

        gameGUI.add(introPanel);

        introPanel.getQuit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        introPanel.getPlay().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //remove panel
                gameGUI.remove(introPanel);
                addBoard();
                gameGUI.revalidate();
                gameGUI.pack();

                // add board
                //addBoard();
            }
        });

    }

    public void remove(Component component){

        gameGUI.remove(component);
    }

    public void addBoard(){

        gameGUI.add(board);
        addBoardUI();

    }



    void addBoardUI(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                Cell cell=new Cell(i,j);
                board.add(cell);
                cell.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        char tempChar=model.getPlayer();
                        cell.setText(tempChar+"");
                        model.set(cell.x, cell.y);
                        cell.setEnabled(false);

                        if(tempChar=='X'){
                            cell.setBackground(Color.orange);
                        }else {
                            cell.setBackground(Color.CYAN);
                        }

                        Result result=model.checkWinner();
                        if(result.isWin() && (result.getPlayer()=='X'||result.getPlayer()=='O')){
                            System.out.println(result.getPlayer());
                            JOptionPane.showMessageDialog(gameGUI,result.getPlayer()+" Wins!!!");

                            gameGUI.remove(board);
                            gameGUI.add(introPanel);
                            gameGUI.revalidate();
                            gameGUI.pack();

                        }

                        if(model.gameOver()){
                            System.out.println("Gameover!!!");
                            //gameDrawOver();
                            JOptionPane.showMessageDialog(gameGUI,"Game Over!!! Draw");
                            gameGUI.remove(board);
                            gameGUI.add(introPanel);
                            gameGUI.revalidate();
                            gameGUI.pack();
                        }


                    }
                });

            }

        }

    }


    public  void gameDrawOver(){

        gameGUI.remove(board);


    }

}