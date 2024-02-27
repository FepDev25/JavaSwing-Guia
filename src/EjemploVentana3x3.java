import javax.swing.*;
import java.awt.*;

public class EjemploVentana3x3 extends JFrame {
    JPanel panelMenu;
    Toolkit pantalla;
    Dimension misDimensiones;
    JButton buttonClientes = new JButton("Clientes");
    JButton buttonFactura = new JButton("Factura");
    JButton buttonCaja = new JButton("Caja");
    JButton buttonInventario = new JButton("Inventario");
    JButton buttonEmpleados = new JButton("Empleados");
    JButton buttonAdministration = new JButton("Administration");
    JButton buttonFinanzas = new JButton("Finanzas");
    JButton buttonAbrirCaja = new JButton("Abrir Caja");
    JButton buttonExtra = new JButton("");

    public EjemploVentana3x3(){
        // Establecer las dimensiones de la ventana
        pantalla = Toolkit.getDefaultToolkit();
        misDimensiones = pantalla.getScreenSize();
        setSize(misDimensiones.width,misDimensiones.height);

        // Basic configurations
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sistema de Tienda");
        setResizable(false);

        // Agregar panel
        this.panelMenu = new JPanel();
        this.panelMenu.setLayout(new GridLayout(3, 3));

        // Agregar botones
        agregarBotones();
        agregarEventos();

        // Agregar botones
        add(this.panelMenu);
    }

    public void agregarBotones(){
        JButton [] botones = {buttonClientes, buttonFactura, buttonCaja, buttonInventario
        ,buttonEmpleados, buttonAdministration, buttonFinanzas, buttonAbrirCaja, buttonExtra};
        for (JButton botone : botones) {
            this.panelMenu.add(botone);
        }
    }

    public void agregarEventos(){
        buttonClientes.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button clientes presionado"));
        buttonFactura.addActionListener(e -> JOptionPane.showMessageDialog(null, "Button factura presionado"));
    }

    public static void main(String[] args) {
        EjemploVentana3x3 v = new EjemploVentana3x3();
        v.setVisible(true);
    }
}
