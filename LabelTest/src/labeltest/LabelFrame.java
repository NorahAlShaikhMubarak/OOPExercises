/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeltest;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame()
    {
        super( "Testing label" );
        setLayout(new FlowLayout());
        label1= new JLabel( "Label with text" );
        label1.setToolTipText( "This is label1" );
        add(label1);
        
        Icon bug = new ImageIcon(getClass().getResource( "bug1.jpg" ));
        label2= new JLabel( "Label with text and icon", bug, SwingConstants.LEFT );
        label2.setToolTipText( "This is label2" );
        add(label2);
        
        label3= new JLabel();
        label3.setText( "Label with icon and text at bottom" );
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText( "This is label3" );
        add (label3);
        
    }
   
}
