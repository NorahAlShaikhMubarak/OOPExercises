/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpicture;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TestPicture extends JFrame {

        private JLabel nlbl=new JLabel("Welcome To King Faisal University");  
        
        Icon pic=new ImageIcon(getClass().getResource("pic.png"));
        private JLabel plbl=new JLabel(pic,SwingConstants.LEFT);
        
    
    public static void main(String[] args)
    {
        
        TestPicture p = new TestPicture();
        
        p.setVisible(true);
        p.setLayout(new FlowLayout());
        p.add(p.plbl);
        p.add(p.nlbl);
        p.setSize(500, 200);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
    
}
