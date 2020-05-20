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
import javax.swing.JPanel;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JColorChooser;
public class Draw extends JPanel implements ActionListener{
    
    private JButton colorBtn;
    private Color color;

    private int pointCount= 0;
    private Point[] points= new Point[10000];

    public Draw()
    {
        colorBtn= new JButton("Select Color");
        add(colorBtn);
        
        colorBtn.addActionListener(this);
        
        addMouseMotionListener
        (
        new MouseMotionAdapter()
        {
             public void mouseDragged(MouseEvent e)
            {
                if(pointCount<points.length)
                {
                    points[pointCount]=e.getPoint();
                    ++pointCount;
                    repaint();
                }
             }   
          }
        );   
}

    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    this.setBackground( Color.WHITE );

    g.setColor(color);
    for(int i=0;i<pointCount;i++)
    g.drawOval(points[i].x, points[i].y, 4, 4 );
    
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        color=JColorChooser.showDialog(this, "Choose text color", color);
        repaint();
        
    }
}
