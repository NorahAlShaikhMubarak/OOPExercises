/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask12;

/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
public class LabTask12 extends JFrame implements ActionListener {
    
    private static final String[] fonts= {Font.MONOSPACED, Font.SERIF };
    private static JComboBox fontCb;
    
    private static final String[] size={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
    private static JComboBox sizeCb;
    
    private JButton colorBtn;
    private static JTextArea txtArea;
    private Color color;
    
    public LabTask12()
    {
        super("Main Frame");
        setLayout(new FlowLayout());
        
        fontCb= new JComboBox(fonts);
        add(fontCb);
        
        sizeCb= new JComboBox(size);
        add(sizeCb);
        
        colorBtn= new JButton("Select Color");
        add(colorBtn);
        
        txtArea= new JTextArea(10,30);
        add(txtArea);
        
        colorBtn.addActionListener(this);
        
        ItemListenerHandler handler= new ItemListenerHandler();
        fontCb.addItemListener(handler);
        sizeCb.addItemListener(handler);
        
    }

    public static void main(String[] args) {
        
        LabTask12 frm= new LabTask12();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(450, 250);
        
    }
            
    @Override
    public void actionPerformed(ActionEvent e)
    {
        color=JColorChooser.showDialog(this, "Choose text color", color);
        txtArea.setForeground(color);
    }
    
    private static class ItemListenerHandler implements ItemListener
    {
    @Override
       public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange()==ItemEvent.SELECTED)
        {
        for(int size = 0;size<16;size++)
        {
        int fsize=sizeCb.getSelectedIndex();
        if(fsize==size)
        if(fontCb.getSelectedIndex()==0)
        {
            txtArea.setFont(new Font("MONOSPACED", Font.PLAIN,fsize));
        }
        if(fontCb.getSelectedIndex()==1)
        {
            txtArea.setFont(new Font("SERIF", Font.PLAIN,fsize));
        }
        }
        }
    }
    }
}
