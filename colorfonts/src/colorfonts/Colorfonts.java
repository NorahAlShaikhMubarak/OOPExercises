/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorfonts;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
public class Colorfonts extends JFrame implements ActionListener, ItemListener{
    
    private static final String[] fonts= {Font.MONOSPACED, Font.SERIF };
    private static JComboBox fontCb;
    
    private static final String[] size={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
    private static JComboBox sizeCb;
    
    private JButton colorBtn;
    private static JTextArea txtArea;
    private Color color;
    
    Colorfonts()
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
        
        fontCb.addItemListener(this);
        sizeCb.addItemListener(this);
        
    }
    

    public static void main(String[] args) {
        
        Colorfonts mainfrm= new Colorfonts();
        mainfrm.setVisible(true);
        mainfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainfrm.setSize(450, 250);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==colorBtn)
            color=JColorChooser.showDialog(this, "Choose a color", color);
            txtArea.setForeground(color);
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
            
    {
        if(e.getStateChange()==1)
        {
            for(int i=0;i<16;i++)
                if(sizeCb.getSelectedIndex()==i)
                if(fontCb.getSelectedIndex()==0)  
                {
                    txtArea.setFont(new Font("MONOSPACED", Font.PLAIN,sizeCb.getSelectedIndex()));
                }
                if(fontCb.getSelectedIndex()==1)
                {
                    txtArea.setFont(new Font("SERIF", Font.PLAIN,sizeCb.getSelectedIndex()));
                }
        }
        
}
}
