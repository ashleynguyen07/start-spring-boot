package com.ashley.employeedirectory.service;

import com.ashley.employeedirectory.dao.EmployeeDAO;
import com.ashley.employeedirectory.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employees;

    public EmployeeServiceImpl(EmployeeDAO employees) {
        this.employees = employees;
    }
    @Override
    public List<Employee> getList(){
        return employees.findAll();
    }
    @Override
    public Employee getEmployeeById(int id) {
        return employees.findEmployeeById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employees.createEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employees.deleteEmployee(id);
    }
}
