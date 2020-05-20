/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class child9 extends JFrame implements ItemListener, ListSelectionListener {
    
    private JComboBox depCb;
    private String[] departments={"", "Computer Science", "Information System", "Computer Network"};
    
    private JList hobbyLt;
    private String[] hobbies={"Reading","Writing","Swimming"};
    
    private JTextArea txtArea;
        
    public child9()
    {
        super("I AM CHILD FRAME");
        setLayout(new FlowLayout());
        
        depCb= new JComboBox(departments);
        add(depCb);
        
        hobbyLt= new JList(hobbies);
        add(hobbyLt);
        
        txtArea= new JTextArea(5,40);
        add(txtArea);
        
        depCb.addItemListener(this);
        hobbyLt.addListSelectionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange()==1)
            if(depCb.getSelectedIndex()==0)
                JOptionPane.showMessageDialog(rootPane, "You have to select a department", "Message", JOptionPane.ERROR_MESSAGE);
        else
        {
            for(int i=0;i<4;i++)
                if(depCb.getSelectedItem()==departments[i])
                JOptionPane.showMessageDialog(rootPane, "You have selected: "+depCb.getSelectedItem(), "Message",
                JOptionPane.INFORMATION_MESSAGE);
            txtArea.setText(txtArea.getText()+depCb.getSelectedItem()+"\n");
        }
    }
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        for(int i=0;i<3;i++)
        if(hobbyLt.getSelectedValue()==hobbies[i])    
            JOptionPane.showMessageDialog(rootPane, "You have selected: "+hobbyLt.getSelectedValue(), 
                    "Message", JOptionPane.INFORMATION_MESSAGE);
        txtArea.setText(txtArea.getText()+hobbyLt.getSelectedValue()+"\n");
    }    
}
