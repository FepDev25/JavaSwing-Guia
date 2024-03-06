package layouts;

import javax.swing.*;
import java.awt.*;

public class EjemploGridLayout {
    public static void main(String[] args) {
        VentanaGrid v = new VentanaGrid();
        v.setVisible(true);
    }
}

class VentanaGrid extends JFrame {
    public VentanaGrid(){
        setSize(450,600);
        setTitle("Ventana GridLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        PanelGrid p = new PanelGrid();
        add(p);
    }
}

class PanelGrid extends JPanel{
    EjemploGridControl control;
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonPoint = new JButton(".");
    JButton button10 = new JButton("x10");
    JButton buttonDEL = new JButton("DEL");
    JButton buttonAC = new JButton("AC");
    JButton buttonX = new JButton("x");
    JButton buttonPlus = new JButton("+");
    JButton buttonDiv = new JButton("/");
    JButton buttonMinus = new JButton("-");
    JButton buttonANS = new JButton("ANS");
    JButton buttonIgual = new JButton("=");
    BorderLayout borderLayout;
    GridLayout gridLayout;
    JPanel panelTeclas;
    JTextArea area;

    public PanelGrid(){
        borderLayout = new BorderLayout();
        setLayout(borderLayout);
        area = new JTextArea();
        control = new EjemploGridControl(area);

        gridLayout = new GridLayout(4,5);
        panelTeclas = new JPanel(gridLayout);

        add(area, BorderLayout.NORTH);
        add(panelTeclas, BorderLayout.CENTER);

        inicializarBotones();
        agregarActions();

    }

    public void inicializarBotones(){
        panelTeclas.add(button7);
        panelTeclas.add(button8);
        panelTeclas.add(button9);
        panelTeclas.add(buttonDEL);
        panelTeclas.add(buttonAC);

        panelTeclas.add(button4);
        panelTeclas.add(button5);
        panelTeclas.add(button6);
        panelTeclas.add(buttonX);
        panelTeclas.add(buttonDiv);

        panelTeclas.add(button1);
        panelTeclas.add(button2);
        panelTeclas.add(button3);
        panelTeclas.add(buttonPlus);
        panelTeclas.add(buttonMinus);

        panelTeclas.add(button0);
        panelTeclas.add(buttonPoint);
        panelTeclas.add(button10);
        panelTeclas.add(buttonANS);
        panelTeclas.add(buttonIgual);
    }

    public void agregarActions(){
        button1.addActionListener(e -> control.action1());
        button2.addActionListener(e -> control.action2());
        button3.addActionListener(e -> control.action3());
        button4.addActionListener(e -> control.action4());
        button5.addActionListener(e -> control.action5());
        button6.addActionListener(e -> control.action6());
        button7.addActionListener(e -> control.action7());
        button8.addActionListener(e -> control.action8());
        button9.addActionListener(e -> control.action9());
        button0.addActionListener(e -> control.action0());

        button10.addActionListener(e -> control.action10());
        buttonANS.addActionListener(e -> control.actionANS());
        buttonAC.addActionListener(e -> control.actionAC());
        buttonDEL.addActionListener(e -> control.actionDEL());
        buttonPoint.addActionListener(e -> control.actionPoint());

        buttonPlus.addActionListener(e -> control.actionPlus());
        buttonMinus.addActionListener(e -> control.actionMinus());
        buttonX.addActionListener(e -> control.actionX());
        buttonDiv.addActionListener(e -> control.actionDiv());
        buttonIgual.addActionListener(e -> control.actionIgual());
    }
}
