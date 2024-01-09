package com.ashleynguyen.crudapis.rest;

import com.ashleynguyen.crudapis.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {
    private List<Student> theStudents;

    @PostConstruct
    public  void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student(1,"My", "Nguyen"));
        theStudents.add(new Student(2,"My1", "Nguyen"));
        theStudents.add(new Student(3,"My2", "Nguyen"));
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudentId(@PathVariable int studentId) {
        return theStudents.get(studentId);
    }


}
