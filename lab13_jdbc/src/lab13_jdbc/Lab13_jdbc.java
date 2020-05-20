/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_jdbc;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab13_jdbc extends JFrame  implements ActionListener {
    
    static JLabel lbl = new JLabel("Welcome to My Project");
    static JButton regBtn = new JButton ("Register");
    static JButton loginBtn = new JButton ("Login");

    
    public static void main(String[] args)
    {
        Lab13_jdbc  frm = new Lab13_jdbc();
        frm.setTitle("Home");
        frm.setVisible(true);
        frm.setSize(200, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        
        frm.add(lbl);
        frm.add(regBtn);
        frm.add(loginBtn);
        regBtn.addActionListener(frm);
        loginBtn.addActionListener(frm);
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== regBtn){
            Registration regFrm = new Registration();}
        
        if (e.getSource()== loginBtn){
            Login loginFrm = new Login();}
    }
    
}
