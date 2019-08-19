package org.tutorial.jpa.tuto.controller;



import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tutorial.jpa.tuto.entity.User;
import org.tutorial.jpa.tuto.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/checkStatus", method=RequestMethod.HEAD)
	public void checkServiceavailablity(HttpServletResponse response) throws IOException {
		response.setHeader("Custom-Header", "User-service");
		response.setHeader("Status", "Ok");
		response.getWriter().println("User-service is up and Running!");
	} 
	
	@PostMapping("/add")
	public User insertUser(@RequestBody User user) {
		return userService.addUser(user);
	}

}
