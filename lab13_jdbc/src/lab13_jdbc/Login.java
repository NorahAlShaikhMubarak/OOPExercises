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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener{
    
    static JLabel lbl = new JLabel("Login Form");
    static JTextField username = new JTextField(20);
    static JPasswordField password = new JPasswordField (20);
    static JButton loginBtn = new JButton ("Login");
    static JButton cnlBtn = new JButton ("Cancel");
    Connection connection= null;
   public Login (){
       
       this.setTitle("Login");
        this.setVisible(true);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        this.add(lbl);
        username.setText("Enter Your Username");
        password.setText("Enter Your Password");
        
    
        this.add(username);
        this.add(password);
        this.add(loginBtn);
        this.add(cnlBtn);
        
       loginBtn.addActionListener(this);
       cnlBtn.addActionListener(this);
      try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=true","root","root");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       } 
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==loginBtn){
            
            String uName= username.getText();
            String pass= password.getText();
            
            try{
           Statement statement = connection.createStatement();
           ResultSet resultSet =statement.executeQuery("SELECT UserName,userPass FROM db.registerdusers;"); 
           boolean flag= false;
           while (resultSet.next()){
               
               if(  uName.equals(resultSet.getObject(1)) 
                       && pass.equals(resultSet.getObject(2))  ){
                   flag= true;
                   JOptionPane.showMessageDialog(this, "Welcome   "+uName, "Welcome", JOptionPane.INFORMATION_MESSAGE);
               }
               
               
           }
           if(flag == false){
                 JOptionPane.showMessageDialog(this, "You are not registered, Please register first", "Error", JOptionPane.ERROR_MESSAGE);

           }
            }
            catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       } 
        }
        if(e.getSource()==cnlBtn){}
    }
}