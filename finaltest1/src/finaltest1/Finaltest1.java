/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest1;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Finaltest1 extends JFrame implements ActionListener{
    
    private JButton btn;
    
    Finaltest1()
    {
        super("I AM MAIN FRAME");
        setLayout(new FlowLayout());
        
        btn= new JButton("Press me!!");
        add(btn);
        
        btn.addActionListener(this);
    }

    public static void main(String[] args) 
    {
        Finaltest1 mainframe= new Finaltest1();
        mainframe.setSize(300, 300);
        mainframe.setVisible(true);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn)
        {
        childFrm child= new childFrm();
        child.setVisible(true);
        child.setSize(300, 300);
        }
        
    }
    
}
