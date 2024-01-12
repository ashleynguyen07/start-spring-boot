package com.ashley.onetoonemappings.dao;

import com.ashley.onetoonemappings.entity.Course;
import com.ashley.onetoonemappings.entity.Instructor;

public interface AppDAO {

    // instructor
    void save(Instructor instructor);
    Instructor findById(Integer id);
    void deleteById(Integer id);

    // course
    void saveCourse(Course course);
    Course findCourseById(Integer id);
    void deleteCourseById(Integer id);
}
