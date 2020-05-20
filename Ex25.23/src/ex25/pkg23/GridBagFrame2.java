/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex25.pkg23;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
public class GridBagFrame2 extends JFrame {
    private GridBagLayout layout; 
    private GridBagConstraints constraints; 
// set up GUI
 public GridBagFrame2()
 {

  super( "GridBagLayout" );
  constraints = new GridBagConstraints(); // instantiate constraints
  layout = new GridBagLayout();
  setLayout( layout ); // set frame layout
  String[] metals = { "Copper", "Aluminum", "Silver" };
  JComboBox comboBox = new JComboBox( metals );
  JTextField textField = new JTextField( "TextField" );
  String[] fonts = { "Serif", "Monospaced" };
  JList list = new JList( fonts );
  String[] names = { "zero", "one", "two", "three", "four" };
  JButton[] buttons = new JButton[ names.length ];
  for ( int count = 0; count < buttons.length; count++ )
   buttons[ count ] = new JButton( names[ count ] );
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent( textField );

    constraints.gridwidth = 1;
    addComponent( buttons[ 0 ] );
    constraints.gridwidth = GridBagConstraints.RELATIVE;
    addComponent( buttons[ 1 ] );
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent( buttons[ 2 ] );
    constraints.weighty = 0;
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent( comboBox );
    constraints.weighty = 1;
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent( buttons[ 3 ] );
    
    constraints.gridwidth = GridBagConstraints.RELATIVE;
    addComponent( buttons[ 4 ] );
    constraints.gridwidth = GridBagConstraints.REMAINDER;
    addComponent( list );
 }
    
private void addComponent( Component component )
 {
     layout.setConstraints( component, constraints );
     add( component );
 }

}