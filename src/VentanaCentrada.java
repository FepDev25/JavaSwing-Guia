import javax.swing.*;
import java.awt.*;

public class VentanaCentrada {
    public static void main(String[] args) {
        MiVentanaCentrada v = new MiVentanaCentrada();
    }
}

class MiVentanaCentrada extends JFrame {
    public MiVentanaCentrada() throws HeadlessException {
        Toolkit miPantalla;
        Dimension miSize;
        Image miIcono;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        miPantalla = Toolkit.getDefaultToolkit();
        miSize = miPantalla.getScreenSize();
        setSize(miSize.width/2, miSize.height/2);
        setLocation(miSize.width/4, miSize.height/4);
        //setLocationRelativeTo(null);
        setTitle("Ventana centrada");
        miIcono = miPantalla.getImage("icono.jpeg");
        setIconImage(miIcono);
    }
}