/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionlistenerapp;

/**
 *
 * @author norahalshaikhmubarak
 */
//LAB5 EXERCISE3
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ActionListenerApp extends JFrame {
    
    private JLabel Lbl1;
    private JLabel Lbl2;
    private JLabel Lbl3;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    
    ActionListenerApp()
    {
        super("Add two numbers");
        setLayout(new FlowLayout());
        
        Lbl1= new JLabel("Insert Number");
        add(Lbl1);
        
        txt1= new JTextField(10);
        add(txt1);
        
        Lbl2= new JLabel("Insert Number");
        add(Lbl2);
        
        txt2= new JTextField(10);
        add(txt2);
        
        Lbl3= new JLabel("Result");
        add(Lbl3);
        
        txt3= new JTextField(10);
        txt3.setEditable(false);
        add(txt3);
        
        ActionListenerHandler handler= new ActionListenerHandler();
        txt2.addActionListener(handler);
    }



    public static void main(String[] args) {
        
        ActionListenerApp frm= new ActionListenerApp();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(250, 150);

    }
    
    private class ActionListenerHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int num1=Integer.parseInt(txt1.getText());
            int num2=Integer.parseInt(txt2.getText());
            int result= num1+num2;
            
            txt3.setText(num1+"+"+num2+"="+result);
        }
    }

}
