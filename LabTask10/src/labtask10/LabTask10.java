/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask10;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class LabTask10 extends JFrame implements MouseListener, MouseMotionListener{

    private JLabel mouseLbl;
    private JLabel nameLbl;
    private JTextField nameTxt;
    private JLabel ageLbl;
    private JTextField ageTxt;
    private JLabel depLbl;
    private JTextField depTxt;
    private JLabel doneLbl;
    
    public LabTask10()
    {
        super("Students Registration Form");
        setLayout(new FlowLayout());
        
        mouseLbl= new JLabel("Hint: ");
        add(mouseLbl);
        
        nameLbl= new JLabel("Insert Name: ");
        add(nameLbl);
        nameTxt= new JTextField(10);
        add(nameTxt);
        
        ageLbl= new JLabel("Insert Age: ");
        add(ageLbl);
        ageTxt= new JTextField(10);
        add(ageTxt);
        
        depLbl= new JLabel("Insert Department: ");
        add(depLbl);
        depTxt= new JTextField(10);
        add(depTxt); 
        
        doneLbl= new JLabel("Done");
        add(doneLbl);
        
        nameTxt.addMouseListener(this);
        nameTxt.addMouseMotionListener(this);
        doneLbl.addMouseListener(this);
        doneLbl.addMouseMotionListener(this);
        
    }
    
    public static void main(String[] args) {
        
        LabTask10 frm = new LabTask10();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(350, 200);
        frm.addMouseListener(frm);
        frm.addMouseMotionListener(frm);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
        
       
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
        
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
        
        
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
       
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
        
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        if(e.getSource()==nameTxt)
        {
            mouseLbl.setText("Insert your full name");
        }
        if(e.getSource()!=nameTxt&&e.getSource()!=nameLbl&&
           e.getSource()!=ageTxt&&e.getSource()!=ageLbl&&e.getSource()!=depTxt&&e.getSource()!=depLbl)
        {
            mouseLbl.setText("Please, Finish the form");
        }
        if(e.getSource()==doneLbl)
        {
            if(nameTxt.getText().isEmpty())
            {
                 mouseLbl.setText("Please, insert all required fields");
            }
            else if(ageTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else if(depTxt.getText().isEmpty())
            {
                mouseLbl.setText("Please, insert all required fields");
            }
            else
            {
                mouseLbl.setText("Thanks, you registration done successfully");
            }
        }
    }       
}
