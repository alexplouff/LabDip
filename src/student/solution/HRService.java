
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.solution;


import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author Alex
 */
public class HRService {
   
    private Employee employee;
    
    public void createNewEmployee( Employee employee )
                                       {
        
          this.employee = employee;
          
          map.put(employee.getEmployeeID(), employee);
    }
    
    HashMap map = new HashMap();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.employee);
        hash = 89 * hash + Objects.hashCode(this.map);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HRService other = (HRService) obj;
        if (!Objects.equals(this.employee, other.employee)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    public HashMap getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }
    
    
    
    
    public double getBiWeeklyTakeHome(){
        return employee.getBiWeeklyTakeHome();
    }
    
    public double getMonthlyTakeHome(){
        return employee.getBiWeeklyTakeHome();
    }
    
    public double getAnnualTakeHome(  ){
        return employee.getAnnualTakeHome();
    }
    
    public String getEmployeeProfile( Employee employee ){
        return employee.toString();
    }
    
    
}
