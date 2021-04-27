package PracticaDialogos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selector extends JPanel implements ActionListener {
    JRadioButton boton;

    public Selector(String titulo){

        boton = new JRadioButton(titulo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton){
            System.out.println("a");
        }
    }
}
