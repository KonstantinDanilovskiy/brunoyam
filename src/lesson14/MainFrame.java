package lesson14;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Border solidBorder = BorderFactory.createLineBorder(Color.ORANGE, 4);
       // setLocationRelativeTo(null);
        setPreferredSize(new Dimension(300, 300));
        setLocation(300, 300);
        setTitle("SuperCalculator");
        Image image = Toolkit.getDefaultToolkit().getImage("calcualtor.png");
        setIconImage(image);
        MainPanel panel = new MainPanel();
        add(panel);
        pack();
    }
}

