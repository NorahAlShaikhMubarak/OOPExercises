/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ex;

/**
 *
 * @author norahalshaikhmubarak
 */
public class Lab3_Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        employeeType e=new employeeType();
        employeeType t=new employeeType(1, "norah");
        
        fullTimeEmployee f=new fullTimeEmployee();
        fullTimeEmployee x=new fullTimeEmployee(1, "noorah", 222);
        
        e.print();
        t.print();
        f.print();
        x.print();
   
    }
        
}
    

