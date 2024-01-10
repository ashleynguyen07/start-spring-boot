package com.ashley.employeedirectory.rest;

import com.ashley.employeedirectory.dao.EmployeeDAO;
import com.ashley.employeedirectory.entity.Employee;
import com.ashley.employeedirectory.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getList(){
        return employeeService.getList();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    // add new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        Employee dbEmployee = employeeService.addEmployee(employee);
        return dbEmployee;
    }

    // update employee
    @PutMapping("/employees")
    public  Employee updateEmployee(@RequestBody Employee employee) {
        Employee dbEmployee = employeeService.addEmployee(employee);
        return dbEmployee;
    }

    // delete employee
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            throw  new RuntimeException("Employee ID " + id + " not found!");
        }
        employeeService.deleteEmployee(id);
        return "Deleted employee ID " + id;
    }

}
