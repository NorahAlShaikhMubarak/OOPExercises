/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopiiproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class DetailsOfFlowersFrame extends JFrame{
    

    private JTextField NumOfFlowersTxt;

    static String[] colorsOfFlowers={"Red","Pink", "Blue", "Orange", "Yellow", "Purple", "White"};
    private JList ColorsOfFlowersList;
    
    private JRadioButton NaturalType;
    private JRadioButton ArtificialType;
    private ButtonGroup btnGroup;
    
    private JButton nextBtn;
    private JButton previousBtn;
    private JButton doneBtn;
    
    private JTextArea txtArea;
 
    private GridLayout layout;
    private FlowLayout flowLayout;

    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private String type;
    private Color color;
    Connection connection= null;

   public DetailsOfFlowersFrame(String type){
        
        super("Details Of Flowers");
        flowLayout= new FlowLayout();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
        setLayout(new FlowLayout());
        layout= new GridLayout(13,5,5,5);
        setLayout(layout);
        
        this.type= type;
        lbl4= new JLabel("Choose the type of flowers");
        lbl4.setFont(new Font("Serif", Font.BOLD,19));
        add(lbl4);
        lbl4.setForeground(Color.PINK);
        NaturalType= new JRadioButton("Natural");
        add(NaturalType);
        ArtificialType= new JRadioButton("Artificial");
        add(ArtificialType);
 
        lbl3= new JLabel("Choose the color of flowers");
        lbl3.setFont(new Font("Serif", Font.BOLD,19));
        add(lbl3);
        lbl3.setForeground(Color.PINK);
        ColorsOfFlowersList= new JList(colorsOfFlowers);
        ColorsOfFlowersList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(ColorsOfFlowersList);
        add(new JScrollPane(ColorsOfFlowersList));
        
        lbl1= new JLabel("Enter the number of flowers:");
        lbl1.setFont(new Font("Serif", Font.BOLD,19));
        add(lbl1);
        lbl1.setForeground(Color.PINK);
        NumOfFlowersTxt= new JTextField(20);
        add(NumOfFlowersTxt);
        
        btnGroup= new ButtonGroup();
        btnGroup.add(NaturalType);
        btnGroup.add(ArtificialType);
        
        txtArea= new JTextArea(5,50);
        txtArea.setEditable(false);
        add(txtArea);
        
        doneBtn= new JButton("Done");
        add(doneBtn);
        
        previousBtn= new JButton("Previous");
        add(previousBtn);
        
        nextBtn= new JButton("Next");
        add(nextBtn);
        
        ListHandler handler3= new ListHandler();
        ColorsOfFlowersList.addListSelectionListener(handler3);
        
        ItemListenerHandler handler4= new ItemListenerHandler ();
        NaturalType.addItemListener(handler4);
        ArtificialType.addItemListener(handler4);
        
        ActionListenerHandler handler5= new ActionListenerHandler ();
        nextBtn.addActionListener(handler5);
        previousBtn.addActionListener(handler5);
        NumOfFlowersTxt.addActionListener(handler5);
        
        ActionListenerHandler1 handler6= new ActionListenerHandler1 ();
        doneBtn.addActionListener(handler6);
        
        try
       {
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=true","root","root");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       }
    }

     public class ListHandler implements ListSelectionListener
    {
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {        
            for(int i=0;i<7;i++)
                if(ColorsOfFlowersList.getSelectedValue()==colorsOfFlowers[i])
                {
                 JOptionPane.showMessageDialog(rootPane, "You have selected: "+ColorsOfFlowersList.getSelectedValue(), 
                 "Department", JOptionPane.INFORMATION_MESSAGE);
                 txtArea.setText(txtArea.getText()+"Colors: "+ColorsOfFlowersList.getSelectedValue()+"\n");
                }        
    }
    }
     
     private class ItemListenerHandler implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            if(e.getSource()==NaturalType)
            {
                if(NaturalType.isSelected())
                txtArea.setText(txtArea.getText()+"Type of the flower: "+NaturalType.getText()+"\n");
            }
            if(e.getSource()==ArtificialType)
            {
                if(ArtificialType.isSelected())
                txtArea.setText(txtArea.getText()+"Type of the flower: "+ArtificialType.getText()+"\n");
            }
        }
     }
     
     private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==NumOfFlowersTxt){
                int noFlowers= Integer.parseInt(NumOfFlowersTxt.getText());
                String subType =NaturalType.isSelected()?NaturalType.getText():ArtificialType.getText();
                
           try
           {
           Statement statement = connection.createStatement();
           ResultSet resultSet =statement.executeQuery(String.format("SELECT Quantity FROM db.typesofflowers WHERE FlowerName= '%s' AND FlowerType= '%s';", type,subType));
           while(resultSet.next()){
            if(noFlowers >resultSet.getInt(1) )
            {
                JOptionPane.showMessageDialog(rootPane, "The quantity you entred is more than the available", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
            }
            catch(SQLException sqlExeption)
            {
           System.out.println( sqlExeption.getMessage( ) );
            } 

            }
            if(e.getSource()==nextBtn)
            {
                String subType =NaturalType.isSelected()?NaturalType.getText():ArtificialType.getText();
                PackagingFrame childFrame1= new PackagingFrame(type, NumOfFlowersTxt.getText(),
                colorsOfFlowers[ColorsOfFlowersList.getSelectedIndex()],subType);
                childFrame1.setSize(600, 500);
                childFrame1.setVisible(true);
            }
            if(e.getSource()==previousBtn)
            {
                TypesOfFlowersFrame childFrame2= new TypesOfFlowersFrame();
                childFrame2.setSize(600, 500);
                childFrame2.setVisible(true);
            }
        }
    }
   private class ActionListenerHandler1 implements ActionListener
   {
     @Override
     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==doneBtn)
            if (ColorsOfFlowersList.isSelectionEmpty())
            {
               JOptionPane.showMessageDialog(rootPane, "You have to select the color of flower!", "Error " , JOptionPane.ERROR_MESSAGE);
            }
        
           if(e.getSource()==doneBtn)
                if(!(NaturalType.isSelected())&&(!(ArtificialType.isSelected())))
           {
               JOptionPane.showMessageDialog(rootPane, "Select the type of flower!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
               JOptionPane.showMessageDialog(rootPane, "Details are successfully filled", "Succeed", 
               JOptionPane.INFORMATION_MESSAGE);
            }
     }
   }
}