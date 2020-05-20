/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask8;
/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class LabTask8 extends JFrame {
    
    private static JPanel p1= new JPanel();
    private static JLabel genderLbl= new JLabel("Select you gender: ");
    private static JRadioButton maleBtn= new JRadioButton("Male");
    private static JRadioButton femaleBtn= new JRadioButton("Female");
    private static JLabel depLbl= new JLabel("Select you department: ");
    private static JRadioButton CSBtn= new JRadioButton("Computer Science");
    private static JRadioButton ISBtn= new JRadioButton("Information System");
    private static JRadioButton CNBtn= new JRadioButton("Computer Network");
    private static JLabel statusLbl= new JLabel("Select you status: ");
    private static JRadioButton marriedBtn= new JRadioButton("Married");
    private static JRadioButton singleBtn= singleBtn= new JRadioButton("Single");
    private static ButtonGroup gndGroup= new ButtonGroup();
    private static ButtonGroup depGroup= new ButtonGroup();
    private static ButtonGroup statusGroup= new ButtonGroup();
    private static JTextArea txtArea= new JTextArea(5,20);
    private static JButton doneBtn= new JButton("Done");
    private static JButton resetBtn= new JButton("Reset");

    ActionListenerHandler handler1= new ActionListenerHandler();  
    ItemListenerHandler handler2= new ItemListenerHandler(); 

    public static void main(String[] args) {
        
        LabTask8 frm= new LabTask8();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(300, 400);
        frm.setTitle("Student Registarion Form");
        
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p1.add(genderLbl);
        gndGroup.add(maleBtn);
        gndGroup.add(femaleBtn);
        p1.add(maleBtn);
        p1.add(femaleBtn);
        p1.add(depLbl);
        depGroup.add(CSBtn);
        depGroup.add(ISBtn);
        depGroup.add(CNBtn);
        p1.add(CSBtn);
        p1.add(ISBtn);
        p1.add(CNBtn);
        p1.add(statusLbl);
        statusGroup.add(marriedBtn);
        statusGroup.add(singleBtn);
        p1.add(marriedBtn);
        p1.add(singleBtn);
        
        txtArea.setEditable(false);
        p1.add(txtArea);
        
        p1.add(doneBtn);
        p1.add(resetBtn);
        
        frm.add(p1);

        doneBtn.addActionListener(frm.handler1);
        resetBtn.addActionListener(frm.handler1);

        maleBtn.addItemListener(frm.handler2);
        femaleBtn.addItemListener(frm.handler2);
        CSBtn.addItemListener(frm.handler2);
        ISBtn.addItemListener(frm.handler2);
        CNBtn.addItemListener(frm.handler2);
        marriedBtn.addItemListener(frm.handler2);
        singleBtn.addItemListener(frm.handler2);
    }
    private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==doneBtn)
            {
                if(!(maleBtn.isSelected())&&(!(femaleBtn.isSelected())))
                {
                    JOptionPane.showMessageDialog(rootPane, "Select you gender!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(!(CSBtn.isSelected())&&(!(ISBtn.isSelected()))&&(!(CNBtn.isSelected())))
                {
                    JOptionPane.showMessageDialog(rootPane, "Select you department!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(!(marriedBtn.isSelected())&&(!(singleBtn.isSelected())))
                {
                    JOptionPane.showMessageDialog(rootPane, "Select you status!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Registration Succeed", "Registration Succeed", 
                    JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if(e.getSource()==resetBtn)
            {
                if(maleBtn.isSelected()||(femaleBtn.isSelected()))
                {
                    gndGroup.clearSelection();
                    txtArea.setText(txtArea.getText().replaceAll("Gender: "+maleBtn.getText()+"\n", ""));
                    txtArea.setText(txtArea.getText().replaceAll("Gender: "+femaleBtn.getText()+"\n", ""));
                }
                if(CSBtn.isSelected()||(ISBtn.isSelected())||(CNBtn.isSelected()))
                {
                    depGroup.clearSelection();
                    txtArea.setText(txtArea.getText().replaceAll("Department: "+CSBtn.getText()+"\n", ""));
                    txtArea.setText(txtArea.getText().replaceAll("Department: "+ISBtn.getText()+"\n", ""));
                    txtArea.setText(txtArea.getText().replaceAll("Department: "+CNBtn.getText()+"\n", ""));
                }
                if(marriedBtn.isSelected()||(singleBtn.isSelected()))
                {
                    statusGroup.clearSelection();
                    txtArea.setText(txtArea.getText().replaceAll("Stauts: "+marriedBtn.getText()+"\n", ""));
                    txtArea.setText(txtArea.getText().replaceAll("Stauts: "+singleBtn.getText()+"\n", ""));
                }
                
            }
        }
    }
    private class ItemListenerHandler implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            if(e.getSource()==maleBtn)
            {
                if(maleBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Gender: "+maleBtn.getText()+"\n");
            }
            if(e.getSource()==femaleBtn)
            {
                if(femaleBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Gender: "+femaleBtn.getText()+"\n");
            }
            if(e.getSource()==CSBtn)
            {
                if(CSBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Department: "+CSBtn.getText()+"\n");
            }
            if(e.getSource()==ISBtn)
            {
                if(ISBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Department: "+ISBtn.getText()+"\n");
            }
            if(e.getSource()==CNBtn)
            {
                if(CNBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Department: "+CNBtn.getText()+"\n");
            }
            if(e.getSource()==marriedBtn)
            {
                if(marriedBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Stauts: "+marriedBtn.getText()+"\n");
            }
            if(e.getSource()==singleBtn)
            {
                if(singleBtn.isSelected())
                txtArea.setText(txtArea.getText()+"Stauts: "+singleBtn.getText()+"\n");
            }
        }
    }
}
