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
public class Circle extends JPanel implements ActionListener{
    
    private Color color;
    private JButton colorBtn;
    JPanel panel;
    
    public Circle()
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
    g.drawOval(150, 50, 90, 90);
    g.fillOval(150, 160, 90, 90);
    

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        color=JColorChooser.showDialog(this, "Choose text color", color);
        repaint();
        
    }
}

