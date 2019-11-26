package org.tutorial.spring.solr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check() {
		return "Hello";
	}
	
}
