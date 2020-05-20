/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptiontest;

import javax.swing.JOptionPane;
/**
 *
 * @author norahalshaikhmubarak
 */
public class JOptionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String FirstNumber = JOptionPane.showInputDialog(null, "Insert first number", "Input", JOptionPane.QUESTION_MESSAGE);
        String SecondNumber = JOptionPane.showInputDialog(null, "Insert second number", "Input", JOptionPane.QUESTION_MESSAGE);
        
        int num1 = Integer.parseInt(FirstNumber);
        int num2 = Integer.parseInt(SecondNumber);
        
        int sum = num1+num2;
        
        JOptionPane.showMessageDialog(null , " The summation= " +sum, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
