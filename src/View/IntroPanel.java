package View;

import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel {

    private JButton play;
    private JButton quit;

    public IntroPanel(){
        this.play=new JButton();
        this.quit=new JButton();


        add(play);
        add(quit);





    }


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        ImageIcon bgImage = new ImageIcon("background.jpg");

        g.drawImage(bgImage.getImage(), 0, 0, null);
    }

    public JButton getPlay() {
        return play;
    }

    public void setPlay(JButton play) {
        this.play = play;
    }

    public JButton getQuit() {
        return quit;
    }

    public void setQuit(JButton quit) {
        this.quit = quit;
    }


}
