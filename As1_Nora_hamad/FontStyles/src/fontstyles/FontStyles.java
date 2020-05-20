/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontstyles;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
public class FontStyles extends JFrame {

    static JTextField txt= new JTextField("Watch the font style, type and size changes", 40);
    static JCheckBox b1= new JCheckBox("Bold");
    static JCheckBox b2= new JCheckBox("Italic");
    
    private static String[] fonts= { Font.SERIF, Font.SANS_SERIF, Font.MONOSPACED };
    static JComboBox c1= new JComboBox(fonts);
    
    private static String[] size={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
    static JComboBox c2= new JComboBox(size);
    

    
    
    public static void main(String[] args) {
        
        FontStyles frm= new FontStyles();
        frm.setTitle("Text Editor Frame");
        frm.setSize(500 ,200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        frm.setVisible(true);
        
        frm.add(txt);
        frm.add(b1);
        frm.add(b2);
        frm.add(c1);
        frm.add(c2);

        
        ItemListenerHandler1 handler1= new ItemListenerHandler1();
        b1.addItemListener(handler1);
        b2.addItemListener(handler1);
        
        ItemListenerHandler2 handler2= new ItemListenerHandler2();
        c1.addItemListener(handler2);
        
        ItemListenerHandler3 handler3= new ItemListenerHandler3();
        c2.addItemListener(handler3);
    }
    private static class ItemListenerHandler1 implements ItemListener
    {
        @Override
        public void itemStateChanged (ItemEvent e)
        {
            Font f= null;
            if(b1.isSelected()&&b2.isSelected())
            {
                f= new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            }
            else if(b1.isSelected())
            {
                f= new Font("Serif", Font.BOLD, 14);
            }
            else if(b2.isSelected())
            {
                f= new Font("Serif", Font.ITALIC, 14);
            }
            else
            {
                f= new Font("Serif", Font.PLAIN, 14);
            }
            txt.setFont(f);
        }
    }
        private static class ItemListenerHandler2 implements ItemListener
    {
        @Override
        public void itemStateChanged (ItemEvent e)
        {
            Font f= null;
            if(e.getStateChange()==ItemEvent.SELECTED)
            {
                if(b1.isSelected()&&b2.isSelected())
            {
                f= new Font((String)c1.getSelectedItem(),Font.BOLD+Font.ITALIC,c2.getSelectedIndex());
                
                txt.setFont(f);
            }
            else if(b1.isSelected())
            {
                f= new Font((String)c1.getSelectedItem(),Font.BOLD+Font.ITALIC,c2.getSelectedIndex());  
                txt.setFont(f);
            }
            else if(b2.isSelected())
            {    
                f= new Font((String)c1.getSelectedItem(),Font.BOLD+Font.ITALIC,c2.getSelectedIndex());  
                txt.setFont(f);        
            }
            else
            {
                f= new Font((String)c1.getSelectedItem(),Font.PLAIN,c2.getSelectedIndex());  
                txt.setFont(f); 
            }
            }

        }
    }
        private static class ItemListenerHandler3 implements ItemListener
    {
        @Override
        public void itemStateChanged (ItemEvent e)
        {
            Font f= null;
            if(e.getStateChange()==ItemEvent.SELECTED)
            {
                for(int size=1;size<=20;size++)
                {
                    int fsize=c2.getSelectedIndex();
                    if(fsize==size)
                    {
                        if(b1.isSelected()&&b2.isSelected())
                        {
                            f= new Font((String)c1.getSelectedItem(),Font.BOLD+Font.ITALIC,fsize);
                            txt.setFont(f);
                        }
                        else if(b1.isSelected())
                        {
                            f= new Font((String)c1.getSelectedItem(),Font.BOLD+Font.ITALIC,fsize);  
                            txt.setFont(f);
                        }
                        else if(b2.isSelected())
                        {    
                            f= new Font((String)c1.getSelectedItem(),Font.BOLD+Font.ITALIC,fsize);  
                            txt.setFont(f);        
                        }
                        else
                        {
                            f= new Font((String)c1.getSelectedItem(),Font.PLAIN,fsize);  
                            txt.setFont(f); 
                        }
                        
                    }
                }
                
            }
        }
    }
}
