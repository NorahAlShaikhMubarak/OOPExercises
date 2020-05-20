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
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
public class TypesOfFlowersFrame extends JFrame implements ActionListener{
    
    private JLabel lbl1;
    private JLabel lbl2;
    private JButton sunflowetBtn;
    private JButton rosesBtn;
    private JButton tulipsBtn;
    private JButton orchidsBtn;
    private JButton lilliesBtn;
    private JButton mixedflowersBtn;
    private JButton sunflowerDesc;
    private JButton rosesDesc;
    private JButton tulipsDesc;
    private JButton orchidsDesc;
    private JButton lilliesDesc;
    private JButton mixedflowersDesc;
    private FlowLayout layout;

    public TypesOfFlowersFrame ()
    {
        super("Types Of Flowers");
        layout= new FlowLayout();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
        setLayout(new FlowLayout());
        setLayout(layout);
        layout.setAlignment(FlowLayout.CENTER);
        
        lbl1= new JLabel("Choose The Flower Type: \n\n\n");
        add(lbl1);
        lbl1.setFont(new Font("Serif", Font.BOLD,35));
        lbl1.setForeground(Color.GRAY);
        
        Icon sunflower= new ImageIcon(getClass().getResource("SF.png"));
        sunflowetBtn= new JButton("Sun Flowers",sunflower);
        add(sunflowetBtn);     
        
        Icon roses= new ImageIcon(getClass().getResource("R.png"));
        rosesBtn= new JButton("Roses ",roses);
        add(rosesBtn);
        
        
        Icon tulips= new ImageIcon(getClass().getResource("T.png"));
        tulipsBtn= new JButton("Tulips",tulips);
        add(tulipsBtn);
        
        Icon orchids= new ImageIcon(getClass().getResource("O.png"));
        orchidsBtn= new JButton("Orchids",orchids);
        add(orchidsBtn);
        
        Icon lillies= new ImageIcon(getClass().getResource("LI.png"));
        lilliesBtn= new JButton("Lillies",lillies);
        add(lilliesBtn);
        
        Icon mixedflowers= new ImageIcon(getClass().getResource("M.png"));
        mixedflowersBtn= new JButton("Mixedflowers",mixedflowers);
        add(mixedflowersBtn);
        
        lbl2= new JLabel("For further information, read the describtion: \n");
        add(lbl2);  
        lbl2.setFont(new Font("Serif", Font.BOLD,30));
        lbl2.setForeground(Color.GRAY);
        
        sunflowerDesc= new JButton("Sun Flower Describtion");
        add(sunflowerDesc);
        rosesDesc= new JButton("Roses Describtion");
        add(rosesDesc);
        tulipsDesc= new JButton("Tulips Describtion");
        add(tulipsDesc);
        orchidsDesc= new JButton("Orchids Describtion");
        add(orchidsDesc);
        lilliesDesc= new JButton("Lillies Describtion");
        add(lilliesDesc);
        mixedflowersDesc= new JButton("Mixedflowers Describtion");
        add(mixedflowersDesc);
        
        sunflowetBtn.addActionListener(this);
        rosesBtn.addActionListener(this);
        tulipsBtn.addActionListener(this);
        orchidsBtn.addActionListener(this);
        lilliesBtn.addActionListener(this);
        mixedflowersBtn.addActionListener(this);
        
        sunflowerDesc.addActionListener(this);
        rosesDesc.addActionListener(this);
        tulipsDesc.addActionListener(this);
        orchidsDesc.addActionListener(this);
        lilliesDesc.addActionListener(this);
        mixedflowersDesc.addActionListener(this);
 
    }

