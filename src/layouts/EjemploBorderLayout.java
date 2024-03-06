package layouts;

import javax.swing.*;
import java.awt.*;

public class EjemploBorderLayout {
    public static void main(String[] args) {
        VentanaBorder v = new VentanaBorder();
        v.setVisible(true);
    }
}

class VentanaBorder extends JFrame{
    public VentanaBorder(){
        setSize(400,400);
        setTitle("Ventana BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        PanelBorder panel = new PanelBorder();
        add(panel);
    }
}

class PanelBorder extends JPanel{
    public PanelBorder(){
        setLayout(new BorderLayout(10,10));

        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Azul"),BorderLayout.SOUTH);
        add(new JButton("Rojo"),BorderLayout.EAST);
        add(new JButton("Verde"),BorderLayout.WEST);
        add(new JButton("Morado"),BorderLayout.CENTER);
    }
}