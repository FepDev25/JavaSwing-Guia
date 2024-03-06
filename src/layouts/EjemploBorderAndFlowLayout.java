package layouts;

import javax.swing.*;
import java.awt.*;

public class EjemploBorderAndFlowLayout {
    public static void main(String[] args) {
        VentanaBorderFlow v = new VentanaBorderFlow();
        v.setVisible(true);
    }
}

class VentanaBorderFlow extends JFrame {
    public VentanaBorderFlow(){
        setSize(400,400);
        setTitle("Ventana BorderLayout y FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        PanelBorderFlow p = new PanelBorderFlow();
        add(p);
    }
}

class PanelBorderFlow extends JPanel {
    public PanelBorderFlow() {
        JPanel panelBotones = new JPanel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 12,12);
        panelBotones.setLayout(flowLayout);
        panelBotones.add(new JButton("Verde"));
        panelBotones.add(new JButton("Amarillo"));
        panelBotones.add(new JButton("Azul"));

        BorderLayout borderLayout = new BorderLayout(10,10);
        setLayout(borderLayout);
        add(panelBotones, BorderLayout.NORTH);
        add(new JButton("Negro"), BorderLayout.CENTER);
        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Naranja"), BorderLayout.EAST);
        add(new JButton("Celeste"), BorderLayout.SOUTH);


    }
}
