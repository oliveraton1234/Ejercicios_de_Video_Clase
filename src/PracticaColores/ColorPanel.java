package PracticaColores;

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
    ColorPanel(){
        super.setLayout(new BorderLayout());

        super.setBackground(new Color(0,0,0));
        super.setLayout(new FlowLayout(FlowLayout.CENTER));

        super.setPreferredSize(new Dimension(50,50));
    }
}