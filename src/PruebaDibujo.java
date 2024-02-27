import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        VentanaConDibujos v = new VentanaConDibujos();
        v.setVisible(true);
    }
}

class VentanaConDibujos extends JFrame{
    public VentanaConDibujos(){
        setTitle("Ventana con dibujo");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
