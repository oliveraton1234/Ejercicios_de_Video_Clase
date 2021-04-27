/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaConversor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class ControlPanel extends JPanel {
    JLabel label;
    JTextField textField;

    public ControlPanel(){

        this.setBackground(Color.RED);


        label = new JLabel("Cantidad");

        textField = new JTextField(15);
        textField.setSize(100,100);


        label.setBackground(Color.BLACK);
        label.setForeground(Color.GREEN);
        label.setOpaque(true);


        this.add(label);
        this.add(textField);
    }

    public Integer getValue(){
        return Integer.parseInt(textField.getText());
    }
}