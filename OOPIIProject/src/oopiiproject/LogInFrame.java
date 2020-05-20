/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopiiproject;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class LogInFrame extends JFrame implements ActionListener {
    
    private JLabel userLbl;
    private JLabel passLbl;
    private JTextField userTxt;
    private JPasswordField passTxt;
    private JButton nextBtn;
    private JButton previousBtn;
    private JButton loginBtn;
    private FlowLayout layout;
    
    Connection connection= null;
    
    public LogInFrame()
    {
        super("Login ");
        layout= new FlowLayout();

        setLayout(layout);
        layout.setAlignment(FlowLayout.CENTER);
        
        userLbl= new JLabel("Username: ");
        add(userLbl);
        userTxt= new JTextField(20);
        add(userTxt);
        
        passLbl= new JLabel("Password: ");
        add(passLbl);
        passTxt= new JPasswordField(20);
        add(passTxt);
        
        loginBtn= new JButton("Login");
        add(loginBtn);

        previousBtn= new JButton("Previous");
        add(previousBtn);
        
        nextBtn= new JButton("Next");
        add(nextBtn);
        
        nextBtn.addActionListener(this);
        previousBtn.addActionListener(this);
        loginBtn.addActionListener(this);

        try
       {
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=true","root","root");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       } 
   }

        @Override
        public void actionPerformed(ActionEvent e)
        {
        if(e.getSource()==loginBtn){
    
            String username= userTxt.getText();
            String passowrd= passTxt.getText();
            
           try
           {
           Statement statement = connection.createStatement();
           ResultSet resultSet =statement.executeQuery("SELECT UserName,userPass FROM db.registerdusers;"); 
           boolean flag= false;
           while (resultSet.next()){
               
            if(username.equals(resultSet.getObject(1)) 
                &&passowrd.equals(resultSet.getObject(2))  )
            {
                flag= true;
                JOptionPane.showMessageDialog(this, "Welcome   "+username, "Welcome", JOptionPane.INFORMATION_MESSAGE);
            }
               
            }
           if(flag == false)
           {
                JOptionPane.showMessageDialog(this, "You are not registered, Please register first", "Error", JOptionPane.ERROR_MESSAGE);

           }
            }
            catch(SQLException sqlExeption)
            {
           System.out.println( sqlExeption.getMessage( ) );
            } 
        }
        
         if(e.getSource()==previousBtn)
            {
                WelcomeFrame childFrame= new WelcomeFrame();
                childFrame.setSize(500, 300);
                childFrame.setVisible(true);
            }
            if(e.getSource()==nextBtn)
            {
               MenuFrame childFrame= new MenuFrame();
               childFrame.setVisible(true);
               childFrame.setSize(600,500);
            }
    }
}


