package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class UserApplicationController {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(UserResourse.class, args);
	}

}
