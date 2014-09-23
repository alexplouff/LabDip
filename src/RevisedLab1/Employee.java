/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisedLab1;

/**
 *
 * @author Alex
 */
public interface Employee {
    
    public static final int MONTHS_IN_YEAR = 12;
    public static final int PAYOUTS_PER_MONTH = 2;
    public static final double WEEKS_IN_MONTH = 4.3;
    
    public abstract double getAnnualTakeHome();
    
    public abstract double getMonthlyTakeHome( );
    
    public abstract double getBiWeeklyTakeHome();
    
    
    
    public abstract String getFirstName();
    
    public abstract String getLastName();
    
    public abstract String getEmployeeID();
    
    
    
    public abstract String getSocialSecurityNumber();
    
    public abstract StringBuilder getEmployeeProfile();
    
}
