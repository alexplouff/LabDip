/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.solution;

/**
 *
 * @author Alex
 */
public interface Employee {
    
    public abstract void setFirstName( String firstName );
    public abstract String getFirstName();
    
    public abstract void setLastName( String lastName );
    public abstract String getLastName();
    
    public abstract void setEmployeeID( String employeeID );
    public abstract String getEmployeeID();
    
    public abstract void setPaymentType( EmployeeType paymentType );
    public abstract EmployeeType getPaymentType();
    
    public abstract double getAnnualTakeHome();
    
    public abstract String toString();
}
