package org.tutorial.spring.solr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.repository.SolrRepository;
import org.springframework.stereotype.Service;
import org.tutorial.spring.solr.entiry.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Override
	public List<User> findAll() {
		
		List<User> list=new ArrayList<User>();
		User user1=new User();
		user1.setId(1);
		user1.setName("Devdyuti");
		
		User user2=new User();
		user2.setId(2);
		user2.setName("Devjyoti");
		
		list.add(user1);
		list.add(user2);
		
		return list;
	}

}
