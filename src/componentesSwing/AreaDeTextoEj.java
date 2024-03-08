package componentesSwing;

import javax.swing.*;
import java.awt.*;

public class AreaDeTextoEj {
    public static void main(String[] args) {
        VentanaAreaEj v = new VentanaAreaEj();
        v.setVisible(true);
    }
}


class VentanaAreaEj extends JFrame{
    JPanel panelNorte;
    JPanel panelSur;
    JButton buttonInsertar;
    JButton buttonSaltoLine;
    JTextArea area;
    public VentanaAreaEj(){
        setSize(500,500);
        setTitle("Ejemplo Text Area");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        area = new JTextArea(20,30);
        JScrollPane pane = new JScrollPane(area);
        panelNorte = new JPanel();
        panelNorte.add(pane);

        panelSur = new JPanel();
        buttonInsertar = new JButton("Insertar");
        buttonSaltoLine = new JButton("Salto Line");
        buttonInsertar.addActionListener(e -> area.append("En un lugar de la cabeza de HP Lovecraft..."));
        buttonSaltoLine.addActionListener(e -> {
            boolean saltar = !area.getLineWrap();
            area.setLineWrap(saltar);
            buttonSaltoLine.setText(saltar ? "Quitar salto" : "Salto Line");
        });
        panelSur.add(buttonInsertar);
        panelSur.add(buttonSaltoLine);

        add(panelNorte, BorderLayout.NORTH);
        add(panelSur,BorderLayout.SOUTH);
    }
}

