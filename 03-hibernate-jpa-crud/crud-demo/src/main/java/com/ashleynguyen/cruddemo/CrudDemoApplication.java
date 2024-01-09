package com.ashleynguyen.cruddemo;

import com.ashleynguyen.cruddemo.dao.StudentDAO;
import com.ashleynguyen.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner cmdLineRunner(StudentDAO studentDAO) { // inject studentDAO
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			readAllStudent(studentDAO);
//			sortStudentList(studentDAO);
//			readStudentByFirstName(studentDAO);
//			updateStudentName(studentDAO);
//			deleteStudent(studentDAO);
			deleteAllStudent(studentDAO);
		};
	}
	private void deleteAllStudent(StudentDAO studentDAO) {
		int numRowDeleted = studentDAO.deleteAll();
		System.out.println("Deleted " + numRowDeleted + " row!");
	}
	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println(studentDAO.findById(studentId));
		studentDAO.delete(studentId);
		System.out.println("Deleted!");
		System.out.println(studentDAO.findById(studentId));

	}

	private void updateStudentName(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		int studentId = 1;
		Student student = studentDAO.findById(studentId);
		System.out.println(student);

		// change first name
		student.setFirst_name("HungNguNgoc");
		studentDAO.updateFirstName(student);
		System.out.println("Updated: " + student);
	}

	private void readStudentByFirstName(StudentDAO studentDAO) {
		List<Student> ls = studentDAO.findByFirstName("My2");
		for(Student st : ls) {
			System.out.println(st);
		}
	}

	private void sortStudentList(StudentDAO studentDAO) {
		List<Student> ls = studentDAO.sortByFirstName();
		for(Student st : ls) {
			System.out.println(st);
		}
	}

	private void readAllStudent(StudentDAO studentDAO) {
		List<Student> ls = studentDAO.findAll();
		for(Student st : ls) {
			System.out.println(st);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		Student st = studentDAO.findById(1);
		System.out.println(st);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		Student st1 = new Student("My1", "Nguyen Thi Tra", "myntt1@fpt.com");
		Student st2 = new Student("My2", "Nguyen Thi Tra", "myntt1@fpt.com");
		Student st3 = new Student("My3", "Nguyen Thi Tra", "myntt1@fpt.com");
		studentDAO.save(st1);
		studentDAO.save(st2);
		studentDAO.save(st3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating new student .....");
		Student st = new Student("My", "Nguyen Thi Tra", "myntt19@fpt.com");

		// save student object
		System.out.println("Saving student .....");
		studentDAO.save(st);

		// display id of saved student
		System.out.println("Saved student. Generated id: " + st.getId());
	}

}
