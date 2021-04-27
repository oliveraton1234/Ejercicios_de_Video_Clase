package PracticaDialogos;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    Informacion info;
    public MainFrame(){

        info = new Informacion();
        this.setTitle("DIALOGOS");
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(info);
    }
}