package eventos;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EventosFoco {
    public static void main(String[] args) {
        VentanaEventosFoco v = new VentanaEventosFoco();
        v.setVisible(true);
    }
}

class VentanaEventosFoco extends JFrame {
    MyPanelFocus panel;
    public VentanaEventosFoco(){
        setSize(500,500);
        setTitle("Eventos de foco");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new MyPanelFocus();
        add(panel);
    }
}

class MyPanelFocus extends JPanel{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField c1;
    JTextField c2;
    JTextField c3;
    JButton button;
    public MyPanelFocus(){
        setLayout(null);
        c1 = new JTextField();
        c2 = new JTextField();
        c3 = new JTextField();
        l1 = new JLabel("Nombre:");
        l2 = new JLabel("Correo");
        l3 = new JLabel("Carrera");
        button = new JButton("Aceptar");

        l1.setBounds(0,10,150,20);
        c1.setBounds(120,10,150,20);
        l2.setBounds(0,50,150,20);
        c2.setBounds(120,50,150,20);
        l3.setBounds(0,90,150,20);
        c3.setBounds(120,90,150,20);
        button.setBounds(120,130,150,20);

        c2.addFocusListener(new MyFocusEvents(c2));

        button.addActionListener(e -> registrar());

        add(l1);
        add(c1);
        add(l2);
        add(c2);
        add(l3);
        add(c3);
        add(button);
    }

    public void registrar(){
        String name = this.c1.getText();
        String correo = this.c2.getText();
        String carrera = this.c3.getText();

        JOptionPane.showMessageDialog(null,"Registro exitoso: " + name + "\n" +
                correo + "\n" +carrera);
    }
}



class MyFocusEvents implements FocusListener{
    JTextField fieldCorreo;
    public MyFocusEvents(JTextField  fieldCorreo){
        this.fieldCorreo = fieldCorreo;
    }
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Focus ganado ");
    }

    @Override
    public void focusLost(FocusEvent e) {
        String correo = this.fieldCorreo.getText();

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if (!matcher.find()){
            JOptionPane.showMessageDialog(null,"Correo incorrecto");
        }
    }
}