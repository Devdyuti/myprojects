package guru.springframework.services;

import java.util.List;

import org.springframework.stereotype.Service;

import guru.springframework.domain.Dog;
import guru.springframework.repositories.DogRepository;

@Service
public class DogServiceImpl implements DogService{
	
	private DogRepository dogRepository;	

	@Override
	public List<Dog> listAll() {
		// TODO Auto-generated method stub
		return (List<Dog>)dogRepository.findAll();
	}

	@Override
	public Dog getById(Long id) {
		// TODO Auto-generated method stub
		return dogRepository.findOne(id);
	}

	@Override
	public Dog saveOrUpdate(Dog dog) {
		// TODO Auto-generated method stub
		return dogRepository.save(dog);
	}

	@Override
	public void delete(Long id) {
		
		dogRepository.delete(id);
	}


}
