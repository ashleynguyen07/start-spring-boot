package com.ashley.employeedirectory.dao;

import com.ashley.employeedirectory.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findEmployeeById(Integer id);
    Employee createEmployee(Employee employee);
    void deleteEmployee(Integer id); // delete return int because need to COUNT deleted item
}
