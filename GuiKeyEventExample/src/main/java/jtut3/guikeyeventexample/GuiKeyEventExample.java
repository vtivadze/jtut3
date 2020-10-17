/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guikeyeventexample;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class GuiKeyEventExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JButton bt = new JButton("Move It");
        bt.setBounds(100, 100, 100, 50);
        frame.add(bt);
        
        bt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                final int keyCodeLeft = 37;
                final int keyCodeUp = 38;
                final int keyCodeRight = 39;
                final int keyCodeDown = 40;
                
                int keyCode = e.getKeyCode();
                
                int x = bt.getX();
                int y = bt.getY();
                
                int step = 5;
                
                switch(keyCode) {
                    case keyCodeLeft:
                        x -= step;
                        break;
                    case keyCodeUp:
                        y -= step;
                        break;
                    case keyCodeRight:
                        x += step;
                        break;
                    case keyCodeDown:
                        y += step;
                        break;
                }
                
                bt.setBounds(x, y, bt.getWidth(), bt.getHeight());
            }
        });
        
        
        frame.setVisible(true);
    }
    
}
