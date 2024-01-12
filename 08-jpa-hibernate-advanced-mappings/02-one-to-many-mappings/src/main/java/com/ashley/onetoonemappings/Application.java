package com.ashley.onetoonemappings;

import com.ashley.onetoonemappings.dao.AppDAO;
import com.ashley.onetoonemappings.entity.Course;
import com.ashley.onetoonemappings.entity.Instructor;
import com.ashley.onetoonemappings.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner cmdLineRunner(AppDAO appDAO) {
		return runner -> {
			//createInstructor(appDAO);
			//findInstructorById(appDAO);
			//deleteInstructorById(appDAO);
			//createCourse(appDAO);
			findInstructorWithCourse(appDAO);
		};
	}

	private void findInstructorWithCourse(AppDAO appDAO) {
		int id = 9;
		System.out.println("Finding instructor id: " + id);

		// find instructor by id
		Instructor instructor = appDAO.findById(id);
		System.out.println("instructor: " + instructor);

		// associated course
		System.out.println("the associated course:" + instructor.getCourses());
		System.out.println("Done!");
	}

	private void createCourse(AppDAO appDAO) {
		// create the instructor
		Instructor instructor = new Instructor("Hung","Hoang Vu", "hunghv@fpt.com");

		// create instructor details
		InstructorDetail instructorDetail = new InstructorDetail("IT Channel","IT");

		// Associate the objects - lien ket cac doi tuong
		instructor.setInstructorDetailId(instructorDetail);

		// Create some courses
		Course course = new Course("Mathematics");
		Course course1 = new Course("Draw");
		Course course2 = new Course("Singing");

		// Add course to instructor
		instructor.add(course);
		instructor.add(course1);
		instructor.add(course2);

		// Save the instructor - This will also save the course because of CascadeType.PERSIST
		System.out.println("Saving instructor: " + instructor);
		System.out.println("The courses: " + instructor.getCourses());
		appDAO.save(instructor);
		System.out.println("Saved!");

	}

	private void deleteInstructorById(AppDAO appDAO) {
		int id = 5;
		appDAO.deleteById(id);
		System.out.println("Deleted instructor ID " + id);
	}

	private void findInstructorById(AppDAO appDAO) {
		int id = 2;
		System.out.println("Finding instructor ID: " + id);

		Instructor instructor = appDAO.findById(id);
		if(instructor == null) {
			System.out.println("Not found instructor ID: " + id);
		} else {
			System.out.println("Instructor: " + instructor.toString());
			System.out.println("Instructor Details: " + instructor.getInstructorDetailId());
		}

	}

	private void createInstructor(AppDAO appDAO) {

		// create the instructor
		Instructor instructor = new Instructor("My", "Nguyen", "myntt19@fpt.com");
		// create the instructor detail
		InstructorDetail instructorDetail = new InstructorDetail("https://www.youtube.com/watch?v=D3wwNaPx0OI","IT");

		// associate - kết hợp the objects
		instructor.setInstructorDetailId(instructorDetail);
		System.out.println("Saving instructor: " + instructor);

		// save the instructor
		appDAO.save(instructor);
	}
}
