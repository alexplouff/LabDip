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
public class HourlyEmployee implements Employee{

    private String firstName;
    private String lastName;
    private String employeeID;
    private double hoursWorked;
    
    private double hourlyRate;
    

    public HourlyEmployee(String firstName, String lastName, String employeeID,
            double hourlyRate , double hoursWorked ) {
        
        setFirstName( firstName );
        setLastName( lastName );
        setEmployeeID( employeeID );
        this.hourlyRate = hourlyRate;
        setHoursWorked( hoursWorked );
        
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public final void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getMonthlyTakeHome() {
        double monthlyTakeHome = hourlyRate * 160;
        return monthlyTakeHome;
    }

    @Override
    public double getAnnualTakeHome() {
        double annualTakeHome = getMonthlyTakeHome() * 12;
        return annualTakeHome;
    }
    
    @Override
    public double getBiWeeklyTakeHome(){
        double biWeeklyTakeHome = hourlyRate * hoursWorked;
        return biWeeklyTakeHome;
    }
    
    //    implementations 
    
    @Override
    public final void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public final void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String getEmployeeID() {
        return employeeID;
    }
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName
                +"\nHourly Rate: $" + hourlyRate
                +"\nMonthly TakeHome: $" + getMonthlyTakeHome()
                +"\nYearly TakeHome: $" + getAnnualTakeHome();
    }
    
    
}
