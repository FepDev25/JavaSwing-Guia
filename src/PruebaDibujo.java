import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        VentanaConDibujos v = new VentanaConDibujos();
        v.setVisible(true);
        PanelConFiguras panelFig = new PanelConFiguras();
        v.add(panelFig);
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