/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guilayoutexample;

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
public class GuiLayoutExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0));
        JLabel titleL = new JLabel("Subscription Form");
        titleL.setFont(new Font("Arial", Font.BOLD, 22));
        top.add(titleL);
        
        JPanel center = new JPanel();
        center.setLayout(new GridBagLayout());
        
        JPanel left = new JPanel();
        left.setLayout(new GridBagLayout());
        
        JLabel nameL = new JLabel("Name: ");
        JLabel emailL = new JLabel("E-mail: ");
        
        JTextField nameTF = new JTextField();
        JTextField emailTF = new JTextField();
        Dimension tfD = new Dimension(200, 25);
        nameTF.setPreferredSize(tfD);
        emailTF.setPreferredSize(tfD);
        
        GridBagConstraints leftC = new GridBagConstraints();
        leftC.insets = new Insets(0, 5, 3, 0);
        leftC.gridx = 0;
        leftC.gridy = 0;
        left.add(nameL, leftC);
        leftC.gridx = 1;
        left.add(nameTF, leftC);
        leftC.gridx = 0;
        leftC.gridy = 1;
        left.add(emailL, leftC);
        leftC.gridx = 1;
        left.add(emailTF, leftC);

        JPanel right = new JPanel();
        right.setLayout(new GridBagLayout());
        
        JCheckBox htmlC = new JCheckBox("HTML");
        JCheckBox jsC = new JCheckBox("JavaScript");
        JCheckBox phpC = new JCheckBox("PHP");
        htmlC.setHorizontalAlignment(SwingConstants.LEFT);
        jsC.setHorizontalAlignment(SwingConstants.LEFT);
        phpC.setHorizontalAlignment(SwingConstants.LEFT);
        
        GridBagConstraints rightC = new GridBagConstraints();
        rightC.fill = GridBagConstraints.BOTH;
        rightC.insets = new Insets(0, 20, 3, 0);
        rightC.gridx = 0;
        rightC.gridy = 0;
        right.add(htmlC, rightC);
        rightC.gridy = 1;
        right.add(jsC, rightC);
        rightC.gridy = 2;
        right.add(phpC, rightC);

        GridBagConstraints centerC = new GridBagConstraints();
        centerC.gridx = 0;
        centerC.gridy = 0;
        center.add(left, centerC);
        centerC.gridx = 1;
        center.add(right, centerC);
        
        JPanel bottom = new JPanel();
        bottom.setBorder(new EmptyBorder(0, 0, 20, 0));
        JButton button = new JButton("Subscribe");
        bottom.add(button);
        
        frame.add(top, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
    
}
