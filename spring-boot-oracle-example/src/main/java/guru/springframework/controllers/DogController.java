package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import guru.springframework.domain.Dog;
import guru.springframework.services.DogService;

@Controller
public class DogController {
	
	@Autowired
	private DogService dogService;

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/dog/list";
    }

	@ResponseBody
	@RequestMapping(value="add", method=RequestMethod.POST)
	private Dog addDog(@RequestBody Dog dog) {
		System.out.println("Service calling xxxxxxyy :"+dog.getName());
		return dogService.saveOrUpdate(dog);
	}
	
	
}
