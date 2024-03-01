package eventos;

import javax.swing.*;
import java.awt.event.*;

public class EventoWindowListener {
    public static void main(String[] args) {
        VentanaWListener v = new VentanaWListener();
        v.setVisible(true);
    }
}

class VentanaWListener extends JFrame {
    PanelWListener panel = new PanelWListener();

    public VentanaWListener(){
        setSize(500,500);
        setTitle("Ventana con window listener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Agregamos el WindowListener a la ventana
        addWindowListener(new MiWindowListener());

        add(panel);
    }
}

// Clase interna para manejar eventos de ventana
class MiWindowListener implements WindowListener {
    // Implementación de los métodos de la interfaz WindowListener
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana cerrándose");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
}

class PanelWListener extends JPanel{
    public PanelWListener(){
        add(new JLabel("Ventana con Window Listener"));
    }
}
