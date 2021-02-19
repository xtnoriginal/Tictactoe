package View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements  ActionListener{

    public  Board(){

        setLayout(new GridLayout(3,3));

        for (int i = 0; i <3 ; i++) {

            for (int j = 0; j <3 ; j++) {

                add(new Cell(i,j));

            }

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("yes ---");

    }
}
