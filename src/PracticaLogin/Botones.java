package PracticaLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JPanel {
    ImageIcon ojo;
    JButton verificar;
    JToggleButton ver;
    Listener listener;


    public Botones(){
        //ojo = new ImageIcon(getClass().getResource("a.png"));

        verificar = new JButton("Verificar");
        verificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.verificar();
            }
        });



        ver = new JToggleButton("Ver", new ImageIcon("Ojo.png"));

        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.mirarContraseña();
            }
        });

        this.add(verificar);
        this.add(ver);
    }

    public Boolean seleccionado(){
        return !ver.isSelected() ? false : true;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}