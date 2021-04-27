package PracticaColores;

import javax.swing.*;
import java.awt.*;

public class Spinner extends JPanel {
    JSpinner espiner;

    public Spinner(){
        espiner = new JSpinner();
        this.setBackground(Color.pink);
        this.add(espiner);
    }

    public Integer valor(){
        return espiner.getHeight();
    }

    public void resetear(Integer x){
        espiner.setValue(x);
    }


}