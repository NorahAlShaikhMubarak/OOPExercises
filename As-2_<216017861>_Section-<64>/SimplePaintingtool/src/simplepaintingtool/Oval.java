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
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JColorChooser;
import javax.swing.JButton;
public class Oval extends JPanel implements ActionListener{
    
    private Color color;
    private JButton colorBtn;
    JPanel panel;
    
    public Oval()
    {
        colorBtn= new JButton("Change color");
        add(colorBtn);
        
        colorBtn.addActionListener(this);
    }
    public void paintComponent(Graphics g)
    {
        
    super.paintComponent(g);
    this.setBackground( Color.WHITE );
    
    g.setColor(color);
    g.drawOval(195, 100, 90, 55);
    g.fillOval(290, 100, 90, 55);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        color=JColorChooser.showDialog(this, "Choose text color", color);
        repaint();
        
    }
}

