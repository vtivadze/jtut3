/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guikeyevent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class GuiKeyEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // System.out.println("Key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // System.out.println("Key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if (keyCode == 27) {
                    System.exit(0);
                }
                
            }
        });
        
        frame.setVisible(true);
    }
    
}
