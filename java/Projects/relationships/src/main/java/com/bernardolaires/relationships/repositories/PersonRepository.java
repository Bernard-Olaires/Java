package com.bernardolaires.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bernardolaires.relationships.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	
	// gets all persons 
	List<Person> findAll();
}
