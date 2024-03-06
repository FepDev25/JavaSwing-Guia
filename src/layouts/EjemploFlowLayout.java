package layouts;

import javax.swing.*;
import java.awt.*;

public class EjemploFlowLayout {
    public static void main(String[] args) {
        VentanaFlow v = new VentanaFlow();
        v.setVisible(true);
    }
}

class VentanaFlow extends JFrame{
    public VentanaFlow(){
        setSize(400,400);
        setTitle("Ventana FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        PanelFlow panelFlow = new PanelFlow();
        add(panelFlow);
    }
}

class PanelFlow extends JPanel{
    public PanelFlow(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 5,5));

        add(new JButton("Amarillo"));
        add(new JButton("Azul"));
        add(new JButton("Rojo"));
    }
}