/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialloop;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class FactorialLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int f=1;
        int n;
        System.out.println("Enter the number to calculete it's factorial: ");
        n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial of "+n+" = "+f); 
    }
    
}
