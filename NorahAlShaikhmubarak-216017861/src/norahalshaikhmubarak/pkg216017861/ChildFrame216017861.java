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
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
public class ChildFrame216017861 extends JFrame implements ActionListener, ItemListener {
    
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    
    private JRadioButton mBtn;
    private JRadioButton fBtn;
    
    private ButtonGroup genderBtn;
    
    private JRadioButton hBtn; 
    private JRadioButton uBtn;
    private JRadioButton gBtn;
    
    private ButtonGroup schoolBtn;
    
    private JRadioButton marriedBtn;
    private JRadioButton singleBtn;
    
    private ButtonGroup statusBtn;
    
    private JTextArea txtArea;
    
    private JButton doneBtn;
    private JButton resetBtn;
    
    ChildFrame216017861()
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
        
        lbl3= new JLabel("Select your status: ");
        
        marriedBtn= new JRadioButton("Married");
        add(marriedBtn);
        
        singleBtn= new JRadioButton("Single");
        add(singleBtn);
        
        statusBtn= new ButtonGroup();
        statusBtn.add(marriedBtn);
        statusBtn.add(singleBtn);
        
        txtArea= new JTextArea(5,20);
        add(txtArea);
        
        doneBtn= new JButton("Done");
        add(doneBtn);
        
        resetBtn= new JButton("Reset");
        add(resetBtn);
        
        doneBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        
        mBtn.addItemListener(this);
        fBtn.addItemListener(this);
        hBtn.addItemListener(this);
        uBtn.addItemListener(this);
        gBtn.addItemListener(this);
        marriedBtn.addItemListener(this);
        singleBtn.addItemListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==doneBtn)
        {
            if(!(mBtn.isSelected())&&(!fBtn.isSelected()))
            {
                JOptionPane.showMessageDialog(rootPane, "You have to select you gender", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            if(!(hBtn.isSelected())&(!(uBtn.isSelected()))&&(!(gBtn.isSelected())))
            {
                JOptionPane.showMessageDialog(rootPane, "You have to select you degree", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            if(!(marriedBtn.isSelected())&&(!(singleBtn.isSelected())))
            {
                JOptionPane.showMessageDialog(rootPane, "You have to select you status", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
               JOptionPane.showMessageDialog(rootPane, "Succsess", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(e.getSource()==resetBtn)
        {
            genderBtn.clearSelection();
            schoolBtn.clearSelection();
            statusBtn.clearSelection();
            txtArea.setText(" ");
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==mBtn)
        {
            if(mBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+"Gender: "+mBtn.getText()+"\n");
            }
            if(!(mBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll("Gender: "+mBtn.getText()+"\n", ""));
            }
        }
        if(e.getSource()==fBtn)
        {
            if(fBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+fBtn.getText()+"\n");
            }
            if(!(fBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(fBtn.getText()+"\n", ""));
            }    
        }
        if(e.getSource()==hBtn)
        {
            if(hBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+hBtn.getText()+"\n");
            }
            if(!(hBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(hBtn.getText()+"\n", ""));
            }
        }
        if(e.getSource()==uBtn)
        {
            if(uBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+uBtn.getText()+"\n");
            }
            if(!(uBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(uBtn.getText()+"\n", ""));
            }
        }
        if(e.getSource()==gBtn)
        {
            if(gBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+gBtn.getText()+"\n");
            }
            if(!(gBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(gBtn.getText()+"\n", ""));
            }
        }
        if(e.getSource()==marriedBtn)
        {
            if(marriedBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+marriedBtn.getText()+"\n");
            }
            if(!(marriedBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(marriedBtn.getText()+"\n", ""));
            }
        }
        if(e.getSource()==singleBtn)
        {
            if(singleBtn.isSelected())
            {
                txtArea.setText(txtArea.getText()+singleBtn.getText()+"\n");
            }
            if(!(singleBtn.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(singleBtn.getText()+"\n", ""));
            }
        }
        
        } 
    }
