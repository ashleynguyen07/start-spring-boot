package com.ashley.onetoonemappings;

import com.ashley.onetoonemappings.dao.AppDAO;
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
			createInstructor(appDAO);
		};
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
