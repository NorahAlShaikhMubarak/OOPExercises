/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursion;
import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class FactorialRecursion {

 
    static int factorial(int n)
    {
        if(n==0)
        return 1;
       else
        return (n*factorial(n-1));
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int f=1;
        int n;
        System.out.println("Enter the number to calculete it's factorial: ");
        n=s.nextInt();
        f=factorial(n);
        System.out.println("The factorial of "+n+" = "+f); 
    }
    
}
