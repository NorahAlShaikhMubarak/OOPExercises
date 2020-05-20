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
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class MenuFrame extends JFrame implements ActionListener{

    private JLabel menuframe;
    
    private JLabel TypesOfFlowersLbl;
    private JLabel ASunFlowers;
    private JLabel NSunFlowers;
    private JLabel ARoses;
    private JLabel NRoses;
    private JLabel ATulips;
    private JLabel NTulips;
    private JLabel AOrchids;
    private JLabel NOrchids;
    private JLabel ALilies;
    private JLabel NLilies;
    private JLabel AMixedFlowers;
    private JLabel NMixedFlowers;
    
    private JLabel packaging;
    private JLabel cellophane;
    private JLabel box;
    private JLabel bag;
    private JLabel vase;
    private JLabel basket;
    
    private JButton TypesOfFlowersBttn;
    private JButton previousBtn;
    
    private GridLayout layout;
    private FlowLayout flowlayout;
    
    public MenuFrame(){
        
        super("Menu Frame");
        flowlayout= new FlowLayout();
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon((getClass().getResource("background1.jpg")))));
        setLayout(new FlowLayout());
        setLayout(layout);
        
        layout = new GridLayout (10,1,3,3);
        setLayout(layout);
        
        menuframe = new JLabel ("Flowers Menu: ");
        add(menuframe);

        
        TypesOfFlowersLbl = new JLabel ("Types Of Flowers: ");
        add(TypesOfFlowersLbl);
        ASunFlowers = new JLabel ("Artificial SunFlower: 47$");
        add(ASunFlowers);
        NSunFlowers = new JLabel ("Natural SunFlower: 59$");
        add(NSunFlowers);
        ARoses = new JLabel ("Artificial Roses: 39$");
        add(ARoses);
        NRoses = new JLabel ("Natural Roses: 50$");
        add(NRoses);
        ATulips = new JLabel ("Artificial Tulip: 60$");
        add(ATulips);
        NTulips = new JLabel ("Natural Tulip: 23$");
        add(NTulips);
        AOrchids = new JLabel ("Artificial Orchid: 54$");
        add(AOrchids);
        NOrchids = new JLabel ("Natural Orchid: 10$ ");
        add(NOrchids);
        ALilies = new JLabel ("Artificial Lilie: 37$");
        add(ALilies);
        NLilies = new JLabel ("Natural Lilie: 45$ ");
        add(NLilies);
        AMixedFlowers = new JLabel ("Artificial Mixed Flowers: 57$ ");
        add(AMixedFlowers);
        NMixedFlowers = new JLabel ("Natural Mixed Flowers: 57$");
        add(NMixedFlowers);

        packaging = new JLabel ("Packaging: ");
        add(packaging);
        cellophane = new JLabel ("Cellophane: 20$");
        add(cellophane);
        box = new JLabel ("Box: 30$");
        add(box);
        bag = new JLabel ("Bag: 50$");
        add(bag);
        vase = new JLabel ("Vase: 30$");
        add(vase);
        basket = new JLabel ("Basket: 50$");
        add(basket);
        
        previousBtn= new JButton("Previous");
        add(previousBtn);

        TypesOfFlowersBttn = new JButton ("Types Of Flowers");
        add(TypesOfFlowersBttn);
        
        TypesOfFlowersBttn.addActionListener(this);
        previousBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {

        if(e.getSource()==TypesOfFlowersBttn)
        {
            TypesOfFlowersFrame childFrame1= new TypesOfFlowersFrame();
            childFrame1.setSize(600, 500);
            childFrame1.setVisible(true);
        }
        if(e.getSource()==previousBtn)
        {
            WelcomeFrame childFrame2= new WelcomeFrame();
            childFrame2.setSize(500, 300);
            childFrame2.setVisible(true);
        }
    }
    
}
