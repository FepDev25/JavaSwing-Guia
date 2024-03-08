package componentesSwing;

import javax.swing.*;
import java.awt.*;

public class CheckBoxSeleccionar {
    public static void main(String[] args) {
        VentanaCheck v = new VentanaCheck();
        v.setVisible(true);
    }
}

class VentanaCheck extends JFrame {
    JLabel label;
    JCheckBox check1, check2;
    Font fuente = new Font("Serif", Font.PLAIN, 24);
    public VentanaCheck(){
        setSize(500,500);
        setTitle("Ejemplo Checks");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label = new JLabel("El Chelsea FC es el mejor equipo del mundo");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(fuente);
        add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        check1 = new JCheckBox("Negrita");
        check1.addActionListener(e -> actionsChecks());
        check2 = new JCheckBox("Cursiva");
        check2.addActionListener(e -> actionsChecks());
        panel.add(check1);
        panel.add(check2);

        add(panel, BorderLayout.SOUTH);
    }

    public void actionsChecks(){
        int tipo = 0;
        if (check1.isSelected())  tipo += Font.BOLD;
        if (check2.isSelected()) tipo += Font.ITALIC;

        label.setFont(new Font("Serif", tipo, 24));
    }
}
