package SeleccionDeArchivos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JPanel {
    JButton archivo;
    JButton guardar;
    JButton color;
    Listener listener;

    public Botones(){
        archivo = new JButton("...");
        archivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.abrirArchivo();
            }
        });

        guardar = new JButton("Guardar");
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.guardarArchivo();
            }
        });

        color = new JButton("Selecionar COlor");
        color.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.seleccionarColor();
            }
        });

        this.add(archivo);
        this.add(guardar);
        this.add(color);

    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}