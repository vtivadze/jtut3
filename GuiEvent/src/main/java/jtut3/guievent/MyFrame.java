/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guievent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author DELL
 */
public class MyFrame extends JFrame implements ActionListener {
    private JTextField nameTF;
    private JTextField emailTF;
    private JCheckBox news;
    
    public MyFrame() {
        super("My Window");
        setBounds(100, 100, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
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
        
        nameTF = new JTextField();
        nameTF.setPreferredSize(new Dimension(200, 40));
        emailTF = new JTextField();
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
        news = new JCheckBox("Subscribe on news");
        JButton button = new JButton("Send");
        button.setPreferredSize(new Dimension(200, 50));
        bottom.add(news);
        bottom.add(button);
        
        add(top, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        button.addActionListener(this);
        news.addActionListener(this);
        
        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                top.setBackground(Color.GREEN);
                form.setBackground(Color.RED);
                bottom.setBackground(Color.YELLOW);
                labelTitle.setForeground(Color.ORANGE);
            }
        });
        */
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Subscribe on news")) {
            System.out.println("Pressed CheckBox");
        }
        else if (ae.getActionCommand().equals("Send")) {
            String name = nameTF.getText();
            String email = emailTF.getText();
            boolean bNews = news.isSelected();
            try {
                User user = new User(name, email, bNews);
                User.add(user);
                User.printAllUsers();
            } catch (UserException e) {
                if (e.getCode() == UserException.NO_NAME) showError(UserException.NO_NAME_ERROR);
                else if (e.getCode() == UserException.NO_EMAIL) showError(UserException.NO_EMAIL_ERROR);
            }
        }
    }
    
    private void showError(String text) {
        JOptionPane.showMessageDialog(this, text, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
