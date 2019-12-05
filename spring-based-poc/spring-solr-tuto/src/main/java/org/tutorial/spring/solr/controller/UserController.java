package org.tutorial.spring.solr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.tutorial.spring.solr.entiry.User;
import org.tutorial.spring.solr.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check() {
		return "Hello";
	}
	@ResponseBody
	@RequestMapping(value ="/findAll",method = RequestMethod.GET)
	public List<User> findAllUser() {
		return userservice.findAll();
	}
	
	@RequestMapping(value = "rebuildSolrIndex", method = RequestMethod.GET)
	public Integer rebuildSolrIndex() {
		return null;
	}
	
	
}
