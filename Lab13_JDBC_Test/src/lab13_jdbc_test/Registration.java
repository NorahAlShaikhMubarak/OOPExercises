/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_jdbc_test;

/**
 *
 * @author MY-PC
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


public class Registration extends JFrame implements ActionListener{
    static JLabel lbl = new JLabel("Registration Form");
    static JTextField fstname = new JTextField(20);
    static JTextField lstname = new JTextField(20);
    static JTextField username = new JTextField(20);
    static JPasswordField password = new JPasswordField (20);
    static JButton regBtn = new JButton ("Register");
    static JButton cnlBtn = new JButton ("Cancel");
    
    Connection connection= null;
    public Registration(){
        
        this.setTitle("Registration");
        this.setVisible(true);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        this.add(lbl);
        fstname.setText("Enter Your First Name");
        lstname.setText("Enter Your Last Name");
        username.setText("Enter Your Username");
        password.setText("Enter Your Password");
        
        this.add(fstname);
        this.add(lstname);
        this.add(username);
        this.add(password);
        this.add(regBtn);
        this.add(cnlBtn);
        
       regBtn.addActionListener(this);
       cnlBtn.addActionListener(this);
      try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useSSL=true","root","Mfh_3724");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==regBtn){
            
            String fName= fstname.getText();
            String lName= lstname.getText();
            String uName= username.getText();
            String pass= password.getText();
            
            try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("INSERT INTO users (FirstName, LastName, UserName,UserPassword )"
                    + "VALUES ('%s', '%s', '%s', '%s');",fName,lName,uName,pass));
            }
              
             catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       }
      
       
            
        }
        if(e.getSource()==cnlBtn){}
        
    }
    
}
