package swingbasics;

import java.awt.*;

public class Pruebas {
    public static void main(String[] args) {
        String[] nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombreFuente : nombreFuentes) {
            System.out.println("nombreFuente = " + nombreFuente);
        }
    }
}
