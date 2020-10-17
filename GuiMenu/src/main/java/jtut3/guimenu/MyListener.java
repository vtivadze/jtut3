/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimenu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class MyListener implements ActionListener {
    JFrame frame;
    
    public MyListener(JFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        String c = ae.getActionCommand();
        if (c.equals("Exit")) {
            System.exit(0);
        } else if(c.equals("Blue")) {
            frame.getContentPane().setBackground(Color.BLUE);
        } else if(c.equals("Yellow")) {
            frame.getContentPane().setBackground(Color.YELLOW);
            
        }
    }
}
