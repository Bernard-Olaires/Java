package com.bernardolaires.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bernardolaires.dojosandninjas.models.Dojo;
import com.bernardolaires.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	// adding DojoRepository as a dependency 
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	// returns all burger's
	public List<Dojo> allDojos() {
		return dojoRepository.findAll(); 
	}
	
	// creates a Dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}
	
	// retrieves a Dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	// updates Dojo
	
	public Dojo updatedDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	// deletes dojo
	public void deleteDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			dojoRepository.deleteById(id);
		}
	}
}
