/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.animationexample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class AnimationExample extends JFrame implements ActionListener {

    private int x = 50;
    private int y = 50;
    private Timer timer;
    final int DELTA = 10;
    final String MOVE_RIGHT = "right";
    final String MOVE_LEFT = "elft";
    private String moveDirection = "right";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new AnimationExample();
    }
    
    public AnimationExample() {
        super("Animation");
        setBounds(100, 100, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        timer = new Timer(50, this);
        timer.start();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        g2.fillRect(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x < 0) {
            moveDirection = MOVE_RIGHT;
        }
        else if (x + 50 > getSize().width) {
            moveDirection = MOVE_LEFT;
        }
        
        if (moveDirection == MOVE_RIGHT) {
            x += DELTA;
        }
        else if (moveDirection == MOVE_LEFT) {
            x -= DELTA;
        }
        repaint();
    }
    
}
