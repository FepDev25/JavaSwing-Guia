package componentesSwing;

import javax.swing.*;

public class ComboBoxSeleccionar {
    public static void main(String[] args) {
        VentanaComboBox v = new VentanaComboBox();
        v.setVisible(true);
    }
}


class VentanaComboBox extends JFrame{
    PanelComboBox panel;
    public VentanaComboBox(){
        setSize(500,500);
        setTitle("Combo Box");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PanelComboBox();
        add(panel);
    }
}

class PanelComboBox extends JPanel{
    public PanelComboBox(){

    }
}