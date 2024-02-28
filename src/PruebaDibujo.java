import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        VentanaConDibujos v = new VentanaConDibujos();
        v.setVisible(true);
       //  PanelConFiguras panelFig = new PanelConFiguras();
        PanelFiguras2D panelFiguras2D = new PanelFiguras2D();
        v.add(panelFiguras2D);
    }
}

class VentanaConDibujos extends JFrame{
    public VentanaConDibujos(){
        setTitle("Ventana con dibujo");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class PanelConFiguras extends JPanel{
    public PanelConFiguras(){
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // Rectangle: Pos x, pos Y, ancho, alto
        // g.drawRect(50,50,200,200);

        // Line: Punto Inicial (x, y), Punto Final (x, y)
        // g.drawLine(100,100,300,200);

        // Arco: X, Y, Ancho arco, Alto arco, angle inicial, alto angle
        // g.drawArc(50, 100, 100,200, 120, 150);

         // Oval: X, Y, Ancho, Alto,
        // g.drawOval(100,100,130,130);

        // Oval: X, Y, Ancho, Alto, con color de fondo
        g.fillOval(100,100,130,130);

    }
}

class PanelFiguras2D extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // Sobreescribir paintComponent para utilizar figuras 2D
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D r = new Rectangle2D.Double(100,100,200,150);
        g2d.draw(r);

    }
}