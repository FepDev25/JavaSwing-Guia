package eventos;

import javax.swing.*;
import java.awt.*;

public class EventoActionListener {
    public static void main(String[] args) {
        VentanaEvento v = new VentanaEvento();
        v.setVisible(true);
    }
}


class VentanaEvento extends JFrame {
    PanelEvento p = new PanelEvento();
    public VentanaEvento(){
        setSize(600,500);
        setTitle("Ventana con evento");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(p);
    }
}

class PanelEvento extends JPanel {
    JButton btn1 = new JButton("Button");
    JButton btn2 = new JButton("Saludar");
    JButton btn3 = new JButton("Nueva ventana");
    public PanelEvento (){
        add(btn1);
        add(btn2);
        add(btn3);
        accionesBotones();
    }

    public void accionesBotones(){
        btn1.addActionListener(e -> {
            if (this.getBackground() != Color.BLUE){
                this.setBackground(Color.BLUE);
            } else{
                this.setBackground(SystemColor.window);
            }
        });
        btn2.addActionListener(e-> JOptionPane.showMessageDialog(this,"Hola!"));
        btn3.addActionListener(e-> {
            JFrame ventana = new JFrame();
            ventana.setSize(200,200);
            ventana.setTitle("Nueva ventana");
            ventana.setLocationRelativeTo(this);
            JPanel panel = new JPanel();
            panel.add(new JLabel("Esta es una nueva ventana"));
            ventana.add(panel);
            ventana.setVisible(true);
        });
    }
}