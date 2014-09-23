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
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        HRService hr = new HRService();

//        hr.createNewHourlyEmployee("Alex", "Plouff", "PRO521", "333-51-6924", 16.00);
//
//        hr.createNewHourlyEmployee("Dan", "Rogers", "GRO414", "444-66-5414", 12.00);
//
//        hr.createNewHourlyEmployee("Josh", "Conley", "MEAT541", "367-14-3210", 14.00);
//        
//        hr.createNewSalaryEmployee("Mike", "Carpenter", "PRO212", "347-10-5414", 65000);
//
//        System.out.println(hr.getEmployeeProfileByKey("PRO521"));
        
        Employee alex = new HourlyEmployee("Alex", "Plouff", "PRO521", "333-51-6924", 16.00);
        Employee dan = new SalaryEmployee("Dan", "Rogers", "GRO414", "444-66-5414", 12.00);
        
        System.out.println(alex);
    }

}
