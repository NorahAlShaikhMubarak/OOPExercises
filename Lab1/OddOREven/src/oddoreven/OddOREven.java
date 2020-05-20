/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class OddOREven {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int x,n=5;

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number: ");
            x = s.nextInt();
            if(x%2==0)
        {
            System.out.println("The number is even");
        }
        else
            System.out.println("The number is odd");
        }
        

                    

    }
    
}
