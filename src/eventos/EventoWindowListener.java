package eventos;

import javax.swing.*;
import java.awt.event.*;

public class EventoWindowListener {
    public static void main(String[] args) {
        VentanaWListener v = new VentanaWListener("Ventana Principal");
        v.setTitle("Ventana Principal");
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setBounds(50,200,500,500);
        v.setVisible(true);

        VentanaWListener v2 = new VentanaWListener("Ventana secundaria");
        v2.setTitle("Ventana Secundaria");
        v2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v2.setBounds(750,200,500,500);
        v2.setVisible(true);
    }
}

class VentanaWListener extends JFrame {


    public VentanaWListener(String nombre){
        PanelWListener panel = new PanelWListener(nombre);
        // Agregamos el WindowListener a la ventana
        addWindowListener(new MiWindowListener(nombre));

        add(panel);
    }
}

// Clase interna para manejar eventos de ventana
class MiWindowListener implements WindowListener {
    // Implementación de los métodos de la interfaz WindowListener
    String nombre;
    public MiWindowListener(String nombre){
        this.nombre = nombre;
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta " + this.nombre);
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana cerrándose " + this.nombre);
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada " + this.nombre);
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada " + this.nombre);
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada " + this.nombre);
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada " + this.nombre);
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada " + this.nombre);
    }
}

class PanelWListener extends JPanel{
    public PanelWListener(String textoLabel){
        add(new JLabel(textoLabel));
    }
}
