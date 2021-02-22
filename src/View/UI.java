package View;

import Model.Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private  GameGUI  game;
    private  IntroPanel introPanel;
    private Board board;
    private Game model;


    public  UI (){
        this.game=new GameGUI();
        this.board=new Board();
        this.introPanel=new IntroPanel();
        this.model=new Game();
        addBoardUI();
        game.add(board);
    }


    void addBoardUI(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                Cell cell=new Cell(i,j);
                board.add(cell);
                cell.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        cell.setText(model.getPlayer()+"");
                        model.set(cell.x, cell.y);
                        cell.setEnabled(false);
                    }
                });

            }

        }

    }




}
