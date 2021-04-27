package PracticaLogin;

import javax.swing.*;

public class Login extends JPanel {
    JLabel user;
    JLabel password;
    JTextField usuario;
    JPasswordField contraseña;
    JLabel contraseñaDescubierta;

    public Login(){
        user = new JLabel("Usuario");
        password = new JLabel("Contraseña");

        usuario = new JTextField(15);
        contraseña = new JPasswordField(15);
        contraseñaDescubierta = new JLabel();

        this.add(user);
        this.add(usuario);

        this.add(password);
        this.add(contraseña);


    }

    public void mostrarContraseña(){
        String x = String.valueOf(contraseña.getPassword());
        contraseñaDescubierta = new JLabel(x);
        super.add(contraseñaDescubierta);

    }

    public void quitarContraseña(){
        contraseñaDescubierta.setText("");

    }
}