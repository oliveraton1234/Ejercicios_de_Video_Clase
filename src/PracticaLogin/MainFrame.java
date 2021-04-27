package PracticaLogin;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    Login login;
    Botones botones;
    public MainFrame(){
        login = new Login();
        botones = new Botones();

        this.setTitle("LOGIN");
        this.setSize(1000,1000);
        //this.setResizable(false);
        //this.getContentPane().setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        botones.setListener(new Listener() {
            @Override
            public void mirarContraseña() {

                //login.mostrarContraseña();
                if (botones.seleccionado() == true){
                    login.mostrarContraseña();
                    MainFrame.this.setVisible(true);
                }else{
                    login.quitarContraseña();
                    MainFrame.this.setVisible(true);

                }
            }

            @Override
            public void verificar() {
                JOptionPane.showMessageDialog(MainFrame.this,String.format("Error 404"));
            }
        });





        this.add(login, BorderLayout.CENTER);
        this.add(botones, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
    }
}