package swingbasics;

import javax.swing.*;
import java.awt.*;

public class VentanaConPanel {
    public static void main(String[] args) {
        MarcoConTexto v = new MarcoConTexto();


    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        // Configuraciones del Frame
         setSize(500,400);
         setLocationRelativeTo(null);
         setTitle("Ventana que contiene un texto");
         setResizable(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         add(new MiPanel());
        setVisible(true);
    }
}

class MiPanel extends JPanel{
    public MiPanel(){
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Me llamo Felipe", 100,100);
    }
}