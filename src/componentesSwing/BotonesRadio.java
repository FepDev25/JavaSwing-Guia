package componentesSwing;

import javax.swing.*;
import java.awt.*;

public class BotonesRadio {
    public static void main(String[] args) {
        VentanaBotonesRadio v = new VentanaBotonesRadio();
        v.setVisible(true);
    }
}

class VentanaBotonesRadio extends JFrame{
    PanelBotonesRadio panel;
    public VentanaBotonesRadio(){
        setSize(500,200);
        setTitle("Ejemplo Radio Botones");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new PanelBotonesRadio();
        add(panel);
    }
}

class PanelBotonesRadio extends JPanel{
    JRadioButton azul = new JRadioButton("Azul", false);
    JRadioButton amarillo = new JRadioButton("Amarillo", false);
    JRadioButton rojo = new JRadioButton("Rojo", false);

    JRadioButton frase1 = new JRadioButton("Frase 1", false);
    JRadioButton frase2 = new JRadioButton("Frase 2", false);
    JRadioButton frase3 = new JRadioButton("Frase 3", false);
    JRadioButton size1 = new JRadioButton("Size small", false);
    JRadioButton size2 = new JRadioButton("Size medium", false);
    JRadioButton size3 = new JRadioButton("Size Big", false);
    JLabel label;
    public PanelBotonesRadio(){
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        label = new JLabel("Frases...");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelColores = crearPanelConRadioBotones(amarillo,azul,rojo);
        JPanel panelFrases = crearPanelConRadioBotones(frase1, frase2, frase3);
        JPanel panelSize = crearPanelConRadioBotones(size1,size2,size3);
        JPanel panelCentro = new JPanel(new GridLayout(3,1));
        panelCentro.add(panelFrases);
        panelCentro.add(panelColores);
        panelCentro.add(panelSize);

        actionsRadioButtons();

        add(label, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
    }

    public void actionsRadioButtons(){
        amarillo.addActionListener(e -> setBackground(Color.YELLOW));
        azul.addActionListener(e -> setBackground(Color.BLUE));
        rojo.addActionListener(e -> setBackground(Color.RED));

        frase1.addActionListener(e -> label.setText("El pulpo gigante debajo del Mar"));
        frase2.addActionListener(e -> label.setText("The crazy Arabian man!"));
        frase3.addActionListener(e -> label.setText("El color que vino del cielo"));

        size1.addActionListener(e -> label.setFont(new Font("Arial", Font.BOLD, 10)));
        size2.addActionListener(e -> label.setFont(new Font("Arial", Font.BOLD, 20)));
        size3.addActionListener(e -> label.setFont(new Font("Arial", Font.BOLD, 30)));
    }

    public JPanel crearPanelConRadioBotones(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3){
        JPanel panel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        buttonGroup.add(radio3);
        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);
        return panel;
    }
}