package org.dev.tu.sbj.tuto.dao;

import org.dev.tu.sbj.tuto.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;



/*@Repository
public interface DogsRepository  extends CrudRepository<Dog, Long>{
	public List<Dog> findAll();
	public void add(Dog dog);
}*/
@Component
public interface DogsRepository extends JpaRepository<Dog, Long>{
}
