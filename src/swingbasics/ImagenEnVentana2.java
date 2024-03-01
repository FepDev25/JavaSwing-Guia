package swingbasics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagenEnVentana2 {
    public static void main(String[] args) {
        VentanaConImage2 v = new VentanaConImage2();
        v.setVisible(true);
    }
}

class VentanaConImage2 extends JFrame{
    PanelImages2 panel;
    public VentanaConImage2(){
        setSize(1000,900);
        setLocationRelativeTo(null);
        setTitle("Ventana con imagen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PanelImages2();
        add(panel);
    }
}

class PanelImages2 extends JPanel{
    private Image imagen;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miImagen = new File("src/images/batmanC.png");


        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }

        g.drawImage(imagen, 0,0,null);
        // Copiar la imagen en otras coordenadas del panel:
        g.copyArea(0,0,900,390,0,400);

        // Acceder al width y el height de una imagen:
        System.out.println(imagen.getWidth(null));
        System.out.println(imagen.getHeight(null));
    }
}
