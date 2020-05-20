/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopiiproject;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class PaymentFrame extends JFrame implements ActionListener
{
    
    private JLabel fnameLbl;
    private JLabel lnameLbl;
    private JLabel emailLbl;
    private JLabel addressLbl;
    private JLabel countryLbl;
    
    private JTextField fnameTxt;
    private JTextField lnameTxt;
    private JTextField emailTxt;
    private JTextField addressTxt;
    private JTextField countryTxt;
    
    private JRadioButton cardBtn;
    private JRadioButton cashBtn;
    private ButtonGroup btnGroup;
    
    private JButton doneBtn;    
    private GridLayout layout;
    private FlowLayout flowLayout;
    
    public PaymentFrame()
    {
        super("Payment");
        flowLayout= new FlowLayout();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
        setLayout(new FlowLayout());
        layout= new GridLayout(10,1,3,3);
        setLayout(layout);
        
        fnameLbl= new JLabel("First name: ");
        add(fnameLbl);
        fnameTxt= new JTextField(10);
        add(fnameTxt);
        
        lnameLbl= new JLabel("Last name: ");
        add(lnameLbl);
        lnameTxt= new JTextField(10);
        add(lnameTxt);
        
        emailLbl= new JLabel("Email: ");
        add(emailLbl);
        emailTxt= new JTextField(10);
        add(emailTxt);
        
        addressLbl= new JLabel("Address: ");
        add(addressLbl);
        addressTxt= new JTextField(10);
        add(addressTxt);
        
        countryLbl= new JLabel("Country: ");
        add(countryLbl);
        countryTxt= new JTextField(10);
        add(countryTxt);

        cardBtn= new JRadioButton("Card");
        add(cardBtn);
        cashBtn= new JRadioButton("Cash");
        add(cashBtn);
        
        btnGroup= new ButtonGroup();
        btnGroup.add(cardBtn);
        btnGroup.add(cashBtn);
        
        doneBtn= new JButton("Done");
        add(doneBtn);
        
        doneBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==doneBtn)
        {
            if(cardBtn.isSelected())
            {
                CardInfoFrame childframe= new CardInfoFrame();
                childframe.setSize(300, 400);
                childframe.setVisible(true);
            }
            else if(cashBtn.isSelected())
            {
                RatingFrame childframe= new RatingFrame();
                childframe.setSize(300, 400);
                childframe.setVisible(true);
            }
            else if(((!cardBtn.isSelected())||(!cashBtn.isSelected())))
            {
                JOptionPane.showMessageDialog(rootPane, "You have to select a payment type", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
}
