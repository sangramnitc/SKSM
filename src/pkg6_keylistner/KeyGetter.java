/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_keylistner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Sangram
 */
public class KeyGetter extends JFrame implements KeyListener {
    
    /* Components */
    JLabel lable1 = new JLabel("Press any key in the text");
    JTextField input = new JTextField(10); 
    JLabel output = new JLabel(); 
    
    KeyGetter() {
        super ("Key Listner");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.addKeyListener(this);
        
        JPanel row1 = new JPanel();
        FlowLayout row1Flo = new FlowLayout();
        row1.setLayout(row1Flo);
        row1.add(lable1);
        row1.add(input);
        
        JPanel row2 = new JPanel();
        FlowLayout row2Flo = new FlowLayout();
        row2.setLayout(row2Flo);
        row2.add(output);
        
        JPanel mainPanel = new JPanel();
        FlowLayout mainFlo = new FlowLayout();
        mainPanel.setLayout(mainFlo);
        mainPanel.add(row1);
        mainPanel.add(row2);
        
        add(mainPanel);
        setVisible(true);
    }
    public void keyTyped(KeyEvent input){
        output.setText("Key eneterred "+ input.getKeyChar());
    }
    
    public void keyPressed (KeyEvent input){
        /* Do nothing */
    }
    
    public void keyReleased (KeyEvent input){
        /* Do nothing */
    }
    
    private void setLookAndFeel(){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }
}