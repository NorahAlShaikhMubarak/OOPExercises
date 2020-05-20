/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopiiproject;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class PaymentDetails extends JFrame implements ActionListener
{
    String type;
    private int noFlowers;
    private int price, price2;
    String color;
    String subType;
    String pack;
    private JLabel introlbl;
    private JLabel lbl;
    private JLabel flowerlbl;
    private JLabel lbl1;
    private JLabel noFlowerslbl;
    private JLabel lbl2;
    private JLabel colorLbl;
    private JLabel lbl3;
    private JLabel subTypelbl;
    private JLabel lbl4;
    private JLabel packlbl;
    private JLabel lbl5;
    private GridLayout layout;
    private int total;
    private JButton nextBtn;
    private JLabel totallbl;
    private FlowLayout flowLayout;
    
    Connection connection= null;
    Statement statement;
    Statement statement2;
    ResultSet resultSet;
    ResultSet resultSet2;
    PaymentDetails(String type, String noFlowers, String color, String subType, String pack)
    {
    super("Payment Details");
    flowLayout= new FlowLayout();
    setLayout(new BorderLayout());
    setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
    setLayout(new FlowLayout());
    layout= new GridLayout(10,1,3,3);
    setLayout(layout);
    
    
    this.setSize(300, 400);
    this.setVisible(true);
    this.type=type;
    this.noFlowers=Integer.parseInt(noFlowers);
    this.color=color;
    this.subType=subType;
    this.pack=pack;
    this.price= 0;
    this.price2= 0;
    
    try
    {
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=true","root","root");
      
    }
    catch(SQLException sqlExeption)
    {
        System.out.println( sqlExeption.getMessage( ) );
    }

    try
    {
     statement = connection.createStatement();
     resultSet =statement.executeQuery(String.format("SELECT Price FROM db.typesofflowers"
            + " WHERE FlowerName='%s' AND FlowerType='%s';", type,subType));
    while(resultSet.next())
    {
        price = resultSet.getInt(1);
  
    }
    
     statement2 = connection.createStatement();
     resultSet2 =statement.executeQuery(String.format("SELECT Price FROM db.packaging"
            + " WHERE PackageType='%s';",this.pack));
    while(resultSet2.next())
    {
        price2 = resultSet2.getInt(1);
  
    }
    }
    catch(SQLException sqlExeption)
    {
    System.out.println( sqlExeption.getMessage( ) );
    }
    finally
    {
    try
    {
        resultSet.close();
        statement.close();
        resultSet2.close();
        statement2.close();
        connection.close(); 
    }  
      catch(Exception ee){
        ee.printStackTrace();
    }
    }
    total = (price*this.noFlowers)+price2; 
    
    
    flowerlbl= new JLabel("Type of Flower: ");
    add(flowerlbl);
    lbl= new JLabel(type);
    add(lbl);
    
    noFlowerslbl= new JLabel("Number of Flowers: ");
    add(noFlowerslbl);
    lbl1= new JLabel(noFlowers);
    add(lbl1);
    
    colorLbl= new JLabel("Color of Flowers: ");
    add(colorLbl);
    lbl2= new JLabel(color);
    add(lbl2);
    
    subTypelbl= new JLabel("Type of Flowers: ");
    add(subTypelbl);
    lbl3= new JLabel(subType);
    add(lbl3);
    
    packlbl= new JLabel("Packaging: ");
    add(packlbl);
    lbl4= new JLabel(pack);
    add(lbl4);
    
    
    totallbl= new JLabel("Total Price: "+total);
    System.out.print(total);
    add(totallbl);
        
    nextBtn= new JButton("Confirm Order");
    add(nextBtn);
    
    nextBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==nextBtn)
        {
            PaymentFrame childFrame= new PaymentFrame();
            childFrame.setVisible(true);
            childFrame.setSize(300, 400);
        }
    }
}
