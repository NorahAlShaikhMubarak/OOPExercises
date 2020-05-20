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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterFrame extends JFrame implements ActionListener {
    
    private JLabel fnameLbl;
    private JLabel lnameLbl;
    private JLabel passLbl;
    private JLabel usernamelLbl;
    private JTextField fnameTxt;
    private JTextField lnameTxt;
    private JTextField usernameTxt;
    private JPasswordField passTxt;
    private JButton nextBtn;
    private JButton previousBtn;
    Connection connection= null;
    
    public RegisterFrame()
    {
        super("Register ");
        setLayout(new FlowLayout());

        fnameLbl= new JLabel("First name: ");
        add(fnameLbl);
        fnameTxt= new JTextField(20);
        add(fnameTxt);
        
        lnameLbl= new JLabel("Last name: ");
        add(lnameLbl);
        lnameTxt= new JTextField(20);
        add(lnameTxt);
        
        usernamelLbl= new JLabel("Username: ");
        add(usernamelLbl);
        usernameTxt= new JTextField(20);
        add(usernameTxt);
        
        passLbl= new JLabel("Password: ");
        add(passLbl);
        passTxt= new JPasswordField(20);
        add(passTxt);
        
        previousBtn= new JButton("Previous");
        add(previousBtn);
        
        nextBtn= new JButton("Next");
        add(nextBtn);
        
        nextBtn.addActionListener(this);
        previousBtn.addActionListener(this); 
        
       try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=true","root","root");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       }
    }
            @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==nextBtn)
            {

               String fName= fnameTxt.getText();
               String lName= lnameTxt.getText();
               String uName= usernameTxt.getText();
               String pass= passTxt.getText();
               
               try {
               Statement statement = connection.createStatement();
               statement.executeUpdate(String.format("INSERT INTO registerdusers (FirstName, LastName, UserName,userPass )"
                + "VALUES ('%s', '%s', '%s', '%s');",fName,lName,uName,pass));
            }
             catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
            }
        }
            if(e.getSource()==previousBtn)
            {
                WelcomeFrame childFrame2= new WelcomeFrame();
                childFrame2.setSize(500, 300);
                childFrame2.setVisible(true);
            }
            if(e.getSource()==nextBtn)
            {
                MenuFrame childFrame3= new MenuFrame();
                childFrame3.setVisible(true);
                childFrame3.setSize(600,500);
            }
}
}

    


    
