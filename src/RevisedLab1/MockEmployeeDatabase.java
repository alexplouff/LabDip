/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisedLab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 *
 * @author Alex
 */
public class MockEmployeeDatabase {
    
    Map employeeList = new HashMap();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.employeeList);
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
        final MockEmployeeDatabase other = (MockEmployeeDatabase) obj;
        if (!Objects.equals(this.employeeList, other.employeeList)) {
            return false;
        }
        return true;
    }
    
    
    
    public void addEmployee( Employee employee ){
        employeeList.put(employee.getEmployeeID(), employee);
    }
    
    public Employee getEmployee( String key ){
        return ( Employee ) employeeList.get( key );
    }
    
    
}
