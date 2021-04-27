package SeleccionDeArchivos;

import javax.swing.*;

public class Archivos extends JFileChooser {

    public Archivos(){
        //this.showSaveDialog(null);
    }

    public void abrir(){
        this.showOpenDialog(null);
    }

    public String direccion(){
        return this.getSelectedFile().getAbsolutePath();
    }

    public void guardar(){
        this.showSaveDialog(null);
    }

}