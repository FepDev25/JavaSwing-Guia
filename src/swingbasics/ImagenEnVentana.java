package swingbasics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagenEnVentana {
    public static void main(String[] args) {
        VentanaConImage v = new VentanaConImage();
        v.setVisible(true);
    }
}

class VentanaConImage extends JFrame{
    PanelImages panel;
    public VentanaConImage(){
        setSize(730,730);
        setLocationRelativeTo(null);
        setTitle("Ventana con imagen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PanelImages();
        add(panel);
    }
}

class PanelImages extends JPanel{
    private Image imagen;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miImagen = new File("src/images/batman3.jpeg");


        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }

        g.drawImage(imagen, 1,1,null);

    }
}
