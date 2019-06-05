package org.spring.boot.jpa.tuto.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.spring.boot.jpa.tuto.entity.Dog;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface DogsRepository  extends CrudRepository<Dog, Long>{

}
