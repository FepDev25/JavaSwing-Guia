package eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class ControladorEstadoVentana {
    public static void main(String[] args) {
        VentanaEstado v= new VentanaEstado();
        v.setVisible(true);
    }
}

class VentanaEstado extends JFrame{
    public VentanaEstado(){
        setSize(400,400);
        setTitle("Controlador Ventana estado");
        setLocationRelativeTo(null);
        addWindowStateListener(new CambioEstado());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class CambioEstado implements WindowStateListener{
    // Invocado cuando la ventana cambia su estado
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        if (e.getNewState() == JFrame.MAXIMIZED_BOTH){ // 6
            System.out.println("Pantalla completa");
        } else if (e.getNewState() == JFrame.ICONIFIED){ // 1
            System.out.println("Minimizar la pantalla");
        }  else if (e.getNewState() == JFrame.NORMAL){ // 0
            System.out.println("Estado normal");
        }

    }
}
