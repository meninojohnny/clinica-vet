package com.johnny.manager;

import com.johnny.model.Employee;
import com.johnny.service.EmployeeService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class EmployeeManager implements Serializable {
    
    @EJB
    EmployeeService employeeService;
    
    private Employee employee;
    
    private List<Employee> employees;
            
    @PostConstruct
    public void instance() {
        employee = new Employee();
    }
    
    public void save() {
        this.employeeService.save(employee);
    }
    
    public void update() {
        this.employeeService.update(employee);
    }
    
    public void remove() {
        this.employeeService.remove(employee);
    }
    
    public void findAll() {
        employees = this.employeeService.findAll();
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    
}
