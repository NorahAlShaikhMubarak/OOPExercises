/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordtest;

/**
 *
 * @author norahalshaikhmubarak
 */
//LAB5 EXERCISE2
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
public class PasswordTest extends JFrame {
    
    static JLabel pLbl= new JLabel("JPasswordField");
    static JPasswordField Ptxt= new JPasswordField(10);

    public static void main(String[] args) {
        
        PasswordTest p = new PasswordTest();
        p.setTitle("Frame test");
        p.setSize(250, 150);
        p.setLayout(new FlowLayout());
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
        
        p.add(pLbl);
        p.add(Ptxt);
    }
    
}
