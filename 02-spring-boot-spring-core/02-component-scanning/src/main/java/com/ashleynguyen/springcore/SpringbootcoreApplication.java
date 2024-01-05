package com.ashleynguyen.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.ashleynguyen.springcore",
							"com.ashleynguyen.utils"
		}
)
public class SpringbootcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcoreApplication.class, args);
	}

}
