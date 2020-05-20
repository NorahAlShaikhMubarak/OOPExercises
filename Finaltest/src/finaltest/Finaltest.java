/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;


/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JButton;
public class Finaltest extends JFrame implements ActionListener {
    
    private JButton btn;
    
    Finaltest()
    {
        super("Main frame");
        setLayout(new FlowLayout());
        btn= new JButton("Press me");
        add(btn);
        
        btn.addActionListener(this);
    }
    
    
           


    public static void main(String[] args) 
    {
        Finaltest mainfrm= new Finaltest();
        mainfrm.setSize(300, 300);
        mainfrm.setVisible(true);
        mainfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn)
        {
            childfrm Childfrm=new childfrm();
            Childfrm.setSize(300, 300);
            Childfrm.setVisible(true);


        }
                    
        
    }
    
}
