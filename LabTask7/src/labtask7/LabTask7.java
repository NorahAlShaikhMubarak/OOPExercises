/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask7;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LabTask7 extends JFrame {

    private JLabel crslbl;
    private JButton dnBtn;
    private JCheckBox cs220Cbx;
    private JCheckBox IS222Cbx;
    private JCheckBox IS313Cbx;
    private JTextArea crsTA;
    
    public LabTask7()
    {
        super("KFU Course Register");
        setLayout(new FlowLayout());
        
        crslbl= new JLabel("Select your courses for this semester:");
        add(crslbl);
        
        cs220Cbx= new JCheckBox("CS220");
        add(cs220Cbx);
        
        IS222Cbx= new JCheckBox("IS222");
        add(IS222Cbx);
        
        IS313Cbx= new JCheckBox("IS313");
        add(IS313Cbx);
        
        dnBtn= new JButton("Done");
        add(dnBtn);
        
        crsTA= new JTextArea(5,20);
        crsTA.setEditable(false);
        add(crsTA);
        
        ActionListenerHandler handler1= new ActionListenerHandler();
        dnBtn.addActionListener(handler1);
        
        ItemListenerHandler handler2= new ItemListenerHandler();
        cs220Cbx.addItemListener(handler2);
        IS222Cbx.addItemListener(handler2);
        IS313Cbx.addItemListener(handler2);
    }
    public static void main(String[] args) {
        
        LabTask7 frm= new LabTask7();
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setSize(250, 200);
        frm.setVisible(true);

    }
    private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(cs220Cbx.isSelected()||IS222Cbx.isSelected()||IS313Cbx.isSelected())
            {
                JOptionPane.showMessageDialog(rootPane, "The Registration Was successfully DONE",
                "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "You did NOT select a course, \n Please, Select a course!"
                ,"Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private class ItemListenerHandler implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
        if(e.getSource()==cs220Cbx)
        {            
            if(cs220Cbx.isSelected())
            crsTA.setText(crsTA.getText()+cs220Cbx.getText()+"\n");
            if(!(cs220Cbx.isSelected()))
            crsTA.setText(crsTA.getText().replaceAll(cs220Cbx.getText()+"\n", ""));
        }
        if(e.getSource()==IS222Cbx)
        {            
            if(IS222Cbx.isSelected())
            crsTA.setText(crsTA.getText()+IS222Cbx.getText()+"\n");
            if(!(IS222Cbx.isSelected()))
            crsTA.setText(crsTA.getText().replaceAll(IS222Cbx.getText()+"\n", ""));
        }
        if(e.getSource()==IS313Cbx)
        {
            if(IS313Cbx.isSelected())
            crsTA.setText(crsTA.getText()+IS313Cbx.getText()+"\n");
            if(!(IS313Cbx.isSelected()))
            crsTA.setText(crsTA.getText().replaceAll(IS313Cbx.getText()+"\n", ""));
        }
        }

    }
}
    

