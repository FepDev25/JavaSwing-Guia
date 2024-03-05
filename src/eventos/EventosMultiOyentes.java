package eventos;

import javax.swing.*;

public class EventosMultiOyentes {
    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
    }
}

class VentanaPrincipal extends JFrame {
    MyPanelPrincipal panel;
    public VentanaPrincipal(){
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Multi Oyentes");
        panel = new MyPanelPrincipal();
        add(panel);
    }
}


class MyPanelPrincipal extends JPanel{
    JButton btnCrear;
    JButton btnCerrarTodo;
    public MyPanelPrincipal(){
        btnCrear = new JButton("Crear Nuevo");
        btnCerrarTodo = new JButton("Cerrar Todos");

        btnCrear.addActionListener(e -> {
            VentanaEmergente v = new VentanaEmergente(btnCerrarTodo);
            v.setVisible(true);
        });

        add(btnCrear);
        add(btnCerrarTodo);
    }
}

class VentanaEmergente extends JFrame{
    public static int CONTADOR = 1;
    int id;

    public VentanaEmergente(JButton buttonCerrar){
        id = VentanaEmergente.CONTADOR ++;
        setTitle("Ventana " + id);
        setBounds(40*id, 40*id,300,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buttonCerrar.addActionListener(e -> {
            dispose();
            VentanaEmergente.CONTADOR = 1;
        });
    }
}