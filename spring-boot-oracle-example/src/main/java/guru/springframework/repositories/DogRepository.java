package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long>{

}
