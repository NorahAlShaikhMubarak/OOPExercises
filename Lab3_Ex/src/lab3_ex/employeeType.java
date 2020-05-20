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
public class employeeType 
{
    int employeeID;
    private String employeeNm;

    public employeeType(int employeeID, String employeeNm)
    {
        this.employeeID = employeeID;
        this.employeeNm = employeeNm;
    }
    
    public employeeType()
    {
        this.employeeID=0;
        this.employeeNm="Empty";
    }

    public int getEmployeeID() 
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) 
    {
        this.employeeID = employeeID;
    }

    public String getEmployeeNm() 
    {
        return employeeNm;
    }

    public void setEmployeeNm(String employeeNm) 
    {
        this.employeeNm = employeeNm;
    }
    
    public void print()
    {
        System.out.println("Employee ID: "+getEmployeeID());
        System.out.println("Employee Name: "+getEmployeeNm());
    }
    

}
