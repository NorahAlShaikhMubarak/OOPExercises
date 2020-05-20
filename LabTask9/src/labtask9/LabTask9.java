/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask9;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JTextArea;
public class LabTask9 extends JFrame {

    static JLabel depLbl=new JLabel("Select your department:");  
    static String[] departments={"","Computer Science","Information System","Computer Networks"};
    static JComboBox depCb=new JComboBox(departments);
    
    static JLabel hbLbl=new JLabel("Select your department:");  
    static String[] hobbies={"Swimming","Reading","Writing", "Other"};
    static JList hbLst=new JList(hobbies);
    
    static JTextArea area= new JTextArea(4,20);

   
    ItemHandler handler1= new ItemHandler();
    ListHandler handler2= new ListHandler();
    
    public static void main(String[] args) {
        
        LabTask9 frm=new LabTask9();
        frm.setLayout(new FlowLayout());
        frm.setTitle("JComboBox Example");        
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setVisible(true);        
        
        frm.add(depLbl);
        frm.add(depCb);
        depCb.addItemListener(frm.handler1);

        hbLst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        frm.add(hbLbl);
        frm.add(hbLst);
        
        frm.add(area);
        
        hbLst.addListSelectionListener(frm.handler2);
    }
    public class ItemHandler implements ItemListener 
    {
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getStateChange()==1)
        if(depCb.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(rootPane, "You have to select a department", "Department", JOptionPane.ERROR_MESSAGE);
        else
            for(int i=1;i<4;i++)
                if(depCb.getSelectedItem()==departments[i])
            {
                JOptionPane.showMessageDialog(rootPane, "You have selected: "+depCb.getSelectedItem(), "Department",
                JOptionPane.INFORMATION_MESSAGE);
                area.setText(area.getText()+"Your department: "+depCb.getSelectedItem()+"\n");
            }          
    }
    }
    
    public class ListHandler implements ListSelectionListener
    {
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {        
            for(int i=0;i<4;i++)
                if(hbLst.getSelectedValue()==hobbies[i])
                {
                 JOptionPane.showMessageDialog(rootPane, "You have selected: "+hbLst.getSelectedValue(), 
                 "Department", JOptionPane.INFORMATION_MESSAGE);
                 area.setText(area.getText()+"your hobbies: \n"+"["+hbLst.getSelectedValue()+"]"+"\n");
                } 
    }
    }
}

