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
public class fullTimeEmployee extends employeeType {
    
    private int empSalary;
    
    public fullTimeEmployee(int employeeID, String employeeNm, int empSalary)
    {
        super(employeeID, employeeNm);
        this.empSalary=empSalary;
    }
    
    public fullTimeEmployee()
    {
        this.empSalary=0;

    }

    public int getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) 
    {
        this.empSalary = empSalary;
    }
    
    public void print()
    {
        System.out.println("Employee ID: "+getEmployeeID());
        System.out.println("Employee Name: "+getEmployeeNm());
        System.out.println("Employee Salaey: "+getEmpSalary());
    }
}
