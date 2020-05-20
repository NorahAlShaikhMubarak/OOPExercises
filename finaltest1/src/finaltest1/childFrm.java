/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest1;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
public class childFrm extends JFrame implements ActionListener, ItemListener{
    
    private JCheckBox CS;
    private JCheckBox IS;
    private JCheckBox CN;
    
    private JLabel lbl;
    private JButton btn;
    
    private JTextArea txtArea;
    
    childFrm()
    {
        super("I AM CHILD FRAME");
        setLayout(new FlowLayout());
        
        lbl= new JLabel("Choose you major!!");
        add(lbl);
        
        CS= new JCheckBox("CS");
        add(CS);
        IS= new JCheckBox("IS");
        add(IS);
        CN= new JCheckBox("CN");
        add(CN);
        
        btn= new JButton("Done");
        add(btn);
        
        txtArea= new JTextArea(5,20);
        add(txtArea);
        
        add(new JScrollPane(txtArea));
        
        btn.addActionListener(this);
        CS.addItemListener(this);
        IS.addItemListener(this);
        CN.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn)
        {
            
            if(CS.isSelected()||IS.isSelected()||CN.isSelected())
            JOptionPane.showMessageDialog(rootPane,"Registered" , "Message", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(rootPane, "Erroooor", "Error", JOptionPane.ERROR_MESSAGE);
        }

}

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource()==CS)
        {
            if(CS.isSelected())
            {
                txtArea.setText(txtArea.getText()+CS.getText()+"\n");
            }
            if(!(CS.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(CS.getText()+"\n", ""));
            } 
        }
        if(e.getSource()==IS)
        {
            if(IS.isSelected())
            {
                txtArea.setText(txtArea.getText()+IS.getText()+"\n");
            }
            if(!(IS.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(IS.getText()+"\n", ""));
            }
        }
        if(e.getSource()==CN)
        {
            if(CN.isSelected())
            {
               txtArea.setText(txtArea.getText()+CN.getText()+"\n"); 
            }
            if(!(CN.isSelected()))
            {
                txtArea.setText(txtArea.getText().replaceAll(CN.getText()+"\n", ""));
            }
        }
           
    }
}
