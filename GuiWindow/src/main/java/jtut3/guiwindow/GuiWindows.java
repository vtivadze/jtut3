/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guiwindow;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class GuiWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Program");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
//        frame.setLocation(0, 0);
//        frame.setSize(size);

//        frame.setBounds(0, 0, size.width, size.height);

        frame.setBounds(300, 300, 450, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
