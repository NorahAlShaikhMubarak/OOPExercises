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
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class RatingFrame extends JFrame implements ActionListener{

    private ButtonGroup ratinggroup;
    private JRadioButton goodBttn;
    private JRadioButton badBttn;
    private JRadioButton normalBttn;
    private JLabel lbl;
    private JLabel lblthanku;
    
    private GridLayout gridlayout;
    private FlowLayout flowLayout;
    
    private JButton submitBtn;
    
    public RatingFrame ()
    {
    super("Rating");
    flowLayout= new FlowLayout();
    setLayout(new BorderLayout());
    setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
    setLayout(new FlowLayout());
    gridlayout= new GridLayout(10,1,3,3);
    setLayout(gridlayout);
    
    lbl = new JLabel (" Please, rate our application.. ");
    add(lbl, BorderLayout.SOUTH);
     
    goodBttn = new JRadioButton ("Average");
    add(goodBttn,BorderLayout.WEST);
    normalBttn = new JRadioButton ("Good");
    add (normalBttn,BorderLayout.CENTER);   
    badBttn = new JRadioButton ("Perfect");
    add(badBttn,BorderLayout.EAST); 
    ratinggroup = new ButtonGroup ();
     
    ratinggroup.add(goodBttn);
    ratinggroup.add(badBttn);
    ratinggroup.add(normalBttn);
     
    lblthanku= new JLabel("Thank you.. Visit us again");
    add(lblthanku,BorderLayout.SOUTH);
    
    submitBtn= new JButton("Submit");
    add(submitBtn);
    
    submitBtn.addActionListener(this);
 
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submitBtn)
        {
            WelcomeFrame childFrame2= new WelcomeFrame();
            childFrame2.setSize(500, 300);
            childFrame2.setVisible(true);
        }
            
    }
    
}
