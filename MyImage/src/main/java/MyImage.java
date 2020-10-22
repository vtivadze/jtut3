
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class MyImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        JFrame frame = new JFrame("Image");
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Graphics2D g2 = (Graphics2D) frame.getGraphics();
        
        Image imageURL = ImageIO.read(new URL("https://srs.myrusakov.ru/images/php7-cover.png"));
        Image imageFile = ImageIO.read(new File("D:\\Docs\\My_Docs\\Vakhtang_Tivadze.jpg"));
        
        Image imageSmall = imageURL.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        g2.drawImage(imageSmall, 400, 100, null);
        g2.drawImage(imageFile, 50, 50, null);
    }
    
}
