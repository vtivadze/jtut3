/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guicomponents;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class GuiComponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My window");
        frame.setBounds(300, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JButton button = new JButton("Button");
        panel.add(button);
        
        JLabel label = new JLabel("Text Label");
        panel.add(label);
        
        JCheckBox check = new JCheckBox("Checkbox text");
        panel.add(check);
        
        JTextField tf = new JTextField("Default text");
        panel.add(tf);
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton rb_1 = new JRadioButton("RadioButton 1");
        JRadioButton rb_2 = new JRadioButton("RadioButton 2");
        bg.add(rb_1);
        bg.add(rb_2);
        panel.add(rb_1);
        panel.add(rb_2);
        
        JTextArea ta = new JTextArea("Text in text area");
        panel.add(ta);
        
        String[][] data = {{"1", "2"}, {"3", "4"}};
        String[] cols = {"Column 1", "Column 2"};
        
        JTable table = new JTable(data, cols);
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
