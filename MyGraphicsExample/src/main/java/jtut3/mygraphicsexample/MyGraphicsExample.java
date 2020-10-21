/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.mygraphicsexample;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MyGraphicsExample extends JFrame {
    int x, y, w, h;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RectangeException {
        try {
            String xStr = JOptionPane.showInputDialog(null, "Etner coordinate X:");
            String yStr = JOptionPane.showInputDialog(null, "Enter coordinate Y:");
            String wStr = JOptionPane.showInputDialog(null, "Enter width:");
            String hStr = JOptionPane.showInputDialog(null, "Enter height:");
            
            if (xStr == null || yStr == null || wStr == null || hStr == null) throw new RectangeException(RectangeException.NO_PARAMETER);
            if (xStr.equals("") || yStr.equals("") || wStr.equals("") || hStr.equals("")) throw new RectangeException(RectangeException.EMPTY_PARAMETER);
            
            int x = Integer.parseInt(xStr);
            int y = Integer.parseInt(yStr);
            int w = Integer.parseInt(wStr);
            int h = Integer.parseInt(hStr);
            
            new MyGraphicsExample(x, y, w, h);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public MyGraphicsExample(int x, int y, int w, int h) {
        super("Graphics");
        
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        setBounds(100, 100, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(x, y, w, h);
    }
    
}
