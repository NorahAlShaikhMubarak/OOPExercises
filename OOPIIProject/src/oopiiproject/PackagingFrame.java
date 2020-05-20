/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopiiproject;

 import java.awt.BorderLayout;
 import java.awt.FlowLayout;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JComboBox;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
 import javax.swing.JButton;
 import java.awt.Font;
 import java.awt.Color;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 public class PackagingFrame extends JFrame{
   
    private JComboBox imagesJComboBox;
    private JLabel label; 
    private JLabel label1;
    private FlowLayout layout;

    private final String[] names = {"cell.png", "box.png", "bag.png", "vase.png","basket.png" };
    private Icon[] icons = {
    new ImageIcon( getClass().getResource( names[ 0 ] ) ),
    new ImageIcon( getClass().getResource( names[ 1 ] ) ),
    new ImageIcon( getClass().getResource( names[ 2 ] ) ),
    new ImageIcon( getClass().getResource( names[ 3 ] ) ),
    new ImageIcon( getClass().getResource( names[ 4 ] ) )
    };
 
    private JButton nextBtn;
    private JButton previousBtn;
    private String type;
    private String noFlowers;
    private String color;
    private String subType;
    
    public PackagingFrame(String type, String noFlowers, String color, String subType)
    {
    super( "packaging" );
    layout= new FlowLayout();
    setLayout(new BorderLayout());
    setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
    setLayout(new FlowLayout());
    setLayout(layout);
    layout.setAlignment(FlowLayout.CENTER);
    
    this.type=type;
    this.noFlowers=noFlowers;
    this.color=color;
    this.subType=subType;
    
    label1= new JLabel("Choose the package: \n");
    label1.setFont(new Font("Serif", Font.BOLD,20));
    add(label1);
    label1.setForeground(Color.GRAY);
    
    imagesJComboBox = new JComboBox( names );
    imagesJComboBox.setMaximumRowCount( 4 ); 
    add(imagesJComboBox);
    label= new JLabel(icons[0]);
    add(label);

    previousBtn= new JButton("Previous");
    add(previousBtn);
        
    nextBtn= new JButton("Next");
    add(nextBtn);
 
    ComboBoxHandler handler1= new ComboBoxHandler();
    imagesJComboBox.addItemListener(handler1);
    
    ActionListenerHandler handler2= new ActionListenerHandler();
    nextBtn.addActionListener(handler2);
    previousBtn.addActionListener(handler2);
 
   }
   private class ComboBoxHandler implements ItemListener{
        @Override
        public void itemStateChanged (ItemEvent e)
        {
        if (e.getStateChange()==ItemEvent.SELECTED )
        label.setIcon(icons[
        imagesJComboBox.getSelectedIndex()]);
        }
    }
       private class ActionListenerHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==nextBtn)
            {
                PaymentDetails childFrame1= new PaymentDetails(type, noFlowers, color, subType,names[imagesJComboBox.getSelectedIndex()]);
            }
            if(e.getSource()==previousBtn)
            {
                DetailsOfFlowersFrame childFrame2= new DetailsOfFlowersFrame(type);
                childFrame2.setSize(600, 500);
                childFrame2.setVisible(true);
            }

        }
    }
   
}