/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picturetest;
/**
 *
 * @author norahalshaikhmubarak
 */
//LAB4 EXERCISE2
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PictureTest extends JFrame {
    
    private JLabel txtLbl;
    private JLabel picLbl;
    private Icon icon;
    
    PictureTest()
    {
        super("Testing my company frame");
        setLayout(new FlowLayout());
        
        txtLbl=new JLabel("Welcome to Norah's Company");
        
        icon= new ImageIcon(getClass().getResource("KFU.png"));
        picLbl=new JLabel(icon,SwingConstants.LEFT);
        add(picLbl);
        add(txtLbl);

    }

    public static void main(String[] args) {
        
        PictureTest frm=new PictureTest();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(500, 300);
    }
    
}
