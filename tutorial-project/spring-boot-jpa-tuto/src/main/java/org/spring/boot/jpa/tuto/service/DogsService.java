package org.spring.boot.jpa.tuto.service;

import java.util.List;

import org.spring.boot.jpa.tuto.dao.DogsRepository;
import org.spring.boot.jpa.tuto.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DogsService {
	@Autowired
	private DogsRepository dogsRepository;
	
	public void add(Dog dog) {
		dogsRepository.save(dog);
	}
	public List<Dog> getDogs(){
		return (List<Dog>)dogsRepository.findAll();
	}
}
