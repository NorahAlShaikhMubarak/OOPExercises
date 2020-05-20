/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepaintingtool;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintingTool extends JFrame{
    
    private JLabel lbl;
    private JButton recBtn;
    private JButton seqBtn;
    private JButton cirBtn;
    private JButton ovalBtn;
    private JButton lineBtn;
    private JButton freedrawBtn;
    private GridLayout layout;
    
    public PaintingTool(){
        
        super("Simple Paint Application");
        layout = new GridLayout (10, 1, 5, 5);
        setLayout(layout);
        
        lbl = new JLabel ("Select a shape to be drawn: ");
        lbl.setHorizontalAlignment( SwingConstants.CENTER);
        add(lbl);
        
        recBtn = new JButton ("Rectangle");
        add(recBtn);
        
        seqBtn = new JButton ("Sequare");
        add(seqBtn);
        
        cirBtn = new JButton ("Circle");
        add(cirBtn);
        
        ovalBtn = new JButton ("Oval");
        add(ovalBtn);
        
        lineBtn = new JButton ("Line");
        add(lineBtn);
        
        freedrawBtn= new JButton("Draw");
        add(freedrawBtn);
        
        ActionListenerHandler handler = new ActionListenerHandler ();
        recBtn.addActionListener(handler);
        seqBtn.addActionListener(handler);
        cirBtn.addActionListener(handler);
        ovalBtn.addActionListener(handler);
        lineBtn.addActionListener(handler);
        freedrawBtn.addActionListener(handler);
        
    }
    private class ActionListenerHandler implements ActionListener {
        
        @Override

        public void actionPerformed(ActionEvent e)

        {
           if (e.getSource() == recBtn) {
               
               JFrame frame1 = new JFrame ("Drawing Shapes");
               Rectangle childframe1 = new Rectangle ();
               childframe1.setBackground(Color.WHITE);
               frame1.add(childframe1);
               frame1.setSize(300,330);
               frame1.setVisible(true);
               
           }
           
           if (e.getSource() == seqBtn) {
               
               JFrame frame2 = new JFrame ("Drawing Shapes");
               Sequare childframe2 = new Sequare ();
               childframe2.setBackground(Color.WHITE);
               frame2.add(childframe2);
               frame2.setSize(300,330);
               frame2.setVisible(true);
               
           }
           
           if (e.getSource() == cirBtn) {
               
               JFrame frame3 = new JFrame ("Drawing Shapes");
               Circle childframe3 = new Circle ();
               childframe3.setBackground(Color.WHITE);
               frame3.add(childframe3);
               frame3.setSize(300,330);
               frame3.setVisible(true);
               
           }
           
           if (e.getSource() == ovalBtn) {
               
               JFrame frame4 = new JFrame ("Drawing Shapes");
               Oval childframe4 = new Oval ();
               childframe4.setBackground(Color.WHITE);
               frame4.add(childframe4);
               frame4.setSize(300,330);
               frame4.setVisible(true);
               
           }
           
           if (e.getSource() == lineBtn) {
               
               JFrame frame5 = new JFrame ("Drawing Shapes");
               Line childframe5 = new Line ();
               childframe5.setBackground(Color.WHITE);
               frame5.add(childframe5);
               frame5.setSize(300,330);
               frame5.setVisible(true);
               
           }
            if (e.getSource() == freedrawBtn) {
               
               JFrame frame6 = new JFrame ("Drawing Shapes");
               Draw childframe6 = new Draw ();
               childframe6.setBackground(Color.WHITE);
               frame6.add(childframe6);
               frame6.setSize(300,330);
               frame6.setVisible(true);
               
           }
           
        }
    }
    
}