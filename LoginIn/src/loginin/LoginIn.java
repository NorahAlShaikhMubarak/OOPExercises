/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginin;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class LoginIn extends JFrame {
    
    private JLabel userLbl;
    private JLabel passLbl;
    private JTextField userField;
    private JPasswordField passField;
    private JTextField txtField;
    
    String myUsername="Norahm98";
    String myPassword="1212";
        
    public LoginIn()
    {
        super("LogIn");
        setLayout(new FlowLayout());
        
        txtField= new JTextField(20);
        txtField.setEditable(false);
        add(txtField);
        
        userLbl= new JLabel("Username");
        add(userLbl);
        
        userField= new JTextField(10);
        add(userField);
        
        passLbl= new JLabel("Password");
        add(passLbl);
        
        passField= new JPasswordField(10);
        add(passField);
        
        ActionListenerHanlder handler= new ActionListenerHanlder();
        passField.addActionListener(handler);

    }

    
    
    public static void main(String[] args)
    {
        
        LoginIn frm=new LoginIn();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(250, 150);
    }
    
    private class ActionListenerHanlder implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String username= userField.getText();
            String password= passField.getText();
            if(username.equals(myUsername)&&password.equals(myPassword))
            {
                JOptionPane.showMessageDialog(null, "Welcome AlShaikhmubarak", "Message", JOptionPane.INFORMATION_MESSAGE);
                txtField.setText(" ");
            }
            else if(username.equals(myUsername))
            {
                txtField.setText("password is incorrect");
            }
            else if(password.equals(myPassword))
            {
                txtField.setText("username is incorrect");
            }
            else
            {
                txtField.setText("Username and password are not correct");
            }
        }
    }

} 
