/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guilayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author DELL
 */
public class GuiLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0));
        JLabel labelTitle = new JLabel("My Form");
        labelTitle.setFont(new Font("Arial", Font.BOLD, 22));
        top.add(labelTitle);
        
        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Name: ");
        nameL.setHorizontalAlignment(SwingConstants.RIGHT);
        JLabel emailL = new JLabel("E-mail: ");
        emailL.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(200, 40));
        JTextField emailTF = new JTextField();
        emailTF.setPreferredSize(new Dimension(200, 40));
        
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(0, 0, 10, 5);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        form.add(nameL, c);
        c.gridx = 1;
        form.add(nameTF, c);
        c.gridx = 0;
        c.gridy = 1;
        form.add(emailL, c);
        c.gridx = 1;
        form.add(emailTF, c);
        
        JPanel bottom = new JPanel();
        bottom.setBorder(new EmptyBorder(0, 0, 20, 0));
        JCheckBox news = new JCheckBox("Subscribe on news");
        JButton button = new JButton("Send");
        button.setPreferredSize(new Dimension(200, 50));
        bottom.add(news);
        bottom.add(button);
        
        frame.add(top, BorderLayout.NORTH);
        frame.add(form, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    
}
