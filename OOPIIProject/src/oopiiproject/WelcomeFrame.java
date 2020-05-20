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
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Font;
import java.awt.Color;
public class WelcomeFrame extends JFrame {
    
    private JLabel welcomeLbl;
    private JButton loginBtn;
    private JButton registerBtn;
    private JButton guestBtn;
    private FlowLayout layout;
    private JLabel imagelabel;
    private Color color;
    public WelcomeFrame()
    {
        super("Welcome ");
        layout= new FlowLayout();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon((getClass().getResource("background.jpg")))));
        setLayout(new FlowLayout());
        setLayout(layout);
        layout.setAlignment(FlowLayout.CENTER);
        
                
        Icon icon1= new ImageIcon(getClass().getResource("f1.png"));
        imagelabel= new JLabel(icon1);
        add(imagelabel);
        
        welcomeLbl= new JLabel("Welcome to NDN Flower Boutique");
        welcomeLbl.setFont(new Font("Serif", Font.BOLD,19));
        add(welcomeLbl);
        welcomeLbl.setForeground(Color.PINK);
        
        Icon icon= new ImageIcon(getClass().getResource("f1.png"));
        imagelabel= new JLabel(icon);
        add(imagelabel);
       
        loginBtn= new JButton("Log in");
        add(loginBtn);
        
        registerBtn= new JButton("Register");
        add(registerBtn);
        
        guestBtn= new JButton("Countinue as a guest");
        add(guestBtn);
               
        setSize(499,299);
	setSize(500,300);
        
        ActionListenerHandler handler= new ActionListenerHandler();
        loginBtn.addActionListener(handler);
        registerBtn.addActionListener(handler);
        guestBtn.addActionListener(handler);
    }
    
    private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==loginBtn)
            {
                LogInFrame childFrame1= new LogInFrame();
                childFrame1.setSize(300, 300);
                childFrame1.setVisible(true);
            }
            if(e.getSource()==registerBtn)
            {
                RegisterFrame childFrame2= new RegisterFrame();
                childFrame2.setSize(300, 300);
                childFrame2.setVisible(true);
            }
            if(e.getSource()==guestBtn)
            {
                MenuFrame childFrame3= new MenuFrame();
                childFrame3.setVisible(true);
                childFrame3.setSize(600,500);
            } 
        }
    }
}
