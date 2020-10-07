/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guicomponentsexample;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class GuiComponentsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 600, 400);
        
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Label Text");
        panel.add(label);
        
        JTextField tf = new JTextField("Default text");
        panel.add(tf);
        
        JButton button = new JButton("Button");
        panel.add(button);
        
        JCheckBox check = new JCheckBox("CheckBox Text");
        panel.add(check);
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton rb_1 = new JRadioButton("Radio Button 1");
        JRadioButton rb_2 = new JRadioButton("Radio Button 2");
        bg.add(rb_1);
        bg.add(rb_1);
        panel.add(rb_1);
        panel.add(rb_2);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
