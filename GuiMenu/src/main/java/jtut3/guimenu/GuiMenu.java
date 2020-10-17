/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimenu;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author DELL
 */
public class GuiMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Programm");
        JMenuItem exit = new JMenuItem("Exit");
        main.add(exit);
        mb.add(main);
        
        JMenu bg = new JMenu("Background");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem yellow = new JMenuItem("Yellow");
        bg.add(blue);
        bg.add(yellow);
        mb.add(bg);
        
        JMenu submenu = new JMenu("Submenu");
        bg.add(submenu);
        JMenuItem submenuItem = new JMenuItem("Menu Item in Submenu");
        submenu.add(submenuItem);
        
        submenu.addSeparator();
        
        JCheckBoxMenuItem checkboxItem = new JCheckBoxMenuItem("Checkbox");
        submenu.add(checkboxItem);
        
        frame.setJMenuBar(mb);
        frame.setVisible(true);
        
        MyListener listener = new MyListener(frame);
        
        exit.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);
        submenuItem.addActionListener(listener);
        checkboxItem.addActionListener(listener);
    }
    
}
