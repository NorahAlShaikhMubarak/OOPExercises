/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

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
import javax.swing.JButton;

public class Calculator extends JFrame {

    static JLabel Lbl1= new JLabel("Enter number A");
    static JLabel Lbl2= new JLabel("Enter number B");
    static JLabel Lbl3= new JLabel("Result: ");
    static JTextField LblTxt1= new JTextField(20);
    static JTextField LblTxt2= new JTextField(20);
    static JTextField LblTxt3= new JTextField(10);
    static JButton b1= new JButton("+");
    static JButton b2= new JButton("-");
    static JButton b3= new JButton("*");
    static JButton b4= new JButton("/");
    static JButton b5= new JButton("^");
    public static void main(String[] args) {
        
        Calculator frm = new Calculator();
        frm.setTitle("Calculator for Basic Mathematical Operations");
        frm.setLayout(new FlowLayout());
        frm.setSize(950, 150);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
        frm.add(Lbl1);
        frm.add(LblTxt1);
        
        frm.add(Lbl2);
        frm.add(LblTxt2);
        
        frm.add(Lbl3);
        frm.add(LblTxt3);
        
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
        
        ActionListenerHandler handler=new ActionListenerHandler();
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
       
    }
    private static class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            if(e.getSource()==b1)
            {
                double A= Double.parseDouble(LblTxt1.getText());
                double B= Double.parseDouble(LblTxt2.getText());
                double result=A+B;
                LblTxt3.setText(A+"+"+B+"= "+result+"\n");
            }
            if(e.getSource()==b2)
            {
                double A= Double.parseDouble(LblTxt1.getText());
                double B= Double.parseDouble(LblTxt2.getText());
                double result=A-B;
                LblTxt3.setText(A+"-"+B+"= "+result+"\n");
            }
            if(e.getSource()==b3)
            {
                double A= Double.parseDouble(LblTxt1.getText());
                double B= Double.parseDouble(LblTxt2.getText());
                double result=A*B;
                LblTxt3.setText(A+"*"+B+"= "+result+"\n");
            }
            if(e.getSource()==b4)
            {
                double A= Double.parseDouble(LblTxt1.getText());
                double B= Double.parseDouble(LblTxt2.getText());
                double result=A/B;
                LblTxt3.setText(A+"/"+B+"= "+result+"\n");
            }
            if(e.getSource()==b5)
            {
                double A= Double.parseDouble(LblTxt1.getText());
                double B= Double.parseDouble(LblTxt2.getText());
                double result=(int) Math.pow(A, B);
                LblTxt3.setText(A+"^"+B+"= "+result+"\n");
            }
          
        }
    }
    
}
