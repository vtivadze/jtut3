/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guieventexample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author DELL
 */
public class MyWindow extends JFrame implements ActionListener {
    private JPanel p;
    
    public MyWindow() {
        super("My Window");
        setBounds(100, 100, 600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout fl = new FlowLayout();
        fl.setHgap(10);
        fl.setVgap(50);
        
        p = new JPanel();
        p.setLayout(fl);
        
        JButton bRed = new JButton("Red");
        JButton bWhite = new JButton("White");
        JButton bGreen = new JButton("Green");
        p.add(bRed);
        p.add(bWhite);
        p.add(bGreen);
        
        bRed.addActionListener(this);
        bWhite.addActionListener(this);
        bGreen.addActionListener(this);
        
        add(p);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();
        if (ac.equals("Red")) p.setBackground(Color.RED);
        else if(ac.equals("White")) p.setBackground(Color.WHITE);
        else if (ac.equals("Green")) p.setBackground(Color.GREEN);
    }
}
