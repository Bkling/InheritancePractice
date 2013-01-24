/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author bkling
 */
public class SalariedEmployee extends Employee {
    //Give the Salaried Employee the properties of the Employee invisibly
    
    //This is a method just for Salaried Employees
    public double setSalary(double salary){
        return salary;
    }
}
