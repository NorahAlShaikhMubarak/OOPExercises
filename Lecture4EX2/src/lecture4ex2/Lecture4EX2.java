/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4ex2;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
public class Lecture4EX2 extends JFrame {
    
    private JButton plainBtn;
    private JButton fancyBtn;
    
    public Lecture4EX2()
    {
        super("Testing buttons");
        setLayout(new FlowLayout());
        
        plainBtn= new JButton("Plain buttons");
        add(plainBtn);
        
        Icon icon1= new ImageIcon(getClass().getResource("bug1.jpg"));
        Icon icon2= new ImageIcon(getClass().getResource("bug2.png"));
        
        fancyBtn= new JButton("Fancy Button", icon1);
        fancyBtn.setRolloverIcon(icon2);
        add(fancyBtn);
        
        ActionListenerHandler handler= new ActionListenerHandler();
        plainBtn.addActionListener(handler);
        fancyBtn.addActionListener(handler);
    }

    public static void main(String[] args) {
        
        Lecture4EX2 frm= new Lecture4EX2();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(200, 100);
        frm.setVisible(true);
    }
    
    private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(Lecture4EX2.this, 
            String.format("You pressed: %s", e.getActionCommand()));
        }
    }
}
