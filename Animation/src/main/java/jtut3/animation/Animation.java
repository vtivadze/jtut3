/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.animation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class Animation extends JFrame implements KeyListener, ActionListener {

    private int x = 20;
    private int y = 200;
    final int DELTA = 10;
    private Timer timer;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Animation();
    }
    
    public Animation() {
        super("Animations");
        setBounds(100, 100, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        addKeyListener(this);
        
        JButton button = new JButton("Start");
        button.addActionListener((ae) -> {
            if (ae.getActionCommand() == "Start") {
                button.setText("Stop");
                timer.start();
                
            }
            else if (ae.getActionCommand() == "Stop") {
                button.setText("Start");
                timer.stop();
            }
        });
        
        add(button);
        setVisible(true);
        timer = new Timer(50, this);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        if (x + 50 > getSize().width) x = getSize().width - 50;
        if (y + 50 > getSize().height) y = getSize().height - 50;
        if (x < 0) x = 0;
        if (y < 0) y = 0;
        g2.fillRect(x, y, 50, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 38) y -= DELTA;
        else if (code == 39) x += DELTA;
        else if (code == 40) y += DELTA;
        else if (code == 37) x -= DELTA;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        x += DELTA;
        repaint();
    }
    
    
}