    @Override
    public void actionPerformed (ActionEvent e){
        
        if (e.getSource()==sunflowetBtn)
        {
            DetailsOfFlowersFrame childFrame= new DetailsOfFlowersFrame("SunFlower");
            childFrame.setSize(600, 500);
            childFrame.setVisible(true);
        }
        
        if (e.getSource()==rosesBtn)
        {
            DetailsOfFlowersFrame childFrame= new DetailsOfFlowersFrame("roses");
            childFrame.setSize(600, 500);
            childFrame.setVisible(true);
        }
        
        if (e.getSource()==tulipsBtn)
        {
            DetailsOfFlowersFrame childFrame= new DetailsOfFlowersFrame("tulips");
            childFrame.setSize(600, 500);
            childFrame.setVisible(true);
        }
        
        if (e.getSource()==orchidsBtn)
        {
            DetailsOfFlowersFrame childFrame= new DetailsOfFlowersFrame("Orchids");
            childFrame.setSize(600, 500);
            childFrame.setVisible(true);
        }
        
        if (e.getSource()==lilliesBtn)
        {
            DetailsOfFlowersFrame childFrame= new DetailsOfFlowersFrame("Lillies");
            childFrame.setSize(600, 500);
            childFrame.setVisible(true);
        }
        
        if (e.getSource()==mixedflowersBtn)
        {
            DetailsOfFlowersFrame childFrame= new DetailsOfFlowersFrame("MixedFlowers");
            childFrame.setSize(600, 500);
            childFrame.setVisible(true);
        }
        
        if (e.getSource()==sunflowerDesc)
        {
            String sunflowerDesc = new String ("The sunflower (Helianthus annuus) is an living annual plant in the family Asteraceae\n with a large flower head (capitulum).\n "
            + "The stem of the flower can grow up to 3 metres tall\n with a flower head that can be 30 cm wide\n. "
            + "Other types of sunflowers include the California Royal Sunflower\n which has a burgundy (red + purple) flower head.");
         JOptionPane.showMessageDialog(rootPane, "SunFlower Description: "+ sunflowerDesc , "Flower Description", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
         if (e.getSource()==rosesDesc)
        {
         
            String rosesDesc = new String ("The rose is a type of flowering shrub.\n Its name comes from the Latin word Rosa."
            + "The flowers of the rose grow in many different colors\n from the well-known red rose or yellow roses and sometimes white or purple roses.\n "
            + "Roses belong to the family of plants called Rosaceae. ");
            
         JOptionPane.showMessageDialog(rootPane, "Roses Description:"+ rosesDesc , "Flower Description", JOptionPane.INFORMATION_MESSAGE);
        }
         
         
          if (e.getSource()==tulipsDesc)
        {
            String tulipsDesc = new String ("Tulips (Tulipa) form a genus of spring-blooming perennial herbaceous bulbiferous geophytes\n (having bulbs as storage organs).\n "
            + "The flowers are usually large\n showy and brightly coloured, generally red, yellow, or white. ");
            
         JOptionPane.showMessageDialog(rootPane, "Tulips Description: "+ tulipsDesc , "Flower Description", JOptionPane.INFORMATION_MESSAGE);
        }
           if (e.getSource()==orchidsDesc)
        {
            String orchidsDesc = new String ("The Orchidaceae are a diverse and widespread family of flowering plants\n with blooms that are often colourful and fragrant\n "
            + "commonly known as the orchid family.");
            
         JOptionPane.showMessageDialog(rootPane, "Orchids Description: "+ orchidsDesc , "Flower Description", JOptionPane.INFORMATION_MESSAGE);
        }
            if (e.getSource()==lilliesDesc)
        {
            String lilliesDesc = new String ("Lilium (members of which are true lilies)\n is a genus of herbaceous flowering plants growing from bulbs\n"
            +"all with large prominent flowers\n Lilies are a group of flowering plants which are important in culture. ");
         JOptionPane.showMessageDialog(rootPane, "Lillies Description: "+ lilliesDesc , "Flower Description", JOptionPane.INFORMATION_MESSAGE);
        }
             if (e.getSource()==mixedflowersDesc)
        {
            String mixedFlowersDesc = new String ("Combination of Sunflowers, roses, tulips, orchids, and lillies");
         JOptionPane.showMessageDialog(rootPane, "Mixed FLowers Description: "+ mixedFlowersDesc , "Flower Description", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
}
