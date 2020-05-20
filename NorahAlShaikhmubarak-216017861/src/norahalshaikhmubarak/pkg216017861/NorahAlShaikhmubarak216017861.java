/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package norahalshaikhmubarak.pkg216017861;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NorahAlShaikhmubarak216017861 extends JFrame implements ActionListener {
    
    private JButton btn;
    
    NorahAlShaikhmubarak216017861()
    {
        super("I AM MAIN FRAME");
        setLayout(new FlowLayout());
        
        btn= new JButton("PRESS ME TO GO TO CHILD FRAME");
        add(btn);
        
        btn.addActionListener(this);
        
    }
    


    public static void main(String[] args)
    {
        NorahAlShaikhmubarak216017861 mainfrm= new NorahAlShaikhmubarak216017861();
        mainfrm.setSize(300, 400);
        mainfrm.setVisible(true);
        mainfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn)
        {
            ChildFrame216017861 childfrm= new ChildFrame216017861();
            childfrm.setSize(300, 400);
            childfrm.setVisible(true);
        }
    }
    
    
    
}
