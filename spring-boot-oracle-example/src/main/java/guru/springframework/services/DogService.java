package guru.springframework.services;

import java.util.List;

import guru.springframework.domain.Dog;

public interface DogService {
    List<Dog> listAll();
    Dog getById(Long id);
    Dog saveOrUpdate(Dog dog);
    void delete(Long id);
}
