package com.bernardolaires.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bernardolaires.burgertracker.models.Burger;
import com.bernardolaires.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	// adding BurgerRepository as a depedency
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
	// returns all  burger's
	public List<Burger> allBurgers() {
		return burgerRepository.findAll();
	}
	
	// creates a burger
	public Burger createBurger(Burger b) {
		return burgerRepository.save(b);
	}
	
	// retrieves a burger
	public Burger findBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		}else {
			return null;
		}
	}
	
	
	
}
