package org.dev.tu.sbj.tuto.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootJpaApplication  {
	
	
	public static void main(String[] args) {
		SpringApplication.run(DogsController.class, args);
	}
}
