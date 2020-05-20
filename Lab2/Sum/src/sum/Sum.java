/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class Sum {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String a[]=new String[10];
        int index;
     
        for(int i=0;i<5;i++)
        {
            System.out.println("Insert a character: ");
            a[i]=s.next();
            
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("The elements are: "+a[i]);
            
        }
        System.out.println("Insert character you want to find: ");
        String x=s.next();
        for(int i=0;i<5;i++)
        {
            if(a[i]==x)
            {
                index=i;
                System.out.println("Element is found at position "+i);
            }
        }
        System.out.println("Element does not exist");
        
        
    }
    
}
