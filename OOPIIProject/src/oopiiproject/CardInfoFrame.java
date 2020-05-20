/*
 * To change this license header, choose                                                                                                                                                                                    License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopiiproject;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CardInfoFrame extends JFrame implements ActionListener {
 
    private JLabel countryLbl;
    private JComboBox counrtyComboBox; 
    private String [] countries = { "US", "Saudi Arabia", "Kuwait", "UK", "Qatar"};
    
    private FlowLayout layout;
    
    private JTextField cardNoTextField;
    private JTextField cardExpTextField;
    private JTextField cardCVVTextField;

    private JLabel cardNoLabel;
    private JLabel cardExpLabel;
    private JLabel cardCVVLabel;

    private JButton nextBtn;
    private JButton previousBtn;
    
    private GridLayout gridlayout;
    private FlowLayout flowLayout;
    
    Connection connection=null;
    
    public CardInfoFrame()
    {
        super("Card Information");
        flowLayout= new FlowLayout();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
        setLayout(new FlowLayout());
        gridlayout= new GridLayout(10,1,3,3);
        setLayout(gridlayout);
        
        countryLbl= new JLabel("Country: ");
        add(countryLbl);
        counrtyComboBox = new JComboBox(countries);
        add(counrtyComboBox);
        
        cardNoLabel = new JLabel ("Card Number: ");
        add(cardNoLabel);
        cardNoTextField = new JTextField(10);
        add(cardNoTextField);
        
        cardExpLabel = new JLabel ("Card Expire: ");
        add(cardExpLabel);
        cardExpTextField = new JTextField(10);
        add(cardExpTextField);
        
        cardCVVLabel = new JLabel("Card CVV: ");
        add(cardCVVLabel);
        cardCVVTextField= new JTextField(10);
        add(cardCVVTextField);
        
        previousBtn= new JButton("Previous");
        add(previousBtn);
        
        nextBtn= new JButton("Next");
        add(nextBtn);
        
        nextBtn.addActionListener(this);
        previousBtn.addActionListener(this);
        
        try
       {
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=true","root","root");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage());
       }

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==nextBtn)
        {
            String cardno= cardNoTextField.getText();
            String cardex= cardExpTextField.getText();
            String cardcvv= cardCVVTextField.getText();
               
            try {
               Statement statement = connection.createStatement();
               statement.executeUpdate(String.format("INSERT INTO cardinfo (cardnumber, cardexpire, cardcvv)"
                + "VALUES ('%s', '%s', '%s');",cardno,cardex,cardcvv));
            }
             catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
            }

        }
        if(e.getSource()==previousBtn)
        {
            PaymentFrame childFrame2= new PaymentFrame();
            childFrame2.setSize(300, 400);
            childFrame2.setVisible(true);
        }
        if(e.getSource()==nextBtn)
        {
            RatingFrame childFrame1= new RatingFrame();
            childFrame1.setSize(300, 400);
            childFrame1.setVisible(true);
        }
    }
    
}
