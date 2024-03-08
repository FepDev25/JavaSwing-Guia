package componentesSwing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuadrosDeTexto {
    public static void main(String[] args) {
        VentanaCuadrosTexto v = new VentanaCuadrosTexto();
        v.setVisible(true);
    }
}

class VentanaCuadrosTexto extends JFrame{
    PanelCuadrosTexto panel;
    public VentanaCuadrosTexto(){
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Cuadros de texto");
        panel = new PanelCuadrosTexto();
        add(panel);
    }
}

class PanelCuadrosTexto extends JPanel {
    JTextField textField;
    JTextField textFieldCorreo;
    JLabel labelCorreo;
    JButton button;
    JButton button2;
    JButton buttonCorreo;
    public PanelCuadrosTexto(){
        BorderLayout borderLayout = new BorderLayout();

        FlowLayout flowLayout = new FlowLayout();
        JPanel panelPruebas = new JPanel(flowLayout);

        FlowLayout flowLayout2 = new FlowLayout();
        JPanel panelCorreo = new JPanel(flowLayout2);

        textField = new JTextField("Texto por defecto", 30);
        button = new JButton("Mostrar Mensaje");
        button2 = new JButton("Set Mensaje");
        button.addActionListener(e -> JOptionPane.showMessageDialog(null, textField.getText()));
        button2.addActionListener(e -> textField.setText("Este es mi mensaje, me llamo Felipe"));
        panelPruebas.add(textField);
        panelPruebas.add(button);
        panelPruebas.add(button2);

        labelCorreo = new JLabel("Introducir Correo: ");
        textFieldCorreo = new JTextField(20);
        buttonCorreo = new JButton("Aceptar");
        buttonCorreo.addActionListener(e -> validarCorreo());
        panelCorreo.add(labelCorreo);
        panelCorreo.add(textFieldCorreo);
        panelCorreo.add(buttonCorreo);

        // Primer forma de eventos:
        EscuchaTexto escuchaTexto = new EscuchaTexto();
        textField.getDocument().addDocumentListener(escuchaTexto);

        // Segunda forma de eventos:
        textFieldCorreo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Escribiendo en campo correo");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Borrando en campo correo");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        setLayout(borderLayout);
        add(panelPruebas, BorderLayout.NORTH);
        add(panelCorreo, BorderLayout.CENTER);
    }

    public void validarCorreo(){
        String email = textFieldCorreo.getText();

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            JOptionPane.showMessageDialog(null, "El correo electrónico es válido.");
        } else {
            JOptionPane.showMessageDialog(null, "El correo electrónico no es válido.");
        }
    }
}

class EscuchaTexto implements DocumentListener{

    @Override
    public void insertUpdate(DocumentEvent e) {
        System.out.println("Introduciendo texto");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("Borrando texto");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}