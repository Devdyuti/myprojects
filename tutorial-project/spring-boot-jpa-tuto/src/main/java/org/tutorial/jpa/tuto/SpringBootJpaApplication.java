package org.tutorial.jpa.tuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="org.tutorial.jpa.tuto.controllery")
@SpringBootApplication
public class SpringBootJpaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
}
