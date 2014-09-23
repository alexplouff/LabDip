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
public class HourlyEmployee implements Employee {
     
    private static final int PROJECTED_FULL_TIME_HOURS = 80;
    private static final double MINIMUM_WAGE = 7.25;
    
    private String firstName;
    private String lastName;
    private String employeeID;
    private String ssn;
    private double hourlyRate;

    public HourlyEmployee(String firstName, String lastName,
            String employeeID, String socialSecurityNumber, double hourlyRate) {
        setFirstName( firstName );
        setLastName( lastName );
        setEmployeeID( employeeID );
        setSocialSecurityNumber( socialSecurityNumber );
        this.hourlyRate = hourlyRate;
                
    }

    //getters
    
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String getSocialSecurityNumber() {
        return ssn;
    }
    
    public double hourlyRate(){
        return hourlyRate;
    }
    
    //setters
    
    public final void setFirstName(String firstName) throws IllegalArgumentException{
        if(firstName == null || firstName.length() < 2 ){
            
        throw new IllegalArgumentException("First Name can NOT be Empty or "
                    + "Less Than 2 Characters");
        }
        
        this.firstName = firstName;
    }

    
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if(lastName == null || lastName.length() < 2){
            throw new IllegalArgumentException("Last Name can NOT be Empty or "
                    + "Less Than 2 Characters");
        }
        this.lastName = lastName;
    }
    
    public final void setEmployeeID(String employeeID) throws IllegalArgumentException {
//        if(employeeID == null || employeeID.isEmpty() || ssn.length()!=11){
//            throw new IllegalArgumentException("EmployeeID can NOT be Empty or ");
//        }
        
        this.employeeID = employeeID;
    }

    public final void setSocialSecurityNumber(String socialSecurityNumber)
                                                throws IllegalArgumentException{
//        if(ssn == null || ssn.isEmpty() ){
//            throw new IllegalArgumentException("SSN can NOT be Empty, MUST be 11"
//                    + " Characters and MUST be Seperated by Dashes");
//        }
        this.ssn = socialSecurityNumber;
    }

    public void hourlyRate( double hourlyRate ) {
        if(hourlyRate < MINIMUM_WAGE){
            throw new IllegalArgumentException("Hourly Rate MUST be equal to or "
                    + "greater than $)" + MINIMUM_WAGE);
        }
        this.hourlyRate = hourlyRate;
    }

    //earnings
    
    @Override
    public double getAnnualTakeHome( ) {
        
        return getMonthlyTakeHome() * MONTHS_IN_YEAR;
    }

    @Override
    public double getMonthlyTakeHome() {
        return getBiWeeklyTakeHome() * PAYOUTS_PER_MONTH;
    }

    @Override
    public double getBiWeeklyTakeHome() {
        return hourlyRate * PROJECTED_FULL_TIME_HOURS;
        }
   
    @Override
    public StringBuilder getEmployeeProfile(){
        
        StringBuilder sb = new StringBuilder();
        
        return sb.append("Employee Name: ").append(firstName).append(" ").append(lastName)
        .append("\nSSN: ").append(ssn)
        .append("\nEmployee ID: ").append(employeeID)
        .append("\nEmployee Type: Hourly")
        .append("\nHourly Rate: $").append(hourlyRate)
        .append("\nBiweekly TakeHome: $").append( getBiWeeklyTakeHome() )
        .append("\nMonthly TakeHome: $").append( getMonthlyTakeHome () )
        .append("\nAnnual TakeHome: $").append( getAnnualTakeHome () );
                
                
                
    }
}
