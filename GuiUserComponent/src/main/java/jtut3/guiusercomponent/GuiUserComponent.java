/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guiusercomponent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class GuiUserComponent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyComponent exit = new MyComponent("Exit", MyListener.EXIT);
        MyComponent print = new MyComponent("Print", MyListener.PRINT);
        
        exit.addActionListener(new MyListener());
        print.addActionListener(new MyListener());

        print.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        exit.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(exit);
        panel.add(Box.createVerticalStrut(20));
        panel.add(print);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
