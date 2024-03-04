package eventos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventosTeclado {
    public static void main(String[] args) {
        VentanaEventosTeclado v = new VentanaEventosTeclado();
        v.setVisible(true);
    }
}

class VentanaEventosTeclado extends JFrame {
    public VentanaEventosTeclado(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Eventos del teclado");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(new MyEventosTeclado());
    }
}

class MyEventosTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        // Cuando una tecla es pulsada y levantada
        System.out.println("Pulsado y levantado: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Cuando una tecla es pulsada

        // Por cada tecla que se pulsa, se imprime su code interno
        int code = e.getKeyCode();
        System.out.println("code: " + code);

        if (code == KeyEvent.VK_F){
            JOptionPane.showMessageDialog(null, "Ha pulsado la letra F");
        }

        if (code == KeyEvent.VK_3){
            JOptionPane.showMessageDialog(null, "Ha pulsado el 3");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Cuando una tecla es levantada
        System.out.println("Tecla levantada: " + e.getKeyChar());
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_F){
            System.out.println("Tecla levantada F");
        }
    }
}