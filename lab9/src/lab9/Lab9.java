/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Lab9 extends JFrame implements ActionListener {
    
    private JButton btn;
    
    Lab9()
    {
        super("I AM MAIN FRAME");
        setLayout(new FlowLayout());
        
        btn= new JButton("PRESS ME");
        add(btn);
        
        btn.addActionListener(this);
    }

    public static void main(String[] args) 
    {
        Lab9 mainfrm= new Lab9();
        mainfrm.setSize(255, 300);
        mainfrm.setVisible(true);
        mainfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn)
        {
            child9 childfrm= new child9();
            childfrm.setSize(255, 300);
            childfrm.setVisible(true);
        }
    }
    
}
