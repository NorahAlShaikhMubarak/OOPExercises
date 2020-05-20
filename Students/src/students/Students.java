/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String fname[] = new String[3];
        String lname[] = new String[3];
        int id[] = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.println("Insert first name: ");
            fname[i]=s.next();
            System.out.println("Insert last name: ");
            lname[i]=s.next();
            System.out.println("Insert ID: ");
            id[i]=s.nextInt();
        }
        System.out.println("You have inserted: ");
        for(int i=0;i<3;i++)
        {
            System.out.println(id[i]+","+fname[i]+" "+lname[i]);
        }

    }
    
}
