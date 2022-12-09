package com.bernardolaires.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bernardolaires.dojosandninjas.models.Ninja;
import com.bernardolaires.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	// adding NinjaRepository as a dependency
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	// returns all Ninjas
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	
	// creates a Ninja
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
	
	// retrievs a ninja
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}else {
			return null;
		}
	}
	
	// updates Ninja
	
	public void updateNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			ninjaRepository.deleteById(id);
		}
	}
}
