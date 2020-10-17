/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guiusercomponentexample;

import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class MyComponent extends JTextField {
    public String defaultText;
    
    public MyComponent(String defaultText) {
        super(defaultText);
        this.defaultText = defaultText;
    }
}
