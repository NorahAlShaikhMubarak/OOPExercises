/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtext;

/**
 *
 * @author norahalshaikhmubarak
 */
//LAB5 EXERCISE1
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JText extends JFrame {
    
    private JLabel lbl;
    private JTextField txt1;
    private JTextField txt2;
    
    JText()
    {
        super("Frame Title");
        setLayout(new FlowLayout());
        
        lbl= new JLabel("Editable JTextField");
        add(lbl);
        
        txt1= new JTextField(7);
        add(txt1);
        
        txt2=new JTextField("You are not ALLOWED to write here",20);
        txt2.setEditable(false);
        add(txt2);
        
    }
 
    public static void main(String[] args) 
    {
        
        JText frm= new JText();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(250, 150);
        frm.setVisible(true);
    }  
}
