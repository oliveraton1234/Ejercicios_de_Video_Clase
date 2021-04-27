/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaConversor;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class MainFrame extends JFrame {

    Boton boton;
    Moneda moneda;

    public MainFrame(){
        boton = new Boton();
        moneda = new Moneda();

        this.setTitle("CONVERSOR");
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.BLUE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        this.add(boton, BorderLayout.SOUTH);
        this.add(moneda, BorderLayout.CENTER);


        this.setVisible(true);
    }
}
