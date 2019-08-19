package org.dev.krish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="org.dev.krish.repository")
@SpringBootApplication
public class OrgDevKrishApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgDevKrishApplication.class, args);
	}

}
