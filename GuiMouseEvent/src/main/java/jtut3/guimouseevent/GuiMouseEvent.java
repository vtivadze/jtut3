/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimouseevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class GuiMouseEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
                System.out.println(e.getX() + " " + e.getY());
                switch(e.getButton()) {
                    case MouseEvent.BUTTON1:
                        System.out.println("Clicked left button");
                        break;
                    case MouseEvent.BUTTON2:
                        System.out.println("Clicked middle button");
                        break;
                    case MouseEvent.BUTTON3:
                        System.out.println("Clicked right button");
                        break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // System.out.println("Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // System.out.println("Mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // System.out.println("Mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // System.out.println("Mouse exited");
            }
        });
        
        frame.setVisible(true);
    }
    
}
