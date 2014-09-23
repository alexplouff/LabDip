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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        HRService hr = new HRService();
        
        Employee dan = new HourlyEmployee( "Dan" , "Rogers" , "A101" ,
                                        15.00 , 80);
        Employee alex = new SalaryEmployee( "Alex" , "Plouff" , "A102" ,
                                        60000);
        Employee chris = new SalaryEmployee( "Chris" , "Smith" , "A103" ,
                                        70000);
        
        hr.createNewEmployee(alex);
        hr.createNewEmployee(dan);
        hr.createNewEmployee(chris);
        
        System.out.println(hr.map.get("A102"));
    }
    
}
