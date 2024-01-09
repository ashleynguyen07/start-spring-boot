package com.ashleynguyen.crudapis.rest;

import com.ashleynguyen.crudapis.entity.Student;
import com.ashleynguyen.crudapis.error.StudentErrorResponse;
import com.ashleynguyen.crudapis.error.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        // check list size
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student ID not found - " + studentId);
        }
        return theStudents.get(studentId);
    }


}
