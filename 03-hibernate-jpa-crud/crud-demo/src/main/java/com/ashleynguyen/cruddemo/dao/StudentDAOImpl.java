package com.ashleynguyen.cruddemo.dao;

import com.ashleynguyen.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional // method will be change the content of db need to use @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class); // important! "FROM Student" - Student is not db name, it's JPA Entity Class name!
        return theQuery.getResultList();
    }

    @Override
    public List<Student> sortByFirstName() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by first_name desc", Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByFirstName(String first_name) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE first_name=:theData", Student.class);

        // set query parameter
        theQuery.setParameter("theData", first_name);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateFirstName(Student student) {
        // update the student
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student st = entityManager.find(Student.class, id);
        entityManager.remove(st);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }
}
