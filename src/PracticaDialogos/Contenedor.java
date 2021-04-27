package Practica04Dialogos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenedor extends JPanel implements ActionListener {
    Selector informacion;

    public Contenedor(){
        informacion = new Selector("Informacion");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == informacion){
            System.out.println("a");
        }
    }
}