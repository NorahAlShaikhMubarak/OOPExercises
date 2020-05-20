/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Container;
import java.awt.GridLayout;

public class SimpleCalculator extends JFrame implements ActionListener, ItemListener {

    private JTextField txtField1;
    private JTextField txtField2;
    
    private JCheckBox AddCb;
    private JCheckBox SubCb;
    private JCheckBox MultCb;
    private JCheckBox DivideCb;
    private JCheckBox PowerCb;
    private JCheckBox CheckallCb;
    
    private JButton CalBtn;
    private JButton ResetBtn;
    private Container container;
    private GridLayout gridLayout;
    
    public SimpleCalculator()
    {
        super("Simple Calculator");
        gridLayout = new GridLayout (5, 2);
        setLayout(gridLayout);
        
        txtField1= new JTextField("Enter First Number",15);
        add(txtField1);
        txtField2= new JTextField("Enter Second Number",15);
        add(txtField2);
        
        AddCb= new JCheckBox("Addition");
        add(AddCb);
        
        SubCb= new JCheckBox("Subtraction");
        add(SubCb);
        
        MultCb= new JCheckBox("Multiplication");
        add(MultCb);
        
        DivideCb= new JCheckBox("Divide");
        add(DivideCb);
        
        PowerCb= new JCheckBox("Power");
        add(PowerCb);
        
        CheckallCb= new JCheckBox("Check all");
        add(CheckallCb);
        
        CalBtn= new JButton("Calculate");
        add(CalBtn);
        
        ResetBtn= new JButton("Reset");
        add(ResetBtn);
        
        AddCb.addItemListener(this);
        SubCb.addItemListener(this);
        MultCb.addItemListener(this);
        DivideCb.addItemListener(this);
        PowerCb.addItemListener(this);
        CheckallCb.addItemListener(this);
        CalBtn.addActionListener(this);
        ResetBtn.addActionListener(this);

    }
    
    
    public static void main(String[] args) {
        
        SimpleCalculator frm = new SimpleCalculator ();
        frm.setSize(420, 250);
        
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
            double num1=Double.parseDouble(txtField1.getText());
            double num2=Double.parseDouble(txtField2.getText());
            double result1=num1+num2; 
            double result2=num1-num2; 
            double result3=num1*num2; 
            double result4=num1/num2;
            double result5=Math.pow(num1, num2);
            
        if(e.getSource()==CalBtn){
            if(AddCb.isSelected()||SubCb.isSelected()||MultCb.isSelected()||DivideCb.isSelected()||PowerCb.isSelected())
            {
              JOptionPane.showMessageDialog(CalBtn, 
              (AddCb.isSelected()?"Addition:"+result1+"\n":"")+
              (SubCb.isSelected()?"Subtraction:"+result2+"\n":"")+
              (MultCb.isSelected()?"Multiplication:"+result3+"\n":"")+
              (DivideCb.isSelected()?"Division:"+result4+"\n":"")+
              (PowerCb.isSelected()?"Power:"+result5+"\n":""), 
               "Message",JOptionPane.INFORMATION_MESSAGE);   
            }
            else if(CheckallCb.isSelected())
            {
           JOptionPane.showMessageDialog(CalBtn, "Addition:"+result1+"\nSubtraction:"+result2+"\nMultiplication:"+result3+
           "\nDivision:"+result4+"\nPower:"+result5, "Message",JOptionPane.INFORMATION_MESSAGE);
           }
        }
        if(e.getSource()==ResetBtn)
        {
            txtField1.setText(" ");
            txtField2.setText(" ");
            CheckallCb.setSelected(false);
            AddCb.setSelected(false);
            SubCb.setSelected(false);
            MultCb.setSelected(false);
            DivideCb.setSelected(false);
            PowerCb.setSelected(false);
        }
    }
    @Override
    public void itemStateChanged (ItemEvent e){
        
        if(CheckallCb.isSelected())
        {
            AddCb.setSelected(true);
            SubCb.setSelected(true);
            MultCb.setSelected(true);
            DivideCb.setSelected(true);
            PowerCb.setSelected(true);
            
        }
    }
    }