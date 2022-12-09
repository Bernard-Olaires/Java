package com.bernardolaires.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bernardolaires.relationships.models.Person;
import com.bernardolaires.relationships.repositories.PersonRepository;

@Service
public class PersonService {

	// adding person repository as a dependency
	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}
	
	// returns all persons 
	public List<Person> allPersons() {
		return personRepo.findAll();
	}
	
	// creates a person
	public Person createPerson(Person b) {
		return personRepo.save(b);
	}
	
	// retrieves a person
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepo.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		}else {
			return null;
		}
	}
	
	// updates a person
	public Person updatePerson(Person person) {
		return personRepo.save(person);
	}
	
	// deletes a person
	public void deletePerson(Long id) {
		Optional<Person> optionalPerson = personRepo.findById(id);
		if(optionalPerson.isPresent()) {
			personRepo.deleteById(id);
		}
	}
	
}
