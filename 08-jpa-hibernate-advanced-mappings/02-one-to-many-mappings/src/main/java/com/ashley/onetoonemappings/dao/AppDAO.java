package com.ashley.onetoonemappings.dao;

import com.ashley.onetoonemappings.entity.Course;
import com.ashley.onetoonemappings.entity.Instructor;

import java.util.List;

public interface AppDAO {

    // instructor
    void save(Instructor instructor);
    Instructor findById(Integer id);
    void deleteById(Integer id);

    // course
    void saveCourse(Course course);
    Course findCourseById(Integer id);
    void deleteCourseById(Integer id);
    List<Course> findCourseByInstructorById(Integer id);

    Instructor findInstructorByJoinFetch(Integer id);
    void update(Instructor instructor);

}
