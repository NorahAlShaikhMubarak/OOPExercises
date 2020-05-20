/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class childfrm extends JFrame implements ActionListener
{
    
    private JCheckBox CS;
    private JCheckBox IS;
    private JCheckBox CN;
    
    private JLabel lbl;
    private JButton btn;
    
    childfrm()
    {
        super("Child frame");
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
        
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn)
        {
            if(CS.isSelected()||IS.isSelected()||CN.isSelected())
            {

                JOptionPane.showMessageDialog(rootPane, "You have selected: "+
                (CS.isSelected()?CS.getText()+",":"")+
                (IS.isSelected()?IS.getText()+",":"")+
                (CN.isSelected()?CN.getText():"")        
                , "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "You have to choose your major!!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
}

