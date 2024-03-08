package componentesSwing;

import javax.swing.*;

public class AreaDeTexto {
    public static void main(String[] args) {
        VentanaArea v = new VentanaArea();
        v.setVisible(true);
    }
}


class VentanaArea extends JFrame{
    PanelArea panel;
    public VentanaArea(){
        setSize(500,500);
        setTitle("Area de texto");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new PanelArea();
        add(panel);
    }
}

class PanelArea extends JPanel{
    JTextArea area;
    public PanelArea(){
        JButton button = new JButton("Mostar");
        area = new JTextArea(8,20);
        area.setLineWrap(true);
        JScrollPane panelScroll = new JScrollPane(area);
        button.addActionListener(e -> JOptionPane.showMessageDialog(null, area.getText()));

        add(panelScroll);
        add(button);
    }
}