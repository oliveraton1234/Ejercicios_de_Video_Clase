/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PracticaConversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class Boton extends JPanel implements ActionListener {
    JButton salir;

    public Boton(){
        this.setBackground(Color.GREEN);

        salir = new JButton("Salir");
        salir.addActionListener(this);

        this.add(salir);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == salir){
            System.exit(0);
        }
    }
}