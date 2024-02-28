package swingbasics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class VentanaFigurasConColores {
    public static void main(String[] args) {
        VentanaConColores ventanaConColores = new VentanaConColores();
        ventanaConColores.setVisible(true);
    }
}

class VentanaConColores extends JFrame {
    PanelColores panelColores;
    public VentanaConColores(){
        setSize(500,500);
        panelColores = new PanelColores();
        add(panelColores);
        setTitle("Ventana con colores");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class PanelColores extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));

        // Establecer el color para los objetos, su usa fill
        g2d.setPaint(Color.BLUE);
        Rectangle2D rectangle2D = new Rectangle2D.Double(50,50,200,150);
        g2d.fill(rectangle2D);

        // Cambiar de color
        g2d.setPaint(new Color(78,65,88).brighter().brighter()); // Utilizando constructor, existe brighter y darker
        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rectangle2D);
        g2d.fill(ellipse2D);

        // Otra manera usando constructor:
        Color color1 = new Color(33,120,33).brighter();
        color1.brighter();
        this.setBackground(color1); // Agregar nuevo color al fondo de todo el panel

        // this.setBackground(SystemColor.window); Darle el color de fondo igual al color del sistema del SO
    }

}
