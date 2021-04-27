package SeleccionDeArchivos;

import javax.swing.*;
import java.awt.*;

public class PanelColor extends JPanel {

    public PanelColor(){
        this.setBackground(Color.BLACK);
        this.setSize(100,200);
    }

    public void cambiarDeColor(Color a){
        this.setBackground(a);
    }
}