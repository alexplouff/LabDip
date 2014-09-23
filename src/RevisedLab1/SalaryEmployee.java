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
public class SalaryEmployee implements Employee {

    private String firstName;
    private String lastName;
    private String employeeID;
    private String ssn;
    private double salary;

    public SalaryEmployee(String firstName, String lastName, String employeeID,
                                         String ssn, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeID(employeeID);
        setSocialSecurityNumber(ssn);
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    //setters
    public final void setFirstName(String firstName) throws IllegalArgumentException{
                if(firstName == null || firstName.length() < 2 ){
            
        throw new IllegalArgumentException("First Name can NOT be Empty or "
                    + "Less Than 2 Characters");
        }
        this.firstName = firstName;
    }

    public final void setLastName(String lastName)throws IllegalArgumentException{
                if(lastName == null || lastName.length() < 2){
            throw new IllegalArgumentException("Last Name can NOT be Empty or "
                    + "Less Than 2 Characters");
        }
        this.lastName = lastName;
    }

    public final void setEmployeeID(String employeeID) {
                if(employeeID == null || employeeID.isEmpty()){
            throw new IllegalArgumentException("EmployeeID can NOT be Empty or ");
        }
                
        this.employeeID = employeeID;
    }

    public final void setSocialSecurityNumber(String ssn)throws IllegalArgumentException{
                if(ssn == null || ssn.length() != 11){
            throw new IllegalArgumentException("SSN can NOT be Empty, MUST be 10"
                    + "Characters and MUST be Seperated by Dashes");
        }
        this.ssn = ssn;
    }

    public void setSalary(double salary) {
        if (salary < 40000 || salary > 125000){
            throw new IllegalArgumentException("Salary is out of bounds");
        }
        this.salary = salary;
    }

    //Earnings
    @Override
    public double getAnnualTakeHome() {
        return salary;
    }

    @Override
    public double getMonthlyTakeHome() {
        return salary / MONTHS_IN_YEAR;
    }

    @Override
    public double getBiWeeklyTakeHome() {
        return getMonthlyTakeHome() / PAYOUTS_PER_MONTH;
    }

    @Override
    public StringBuilder getEmployeeProfile() {

        StringBuilder sb = new StringBuilder();

        return sb.append("Employee Name: ").append(firstName).append(" ").append(lastName)
                .append("\nSSN: ").append(ssn)
                .append("\nEmployee ID: ").append(employeeID)
                .append("\nEmployee Type: Salary")
                .append("\nSalary: $").append(salary)
                .append("\nBiweekly TakeHome: $").append(getBiWeeklyTakeHome())
                .append("\nMonthly TakeHome: $").append(getMonthlyTakeHome())
                .append("\nAnnual TakeHome: $").append(getAnnualTakeHome());
    }
}
