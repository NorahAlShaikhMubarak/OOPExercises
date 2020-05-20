/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class Methods {
    
    Scanner s = new Scanner(System.in);
    int length;
    int width;
    public void CalculateRectangle()
    {
        System.out.println("Calling the Area for a rectangle: ");
        System.out.println("Insert lenght: ");
        length = s.nextInt();
        System.out.println("Insert width: ");
        width = s.nextInt();
        System.out.println("The rectangle area: "+length*width);

    }
    
    public void CalculateSquare()
    {
        System.out.println("Calling the Area for a square: ");
        System.out.println("Insert lenght: ");
        length = s.nextInt();
        System.out.println("The rectangle area: "+length*length);
    }
    
    
}
