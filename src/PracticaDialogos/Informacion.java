package PracticaDialogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Informacion extends JPanel implements ActionListener {

    JLabel label;
    JLabel titulo;
    JTextField textField;
    JTextField tittle;
    JRadioButton informacion;
    JRadioButton pregunta;
    JRadioButton precaucion;
    JRadioButton error;

    public Informacion(){
        label = new JLabel("Mensaje:");
        titulo = new JLabel("TITULO");
        textField = new JTextField(50);
        tittle = new JTextField(50);

        informacion = new JRadioButton("Informacion");
        pregunta = new JRadioButton("Pregunta");
        precaucion = new JRadioButton("Precaucion");
        error = new JRadioButton("Error");


        informacion.addActionListener(this);
        pregunta.addActionListener(this);
        precaucion.addActionListener(this);
        error.addActionListener(this);

        ButtonGroup grupo = new ButtonGroup();

        grupo.add(informacion);
        grupo.add(pregunta);
        grupo.add(precaucion);
        grupo.add(error);

        this.add(informacion);
        this.add(pregunta);
        this.add(precaucion);
        this.add(error);
        this.add(label);
        this.add(textField);
        this.add(titulo);
        this.add(tittle);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == informacion){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.INFORMATION_MESSAGE);
        }if (actionEvent.getSource() == pregunta){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.QUESTION_MESSAGE);
        }if (actionEvent.getSource() == precaucion){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.WARNING_MESSAGE);
        }if (actionEvent.getSource() == error){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.ERROR_MESSAGE);
        }
    }
}
