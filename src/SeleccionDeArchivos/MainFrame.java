package SeleccionDeArchivos;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class MainFrame extends JFrame {
    Color color;

    PanelArchivos panelArchivos;
    Botones botones;
    Archivos archivos;
    PanelColor panelito;

    public MainFrame(){
        panelito = new PanelColor();


        panelArchivos = new PanelArchivos();
        this.setTitle("Seleccion de Archivos");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        botones = new Botones();

        botones.setListener(new Listener() {
            @Override
            public void abrirArchivo() {
                archivos = new Archivos();
                archivos.abrir();
                panelArchivos.nombreDelArchivo(archivos.direccion());
                MainFrame.this.setVisible(true);
            }

            @Override
            public void guardarArchivo() {
                archivos = new Archivos();
                archivos.guardar();
                panelArchivos.setNombreGuardar(archivos.direccion());
                MainFrame.this.setVisible(true);
            }

            @Override
            public void seleccionarColor() {
                //Color x = JColorChooser.showDialog(MainFrame.this,"Colores",MainFrame.this.getBackground());
                JColorChooser Selectorcolor=new JColorChooser();
                color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
                panelito.cambiarDeColor(color);

            }
        });


        this.add(panelito, BorderLayout.EAST);
        this.add(panelArchivos, BorderLayout.CENTER);
        this.add(botones, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}