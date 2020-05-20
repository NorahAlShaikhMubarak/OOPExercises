/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Lab8 extends JFrame implements ActionListener {
    
    private JButton btn;
    private JPanel p;

    Lab8()
    {
        super("I AM MAIN FRAME");
        setLayout(new FlowLayout());
        
        btn= new JButton("PRESS ME TO GO");
        add(btn);
        
        btn.addActionListener(this);
    }
    
    

    public static void main(String[] args) {
        
        Lab8 mainframe= new Lab8();
        mainframe.setSize(300, 300);
        mainframe.setVisible(true);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn)
        {
            child childfrm= new child();
            childfrm.setSize(300, 200);
            childfrm.setVisible(true);
        }
    }
}
