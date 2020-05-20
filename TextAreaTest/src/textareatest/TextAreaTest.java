/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textareatest;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TextAreaTest extends JFrame {
    
    private JLabel Lbl;
    private JTextArea areaTxt;
    private JTextField txtField;
    private JButton resetBtn;
    private JButton doneBtn;
    private JScrollPane scroll;
    
    TextAreaTest()
    {
        super("JTextArea");
        setLayout(new FlowLayout());
        
        Lbl= new JLabel("Describe yourself");
        add(Lbl);
        
        areaTxt= new JTextArea(10,20);
        
        scroll= new JScrollPane(areaTxt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scroll);
        
        areaTxt.setLineWrap(true);
        areaTxt.setWrapStyleWord(true);
        
        resetBtn= new JButton("Reset");
        add(resetBtn);
        
        doneBtn= new JButton("Done");
        add(doneBtn);
        
        txtField= new JTextField(20);
        txtField.setEditable(false);
        add(txtField);
        
        ActionListenerHandler handler= new ActionListenerHandler();
        resetBtn.addActionListener(handler);
        doneBtn.addActionListener(handler);

    }

    public static void main(String[] args) {
        
        TextAreaTest frm= new TextAreaTest();
        frm.setVisible(true);
        frm.setSize(250, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==doneBtn)
            {
                if(areaTxt.getText().isEmpty())
                {
                    txtField.setText("*YOU did not describe yourself");
                }
                else
                {
                    txtField.setText(" ");
                }
            }
            if(e.getSource()==resetBtn)
            {
                areaTxt.setText(" ");
                txtField.setText(" ");
            }
        }
    }
}
