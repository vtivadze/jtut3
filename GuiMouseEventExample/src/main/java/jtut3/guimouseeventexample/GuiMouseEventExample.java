/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimouseeventexample;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class GuiMouseEventExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("My Window");
        frame.setBounds(100, 100, 850, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() != MouseEvent.BUTTON1) {
                    return;
                }
                
                int i = frame.mouseClickCounter++;
                
                if (i == frame.buttonMaxCount) {
                    JOptionPane.showMessageDialog(frame, "Max count of buttons is " + frame.buttonMaxCount);
                    return;
                }
                
                int x = e.getX();
                int y = e.getY();
                
                frame.button[i] = new JButton("Button_" + i);
                frame.button[i].setBounds(x, y, 100, 50);
                frame.add(frame.button[i]);
                frame.repaint();
            }
        });
        
        frame.setVisible(true);
    }
    
}
