/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Instlogin
 */
public class MyButtonListener implements ActionListener {
    private MainGui window;
    
    public MyButtonListener(MainGui window) {
        this.window = window;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = window.getTxtInput().getText();
        String greeting = "Hello " + name;
        window.getLblOutput().setText(greeting);
    }
}
