/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.mygraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class MyGraphics extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MyGraphics();
    }
    
    public MyGraphics() {
        super("Graphics");
        setBounds(100, 100, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100, 100, 200, 200);
    }
    
}
