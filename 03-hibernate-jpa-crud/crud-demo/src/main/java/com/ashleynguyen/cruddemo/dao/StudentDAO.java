package com.ashleynguyen.cruddemo.dao;

import com.ashleynguyen.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> sortByFirstName();
    List<Student> findByFirstName(String first_name);
    void updateFirstName(Student student);
    void delete(Integer id);
    int deleteAll();
}
