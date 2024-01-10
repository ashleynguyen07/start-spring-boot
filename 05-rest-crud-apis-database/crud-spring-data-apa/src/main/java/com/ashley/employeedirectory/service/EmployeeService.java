package com.ashley.employeedirectory.service;

import com.ashley.employeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getList();
    Employee getEmployeeById(int id);

    Employee addEmployee(Employee employee);
    void deleteEmployee(Integer id);
}
