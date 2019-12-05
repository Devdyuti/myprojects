package org.tutorial.spring.solr.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tutorial.spring.solr.entiry.User;

public interface UserService {
	public List<User> findAll();
}
