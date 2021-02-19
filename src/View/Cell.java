package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cell extends JButton implements ActionListener {

    private int  x,y;
    public Cell(int x, int y){
        this.x=x;
        this.y=y;

        //set the action listener to this class
        addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("what");
        setText("X");
        setEnabled(false);


    }
}
