import javax.swing.*;

public class Ventana {
    public static void main(String[] args) {
        // Instancia de la ventana
        MiVentana v1 = new MiVentana();
    }
}

class MiVentana extends JFrame{
    public MiVentana() {
        // Dar dimension a la ventana:
        // setSize(700,400);
        // Darle location:
        // setLocation(500,300);
        // Dare location y dimension
        setBounds(500,300,700,400);
        // Hacer que sea visible
        setVisible(true);
        // Indicarle operation al cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Indicar que no se puede cambiar de dimension
        setResizable(false);
        // Que se inicie con el size max
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Darle un title
        setTitle("Mi ventana");
    }
}