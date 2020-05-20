/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnum;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class SumOfNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        int sum=0;
        int a[]=new int[10];
        System.out.println("Insert an integer: ");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
            sum+=a[i];
        }
        System.out.println("the sum is: "+sum);
        
        
        
    }
    
}
