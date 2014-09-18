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
    
    private double hourlyRate;
    
    private EmployeeType paymentType;
    

    public HourlyEmployee(String firstName, String lastName, String employeeID,
            double hourlyRate, EmployeeType paymentType) {
        
        setFirstName( firstName );
        setLastName( lastName );
        setEmployeeID( employeeID );
        this.hourlyRate = hourlyRate;
        setPaymentType( paymentType );
        
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getMonthlyTakeHome() {
        double monthlyTakeHome = 0; 
        monthlyTakeHome = hourlyRate * 160;
        return monthlyTakeHome;
    }

    public double getAnnualTakeHome() {
        double annualTakeHome = 0;
        annualTakeHome = getMonthlyTakeHome() * 12;
        return annualTakeHome;
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
    public final void setPaymentType(EmployeeType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public EmployeeType getPaymentType() {
        return paymentType;
    }
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName
                +"\nPayment Type: " + paymentType
                +"\nHourly Rate: $" + hourlyRate
                +"\nMonthly TakeHome: $" + getMonthlyTakeHome()
                +"\nYearly TakeHome: $" + getAnnualTakeHome();
    }
    
    
}
