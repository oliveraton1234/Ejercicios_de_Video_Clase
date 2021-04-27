package PracticaColores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JPanel {
    private JButton btnGenerar;

    private BInterface listener;


    public Botones() {
        super.setLayout(new GridLayout(2,1, 10, 20));

        btnGenerar = new JButton("Generar");
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.generar();
            }
        });

        super.add(btnGenerar);
    }


    public void setListener(BInterface listener) {
        this.listener = listener;
    }
}