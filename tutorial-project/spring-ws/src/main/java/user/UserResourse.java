package user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@Configuration
@ComponentScan("user")
@EnableAutoConfiguration
public class UserResourse {
	@Autowired
	private UserServiceDAO service;
	
	@GetMapping("/users")
	public List<User> retriveAllUser(){
		return service.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/users/{id}")
	public Resource<User> retriveOneUser(@PathVariable int id) {
		User user=service.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id-"+id);
		}
		// Implementing HATEOAS Hypertext As the Engine of Application state
		Resource<User> resource=new Resource<User>(user);
		ControllerLinkBuilder linkTo=linkTo(methodOn(this.getClass()).retriveAllUser());
		resource.add(linkTo.withRel("all-users"));
				
		return resource; 
	}
	@PostMapping("/usersX")
	public User createUser(@RequestBody User user) {
		service.saveUser(user);
		return user;
	}
	/**Another method of POST request using RequestEntity in return statement.
	 * @param RequestBody
	 * @param Valid for validation
	 **/
	@PostMapping("/users")
	public ResponseEntity<Object> createUserOtherMethod(@Valid @RequestBody User user){
		User saveUser=service.saveUser(user);
		
		URI location=ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(saveUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User user=service.deleteById(id);
		if(user==null)
			throw new UserNotFoundException("id-"+id);
	}
}
