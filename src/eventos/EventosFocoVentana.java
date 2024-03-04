package eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class EventosFocoVentana extends JFrame implements WindowFocusListener {
    public EventosFocoVentana(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        setTitle("Ventana con focus");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        setTitle("");
    }



    public static void main(String[] args) {
        EventosFocoVentana e1 = new EventosFocoVentana();
        e1.setBounds(100,100,600,350);
        e1.setVisible(true);

        EventosFocoVentana e2 = new EventosFocoVentana();
        e2.setBounds(800,100,600,350);
        e2.setVisible(true);
    }

}
