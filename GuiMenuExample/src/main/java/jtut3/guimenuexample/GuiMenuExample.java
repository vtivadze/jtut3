/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimenuexample;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author DELL
 */
public class GuiMenuExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar mb = new JMenuBar();
        frame.setJMenuBar(mb);
        
        JMenu view = new JMenu("View");
        mb.add(view);
        
        JMenu windowSize = new JMenu("Window Size");
        view.add(windowSize);
        
        JMenuItem size_1 = new JMenuItem("640x480");
        windowSize.add(size_1);
        
        JMenuItem size_2 = new JMenuItem("800x600");
        windowSize.add(size_2);
        
        JMenuItem size_3 = new JMenuItem("1024x768");
        windowSize.add(size_3);
        
        frame.setVisible(true);
        
        WindowSizeListener listener = new WindowSizeListener(frame);
        
        size_1.addActionListener(listener);
        size_2.addActionListener(listener);
        size_3.addActionListener(listener);
    }
    
}
