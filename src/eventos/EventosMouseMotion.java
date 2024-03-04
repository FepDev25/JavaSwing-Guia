package eventos;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventosMouseMotion {
    public static void main(String[] args) {
        VentanaMotion v = new VentanaMotion();
        v.setVisible(true);
    }
}

class VentanaMotion extends JFrame{
    public VentanaMotion(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Motion Listener");
        addMouseMotionListener(new MyMouseMotionListener());
    }
}

class MyMouseMotionListener implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastrando....");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moviendo....");
    }
}