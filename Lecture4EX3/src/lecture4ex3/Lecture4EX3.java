/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4ex3;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.Font;
public class Lecture4EX3 extends JFrame {
    
    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;
        
     public Lecture4EX3()
    {
       super( "JCheckBox Test" );
       setLayout( new FlowLayout() ); 

       textField = new JTextField( "Watch the font style change", 20 );
       textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
       add( textField ); 
       
       boldJCheckBox = new JCheckBox( "Bold" ); 
       italicJCheckBox = new JCheckBox( "Italic" );
       add( boldJCheckBox ); 
       add( italicJCheckBox );
       
               
        ItemListenerHandler handler1= new ItemListenerHandler();
        boldJCheckBox.addItemListener(handler1);
        italicJCheckBox.addItemListener(handler1);
       
    }

    public static void main(String[] args) {
        
        Lecture4EX3 frm= new Lecture4EX3();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(200, 100);
    }
    
    private class ItemListenerHandler implements ItemListener
    {
        @Override
        public void itemStateChanged (ItemEvent e)
        {
            Font f= null;
            if(boldJCheckBox.isSelected()&&italicJCheckBox.isSelected())
            {
                f= new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            }
            else if(boldJCheckBox.isSelected())
            {
                f= new Font("Serif", Font.BOLD, 14);
            }
            else if(italicJCheckBox.isSelected())
            {
                f= new Font("Serif", Font.ITALIC, 14);
            }
            else
            {
                f= new Font("Serif", Font.PLAIN, 14);
            }
            textField.setFont(f);
        }
    }

}
