package Menus;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MainFrame extends JFrame {

    private MenuBar baresito;

    public MainFrame() {
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        baresito = new MenuBar();
        baresito.setListener(new MenuBarListener() {
            @Override
            public void miNuevoButtonClick() {
                JOptionPane.showMessageDialog(MainFrame.this,
                        "Vas a crear un nuevo archivo",
                        "Nuevo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            @Override
            public void miAbrirButtonClick() {
                JOptionPane.showMessageDialog(MainFrame.this,
                        "Abriendo archivo",
                        "Abrir",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            @Override
            public void miSalirButtonClick() {
                System.exit(0);
            }

            @Override
            public void miAcercaDeButtonClick() {
                JOptionPane.showMessageDialog(MainFrame.this,
                        "Acerca de nosotros",
                        "Acerca de",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
        this.add(baresito, BorderLayout.NORTH);

        this.setVisible(true);
    }

}