/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author norahalshaikhmubarak
 */
import javax.swing.JOptionPane;
        
public class Practice {
    
    
    public static void main(String[] args) {
        
    String fnumber= JOptionPane.showInputDialog(null, "Enter first number", "Input", JOptionPane.QUESTION_MESSAGE);
    String snumber= JOptionPane.showInputDialog(null, "Enter second number", "Input", JOptionPane.QUESTION_MESSAGE);
    
    int num1=Integer.parseInt(fnumber);
    int num2=Integer.parseInt(snumber);
    int result= num1+num2;
    
    JOptionPane.showMessageDialog(null, "The sum is of "+num1+"+"+num2+" equals "+result, "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
