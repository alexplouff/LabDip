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
public class HRService {
   
    Employee employee;
    
    public void createNewEmployee( String firstName , String lastName , String employeeID
                                       , EmployeeType paymentType){
        
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmployeeID(employeeID);
        employee.setPaymentType(paymentType);
    }
    
    public double getAnnualTakeHome( Employee employee ){
        return employee.getAnnualTakeHome();
    }
    
    public String getEmployeeProfile( Employee employee ){
        return employee.toString();
    }
    
    
}
