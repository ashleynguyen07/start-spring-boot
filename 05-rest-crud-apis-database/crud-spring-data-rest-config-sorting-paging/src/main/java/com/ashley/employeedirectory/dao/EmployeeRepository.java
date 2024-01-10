package com.ashley.employeedirectory.dao;

import com.ashley.employeedirectory.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employee-directory") // change the path directory
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
