/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class child extends JFrame implements ItemListener {
    
    private JLabel lbl1;
    private JLabel lbl2;
    
    private JRadioButton mBtn;
    private JRadioButton fBtn;
    
    private ButtonGroup genderBtn;
    
    private JRadioButton hBtn; 
    private JRadioButton uBtn;
    private JRadioButton gBtn;
    
    private ButtonGroup schoolBtn;
    
    child()
    {
        super("I AM CHILD FRAME");
        setLayout(new FlowLayout());
                
        lbl1= new JLabel("Select your gender: ");
        add(lbl1);
        
        mBtn= new JRadioButton("Male");
        add(mBtn);
        
        fBtn= new JRadioButton("Female");
        add(fBtn);
        
        genderBtn= new ButtonGroup();
        genderBtn.add(mBtn);
        genderBtn.add(fBtn);
        
        lbl2= new JLabel("Select your degree: ");
        add(lbl2);
        
        hBtn= new JRadioButton("High School");
        add(hBtn);
        
        uBtn= new JRadioButton("Under Graduate");
        add(uBtn);
        
        gBtn= new JRadioButton("Graduate");
        add(gBtn);
        
        schoolBtn= new ButtonGroup();
        schoolBtn.add(hBtn);
        schoolBtn.add(uBtn);
        schoolBtn.add(gBtn);
        
        hBtn.addItemListener(this);
        uBtn.addItemListener(this);
        gBtn.addItemListener(this);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String gender= new String();
        if(mBtn.isSelected())
        {
            gender= mBtn.getText();
        }
        if(fBtn.isSelected())
        {
            gender= fBtn.getText();
        }
        if(hBtn.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "You are: "+gender+"\n"+"You are: "+hBtn.getText()
            , "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        if(uBtn.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "You are: "+gender+"\n"+"Your are: "+uBtn.getText(), 
            "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        if(gBtn.isSelected())
        {
            JOptionPane.showMessageDialog(rootPane, "You are: "+gender+"\n"+"Your are: "+gBtn.getText(), 
            "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
            
        
    }
    
}
