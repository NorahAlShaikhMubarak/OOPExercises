/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

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
import javax.swing.JOptionPane;
import javax.swing.JButton;
public class TempConverter extends JFrame {

    static JLabel Lbl= new JLabel("Enter the temperature (in F or C)");
    static JTextField LblTxt= new JTextField(20);
    private static JButton button1 =new JButton ("Fahrenheit to Celsius");
    private static JButton button2 =new JButton ("Celsius to Fahrenheit");
    


    public static void main(String[] args) {
        
        TempConverter frm = new TempConverter();
        frm.setTitle("Temperature Converter");
        frm.setLayout(new FlowLayout());
        frm.setSize(500, 150);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
        frm.add(Lbl);
        frm.add(LblTxt);
        
        frm.add(button1);
        frm.add(button2);
        
        ActionListenerHandler handler= new ActionListenerHandler();
        button1.addActionListener(handler);
        button2.addActionListener(handler);

    }
    private static class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==button1)
            {
                double far= Double.parseDouble(LblTxt.getText());
                double cel=(far-32.0)*(0.556); 
                JOptionPane.showMessageDialog(null, "The temperature in Celsius is: "+cel, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                if(e.getSource()==button2)
                {
                    double cel=Double.parseDouble(LblTxt.getText());
                    double far=(cel*0.556)+32.0;
                    JOptionPane.showMessageDialog(null, "The temperature in Fahrenheit is: "+far, "Message", JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        }
    }
    
}
