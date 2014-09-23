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
public class HRService {
    
    private Employee employee;
    private final MockEmployeeDatabase database;
    
    
    
    public HRService(){
        database = new MockEmployeeDatabase();
    }
    
    
    
    //Employee Setting and Retreival
    
    public void setEmployee( Employee employee ){
        this.employee = employee;
    }
    
    public void setEmployeeByKey( String key ){
        this.employee = database.getEmployee(key);
        setEmployee( this.employee );
    }
    
    public void createNewHourlyEmployee( String firstName, String lastName,
                                    String ssn, String employeeID, double hourlyRate){
        employee = new HourlyEmployee( firstName, lastName, ssn, employeeID, hourlyRate);
        database.addEmployee(employee);
    }
    
    public void createNewSalaryEmployee( String firstName , String lastName , 
                                    String ssn , String employeeID , double salary){
        employee = new SalaryEmployee( firstName , lastName , ssn , employeeID , salary);
        database.addEmployee(employee);
    }
    
    public Employee getEmployee(){
        return employee;
    }
    
    
    
    //Earnings
    
    public double getBiWeeklyTakeHome(){
        return employee.getBiWeeklyTakeHome();
    }
    
    public double getMonthlyTakeHome(){
        return employee.getBiWeeklyTakeHome();
    }
    
    public double getAnnualTakeHome(){
        return employee.getAnnualTakeHome();
    }
    
    //Employee Profile
    
     public StringBuilder getEmployeeProfileByKey( String key ){
        return database.getEmployee( key ).getEmployeeProfile();
    }
    
    public StringBuilder getEmployeeProfile(){
        return employee.getEmployeeProfile();
    }
}
