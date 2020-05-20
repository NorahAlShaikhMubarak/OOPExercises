/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class Rectangle {


    public static void main(String[] args) 
            
    {
        double w,l,area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lenght: ");
        l = s.nextDouble();
        System.out.println("Enter the width: ");
        w = s.nextDouble();
        area = l*w;
        System.out.println("The area is: "+area);
    }
    
}
