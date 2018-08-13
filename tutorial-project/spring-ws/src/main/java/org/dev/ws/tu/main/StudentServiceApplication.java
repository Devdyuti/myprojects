package org.dev.ws.tu.main;

import org.dev.ws.tu.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {
	
//	@RequestMapping("/")
//	String hello() {
//		return "hello";
//	}

	public static void main(String[] args) {
		SpringApplication.run(StudentController.class, args);
	}

}
