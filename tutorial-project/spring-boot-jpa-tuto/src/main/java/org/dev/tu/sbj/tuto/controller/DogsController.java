package org.dev.tu.sbj.tuto.controller;

import java.util.List;

import org.dev.tu.sbj.tuto.dao.DogsRepository;
import org.dev.tu.sbj.tuto.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dog")
@ComponentScan("org.dev.tu.sbj.tuto")
@EnableAutoConfiguration
public class DogsController {

	//@Autowired DogsService dogsService;
	@Autowired
	private DogsRepository dogsReository;
//	
//    @GetMapping("findAll")
//    public List<Dog> getDogs() {
//        return dogsReository.findAll();
//    }
//    @RequestMapping(value="addDog",method=RequestMethod.POST)
//    public Dog postDogs(@RequestBody Dog dog) {
//    	return dogsReository.save(dog);
//    }
	@GetMapping("hello")
	public String sayHello() {
		return "Hello service";
	}
}
