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

public class Moneda extends JPanel implements ActionListener{
    public final Double btcToMxn = 1244716.20;

    JComboBox comboBox;
    ControlPanel panel;
    MonedaListener listener;
    JLabel cantidad;


    public Moneda(){
        this.setBackground(Color.PINK);

        String[] monedas = {"MXN a BTC", "BTC a MXN"};

        comboBox = new JComboBox(monedas);
        panel = new ControlPanel();
        cantidad = new JLabel("$0.00");

        comboBox.setSelectedIndex(-1);
        comboBox.addActionListener(this);


        this.add(comboBox);
        this.add(panel);
        this.add(cantidad);


    }


    public void setListener(MonedaListener listener) {
        this.listener = listener;
    }

    public void limpiarCantidad(){
        cantidad.setText("$0.00");
    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == comboBox){
            if (comboBox.getSelectedIndex() == 0){
                limpiarCantidad();
                double x = panel.getValue() / btcToMxn;
                cantidad.setText(String.format("Tienes un total de $%f BTC",x));

            }else{
                limpiarCantidad();
                double x = panel.getValue() * btcToMxn;
                cantidad.setText(String.format("Tienes un total de $%f pesos Mexicanos",x));
            }
        }
    }
}