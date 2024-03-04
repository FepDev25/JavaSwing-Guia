package eventos;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventosMouse {
    public static void main(String[] args) {
        VentanaEventosMouse v = new VentanaEventosMouse();
        v.setVisible(true);
    }
}

class VentanaEventosMouse extends JFrame{
    public VentanaEventosMouse(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Eventos del mouse");
        setLocationRelativeTo(null);
        PanelEventosMouse panel = new PanelEventosMouse();
        add(panel);
    }
}

class PanelEventosMouse extends JPanel{
    JButton btn;
    public PanelEventosMouse(){
        btn = new JButton("Button");
        add(btn);
        btn.addMouseListener(new MyEventosMouse());
    }
}

class MyEventosMouse implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Acabo de hacer click");
        System.out.println("Coordenada x: " + e.getX());
        System.out.println("Coordenada y: " + e.getY());
        System.out.println("Number of clicks: " + e.getClickCount());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Hacer pressed en el button");
        System.out.println("Constantes: " + e.getModifiersEx());
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){ // 1024
            System.out.println("Button izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){ // 2048
            System.out.println("Pulsaste la rueda");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Button derecho");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Levanto el click del button");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Flotando encima del button");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Saliendo del flote del button");
    }
}