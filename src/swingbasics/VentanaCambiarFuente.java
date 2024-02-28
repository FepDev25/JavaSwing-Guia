package swingbasics;

import javax.swing.*;
import java.awt.*;

public class VentanaCambiarFuente {
    public static void main(String[] args) {
        VentanaFuentes v =  new VentanaFuentes();
        v.setVisible(true);
    }
}

class VentanaFuentes extends JFrame{
    PanelFuentes panel;
    public VentanaFuentes(){
        setSize(500,500);
        setTitle("Cambiando fuentes");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panel = new PanelFuentes();
        add(panel);
    }
}

class PanelFuentes extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // crear la fuente
        Font fuente = new Font("Arial", Font.BOLD, 13);
        // Asignar Fuente
        g2d.setFont(fuente);
        g2d.setPaint(Color.GREEN);
        // Escribir
        g2d.drawString("Me llamo Felipe", 100,100);

        // Otro string con distinta fuente y color
        g2d.setPaint(Color.RED);
        g2d.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
        g2d.drawString("Tengo 19 years old", 100,200);
    }
}
