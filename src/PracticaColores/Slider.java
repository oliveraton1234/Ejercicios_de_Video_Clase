package PracticaColores;

import javax.swing.*;
import java.awt.*;

public class Slider extends JPanel {
    JSlider eslaider;

    public Slider(){
        eslaider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        this.setBackground(Color.RED);
        this.add(eslaider);
    }

    public Integer valor(){
        return eslaider.getValue();
    }

    public void resetear(Integer x){
        eslaider.setValue(x);
    }
}