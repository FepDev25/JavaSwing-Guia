package componentesSwing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuadrosDeTextoEj {
    public static void main(String[] args) {
        VentanaEjCuadros v = new VentanaEjCuadros();
        v.setVisible(true);
    }
}

class VentanaEjCuadros extends JFrame{
    PanelEjemploCuadros panel;
    public VentanaEjCuadros(){
        setSize(330,300);
        setTitle("Formulario Registro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new PanelEjemploCuadros();
        add(panel);
    }
}
class PanelEjemploCuadros extends JPanel {
    BorderLayout borderLayout;
    JLabel labelNombre;
    JLabel labelCorreo;
    JLabel labelPassword;
    JTextField fieldNombre;
    JTextField fieldCorreo;
    JPasswordField fieldPassword;
    JButton buttonAceptar;
    public PanelEjemploCuadros(){
        borderLayout = new BorderLayout();
        setLayout(borderLayout);

        labelNombre = new JLabel("Nombre:");
        labelCorreo = new JLabel("Correo:");
        labelPassword = new JLabel("Password: ");

        fieldNombre = new JTextField(20);
        fieldCorreo = new JTextField(20);
        fieldPassword = new JPasswordField(20);

        FlowLayout f1 = new FlowLayout();
        JPanel panelNombre = new JPanel(f1);
        panelNombre.add(labelNombre);
        panelNombre.add(fieldNombre);

        FlowLayout f2 = new FlowLayout();
        JPanel panelCorreo = new JPanel(f2);
        panelCorreo.add(labelCorreo);
        panelCorreo.add(fieldCorreo);

        FlowLayout f3 = new FlowLayout();
        JPanel panelPassword = new JPanel(f3);
        panelPassword.add(labelPassword);
        panelPassword.add(fieldPassword);

        escuchadorPassword();

        buttonAceptar = new JButton("Registrar");
        buttonAceptar.addActionListener(e-> registrar());

        JPanel panelForms = new JPanel();
        panelForms.setLayout(new BoxLayout(panelForms,BoxLayout.Y_AXIS));
        panelForms.add(panelNombre);
        panelForms.add(panelCorreo);
        panelForms.add(panelPassword);

        add(panelForms, BorderLayout.CENTER);
        add(buttonAceptar, BorderLayout.SOUTH);
    }

    public void escuchadorPassword(){
        fieldPassword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                action();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                action();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }

            public void action(){
                int longitud = fieldPassword.getPassword().length;
                if ((longitud < 8)  || (longitud > 14)){
                    fieldPassword.setBackground(Color.RED);
                } else{
                    fieldPassword.setBackground(Color.GREEN);
                }
            }
        });
    }

    public void registrar(){
        String email = fieldCorreo.getText();
        int longitud = fieldPassword.getPassword().length;
        boolean passValid = (longitud >= 8)  && (longitud <= 14);

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()){
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido.");
        }

        if (!passValid){
            JOptionPane.showMessageDialog(null, "Password no cumple con la condition");
        }

        if (matcher.matches() && passValid) {
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            fieldPassword.setText("");
            fieldCorreo.setText("");
            fieldNombre.setText("");
            fieldPassword.setBackground(Color.WHITE);

        }
    }
}