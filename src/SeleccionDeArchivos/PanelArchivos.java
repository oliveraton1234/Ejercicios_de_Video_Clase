package SeleccionDeArchivos;

import javax.swing.*;

public class PanelArchivos extends JPanel {
    JLabel adjuntar;
    JTextField nombre;

    JLabel guardar;
    JTextField nombreGuardar;

    public PanelArchivos(){
        adjuntar = new JLabel("Adjuntar Archivos");
        nombre = new JTextField(15);

        guardar = new JLabel("Guardar archivo");
        nombreGuardar = new JTextField(15);

        this.add(adjuntar);
        this.add(nombre);
        this.add(guardar);
        this.add(nombreGuardar);

    }

    public void nombreDelArchivo(String direccion){
        nombre.setText(direccion);
    }

    public void setNombreGuardar(String direccion){
        nombreGuardar.setText(direccion);
    }

}