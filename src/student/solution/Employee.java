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
    
    public final static int MONTHS_IN_YEAR = 12;
    public final static int WEEKS_IN_YEAR = 52;
    
    public abstract void setFirstName( String firstName );
    public abstract String getFirstName();
    
    public abstract void setLastName( String lastName );
    public abstract String getLastName();
    
    public abstract void setEmployeeID( String employeeID );
    public abstract String getEmployeeID();
    
    public abstract double getAnnualTakeHome();
    
    public abstract double getMonthlyTakeHome();
    
    public abstract double getBiWeeklyTakeHome();
    
    @Override
    public abstract String toString();
}
