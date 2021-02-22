package View;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel  extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        ImageIcon bgImage = new ImageIcon("background.jpg");

        g.drawImage(bgImage.getImage(), 0, 0, null);
    }
}
