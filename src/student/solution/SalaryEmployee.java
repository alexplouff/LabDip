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
public class SalaryEmployee implements Employee{

    private String firstName;
    private String lastName;
    private String employeeID;
    private double salary;

    public SalaryEmployee(String firstName, String lastName,
                                String employeeID, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public double getAnnualTakeHome() {
        
        return salary;
    }

    @Override
    public double getMonthlyTakeHome() {
        double monthlyTakeHome = salary / MONTHS_IN_YEAR;
        return monthlyTakeHome;
                
    }
    
    @Override
    public double getBiWeeklyTakeHome() {
        double biWeeklyTakeHome = salary * WEEKS_IN_YEAR ;
        return biWeeklyTakeHome;
    }
    
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName
                +"\nSalary: $" + salary
                +"\nBiWeekly Take Home: $" + getBiWeeklyTakeHome()
                +"\nMonthly Take Home: $" + getMonthlyTakeHome()
                +"\nYearly Take Home: $" + getAnnualTakeHome();
    }
    
    
}
