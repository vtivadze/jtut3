/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guimenuexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class WindowSizeListener implements ActionListener {
    JFrame frame;
    
    public WindowSizeListener(JFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String c = ae.getActionCommand();
        String[] bounds = c.split("x");
        int width = Integer.parseInt(bounds[0]);
        int height = Integer.parseInt(bounds[1]);
        frame.setBounds(frame.getX(), frame.getY(), width, height);
    }
}
