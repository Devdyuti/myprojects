package org.tutorial.jpa.tuto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutorial.jpa.tuto.entity.User;
import org.tutorial.jpa.tuto.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

}
