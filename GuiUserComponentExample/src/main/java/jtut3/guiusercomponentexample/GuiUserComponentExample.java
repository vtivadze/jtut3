/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guiusercomponentexample;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class GuiUserComponentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(000, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ((JFrame) e.getSource()).requestFocus();
            }
        });
        
        MyComponent login = new MyComponent("Login");
        login.setBounds(300, 150, 200, 20);
        frame.add(login);
        
        login.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ((MyComponent) e.getSource()).setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                MyComponent source = (MyComponent) e.getSource();
                source.setText(source.defaultText);
            }
        });
        
        frame.setVisible(true);
        frame.requestFocus();
    }
    
}
