/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimouseeventexample;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class MyFrame extends JFrame {
    public int mouseClickCounter = 0;
    public final int buttonMaxCount = 10;
    public JButton[] button = new JButton[buttonMaxCount];
    
    public MyFrame(String title) {
        super(title);
    }
}
