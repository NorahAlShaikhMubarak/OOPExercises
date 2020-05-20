/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemid;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
public class ExampleMid extends JFrame {
    
    private JLabel Lbl1;
    private JLabel Lbl2;
    private JButton squareBtn;
    private JButton rectangleBtn;
    private JButton circleBtn;
    private JTextArea txtArea;
    private JScrollPane scroll;
    
    ExampleMid()
    {
        super("Compute circumference");
        setLayout(new FlowLayout());
        
        Lbl1= new JLabel("Select shape to compute circumference");
        add(Lbl1);
        
        squareBtn= new JButton("Square");
        add(squareBtn);
        
        rectangleBtn= new JButton("Rectangle");
        add(rectangleBtn);
        
        circleBtn= new JButton("Circle");
        add(circleBtn);
        
        Lbl2= new JLabel("Results");
        add(Lbl2);
        
        txtArea= new JTextArea (10,20);
        
        scroll= new JScrollPane(txtArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scroll);
        
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        
        ActionPerformedHandler handler= new ActionPerformedHandler();
        squareBtn.addActionListener(handler);
        rectangleBtn.addActionListener(handler);
        circleBtn.addActionListener(handler);

        
    }

    
    public static void main(String[] args) {
        
        ExampleMid frm= new ExampleMid();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(275, 300);
        
        JOptionPane.showMessageDialog(null, "Name: Norah Alshaikhmubarak \n ID:216017861", 
        "Programmer Information", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public class ActionPerformedHandler implements ActionListener
    {
        String length1;
        double num1;
        double circumference1;
        
        String length2;
        String width1;
        double num2;
        double num3;
        double circumference2;
        
        String radious;
        double circumference3;
        double num4;
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==squareBtn)
            {
                do
                {
                length1= JOptionPane.showInputDialog(null, "Insert length", 
                "Reading Square Dimensions", JOptionPane.INFORMATION_MESSAGE);
                
                num1=Double.parseDouble(length1);
                
                }while(num1<0);
                
                circumference1=num1*4; 
                String squareTxt="You have selected: Square \nSide= "+num1+"\nCircumference= "+circumference1+"\n----------\n";
                txtArea.setText(txtArea.getText()+squareTxt);
            }
            if(e.getSource()==rectangleBtn)
            {
                do
                {
                   length2= JOptionPane.showInputDialog(null, "Insert length", 
                   "Reading Rectangle Dimensions", JOptionPane.INFORMATION_MESSAGE);
                   width1= JOptionPane.showInputDialog(null, "Insert width", 
                   "Reading Rectangle Dimensions", JOptionPane.INFORMATION_MESSAGE);
                   
                   num2=Double.parseDouble(length2);
                   num3=Double.parseDouble(width1);
                }while(num2<0);
                
                circumference2= 2*num2+2*num3;
                String rectangleTxt="You have selected: Rectangle \nLength= "+num2+"\nWidth= "+num3
                +"\nCircumference= "+circumference2+"\n----------\n";
                txtArea.setText(txtArea.getText()+rectangleTxt);
                
            }
            if(e.getSource()==circleBtn)
            {
                do
                {
                    radious= JOptionPane.showInputDialog(null, "Insert radious", 
                    "Reading Circle Dimensions", JOptionPane.INFORMATION_MESSAGE);
                    
                    num4=Double.parseDouble(radious);
   
                }while(num4<0);
                circumference3=2*3.14*num4;
                String cirlceTxt="You have selected: circle \nSide= "+num4+"\nCircumference= "+circumference3+"\n----------\n";
                txtArea.setText(txtArea.getText()+cirlceTxt);
            }

        }
    }
    
}
