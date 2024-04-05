package com.johnny.service;

import com.johnny.generic.GenericService;
import com.johnny.model.Employee;
import javax.ejb.Stateless;

@Stateless
public class EmployeeService extends GenericService<Employee> {
    
    public EmployeeService() {
        super(Employee.class);
    }
    
    public void remove(Employee employee) {
        employee.setActive(Boolean.FALSE);
        this.getEntityManager().merge(employee);
    }
    
}
