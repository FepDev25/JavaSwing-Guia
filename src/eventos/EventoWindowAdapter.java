package eventos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventoWindowAdapter {
    public static void main(String[] args) {
        VentanaWindowAdapter v = new VentanaWindowAdapter();
        v.setVisible(true);
    }
}

class VentanaWindowAdapter extends JFrame {
    PanelWindowAdapter panel;
    public VentanaWindowAdapter(){
        setSize(400,400);
        setTitle("Window Adapter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowListener(new MyWindowAdapter());
        panel = new PanelWindowAdapter();
        add(panel);
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada ");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada ");
    }
}

class PanelWindowAdapter extends JPanel{
    public PanelWindowAdapter(){
        add(new JLabel("Window Adapter"));
    }
}