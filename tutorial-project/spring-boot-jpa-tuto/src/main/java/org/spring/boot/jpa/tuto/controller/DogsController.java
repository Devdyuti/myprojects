package org.spring.boot.jpa.tuto.controller;

import java.util.List;

import org.spring.boot.jpa.tuto.entity.Dog;
import org.spring.boot.jpa.tuto.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dog")
public class DogsController {

	@Autowired
	private DogsService dogsService;
	
	
    @GetMapping
    public List<Dog> getDogs() {
        return dogsService.getDogs();
    }
    @RequestMapping(value="addDog",method=RequestMethod.POST)
    public void postDogs(@RequestBody Dog dog) {
    	dogsService.add(dog);
    }
}
