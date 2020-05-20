/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmid;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.SwingConstants;
public class TestMid extends JFrame {
    
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel resultlbl;
    private JTextField txtLbl1;
    private JTextField txtLbl2;
    private JTextField resulttxt;
    private JLabel picLabel;
    private Icon pic;
    
    public TestMid()
    {
        super("Add two numbers");
        setLayout(new FlowLayout());
        
        pic= new ImageIcon(getClass().getResource("kfu.png"));
        picLabel= new JLabel(pic,SwingConstants.LEFT);
        add(picLabel);
        
        lbl1= new JLabel("Insert number: ");
        add(lbl1);
        txtLbl1= new JTextField(10);
        add(txtLbl1);
        
        lbl2= new JLabel("Insert number: ");
        add(lbl2);
        txtLbl2= new JTextField(10);
        add(txtLbl2);
        
        resultlbl= new JLabel("Result: ");
        add(resultlbl);
        resulttxt= new JTextField(10);
        resulttxt.setEditable(false);
        add(resulttxt);  
        
        
        ActionListenerHandler handler= new ActionListenerHandler();
        txtLbl2.addActionListener(handler);
        
    }

    public static void main(String[] args) {
        
        
        TestMid frm= new TestMid();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(250,150);

    }
    
    private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {
            int num1= Integer.parseInt(txtLbl1.getText());
            int num2= Integer.parseInt(txtLbl2.getText());
            int result=num1+num2;
            
            resulttxt.setText(num1+"+"+num2+"="+result);
            
        }
    }
    
}
