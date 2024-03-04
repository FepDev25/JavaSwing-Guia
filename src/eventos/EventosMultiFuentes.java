package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EventosMultiFuentes {
    public static void main(String[] args) {
        VentanaMultiFuentes v = new VentanaMultiFuentes();
        v.setVisible(true);
    }
}

class VentanaMultiFuentes extends JFrame{
    public VentanaMultiFuentes(){
        setSize(650,500);
        setTitle("Multi Fuentes");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        PanelMultiFuentes panel = new PanelMultiFuentes();
        add(panel);
    }
}

class PanelMultiFuentes extends JPanel {
    JButton btn1;
    JButton btn2;
    JButton btn3;

    // Constructor de la clase PanelMultiFuentes
    public PanelMultiFuentes() {
        // Obtener los iconos redimensionados para los botones
        ImageIcon resizedIconYellow = getImageIcon("src/images/button.png");
        ImageIcon resizedIconBlue = getImageIcon("src/images/azul.png");
        ImageIcon resizedIconRed = getImageIcon("src/images/rojo.png");

        // Crear instancias de la clase ActionButtons para cada botón con diferentes parámetros
        ActionButtons ac1 = new ActionButtons("Azul", resizedIconBlue, Color.BLUE, this);
        ActionButtons ac2 = new ActionButtons("Amarillo", resizedIconYellow, Color.YELLOW, this);
        ActionButtons ac3 = new ActionButtons("Rojo", resizedIconRed, Color.RED, this);

        // Crear los botones utilizando las instancias de ActionButtons creadas anteriormente
        btn1 = new JButton(ac1);
        btn2 = new JButton(ac2);
        btn3 = new JButton(ac3);

        // Agregar los botones al panel
        add(btn1);
        add(btn2);
        add(btn3);

        // Definir el mapeo de teclas para cambiar el color de fondo del panel
        InputMap mapaEntrada  = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        // Tecla para cambiar a fondo amarillo
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
        ActionMap mapaAction = getActionMap();
        mapaAction.put("fondo_amarillo", ac2); // Asociar la acción de fondo amarillo al segundo botón

        // Tecla para cambiar a fondo azul
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        mapaEntrada.put(teclaAzul, "fondo_azul");
        ActionMap mapaAction2 = getActionMap();
        mapaAction2.put("fondo_azul", ac1); // Asociar la acción de fondo azul al primer botón

        // Tecla para cambiar a fondo rojo
        KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl R");
        mapaEntrada.put(teclaRoja, "fondo_rojo");
        ActionMap mapaAction3 = getActionMap();
        mapaAction3.put("fondo_rojo", ac3); // Asociar la acción de fondo rojo al tercer botón
    }

    // Método para redimensionar un ImageIcon
    private static ImageIcon getImageIcon(String path) {
        ImageIcon originalIcon = new ImageIcon(path);
        Image originalImage = originalIcon.getImage();
        int newWidth = 23;
        int newHeight = 23;
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}


class ActionButtons extends AbstractAction{
    JPanel panel;
    public ActionButtons(String nombre, Icon icono, Color color, JPanel panel){
        this.panel = panel;

        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Cambiar colo de fondo a " + nombre);
        putValue("colorFondo", color);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = (Color) getValue("colorFondo");
        panel.setBackground(c);
    }
}