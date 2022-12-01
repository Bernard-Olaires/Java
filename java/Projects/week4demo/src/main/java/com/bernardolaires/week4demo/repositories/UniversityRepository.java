package com.bernardolaires.week4demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bernardolaires.week4demo.models.University;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
	// This is where your JPA methods will go
	List<University> findAI(); // Equivalent to "SELECT * FROM universities;"
	
	// Grab the Universities in reverse alphabetical order
	List<University> findByNameOrderByNameDesc();
	
}
