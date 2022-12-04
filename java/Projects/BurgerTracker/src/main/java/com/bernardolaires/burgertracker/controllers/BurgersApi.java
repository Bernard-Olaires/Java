package com.bernardolaires.burgertracker.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bernardolaires.burgertracker.models.Burger;
import com.bernardolaires.burgertracker.services.BurgerService;

@RestController
public class BurgersApi {

	private final BurgerService burgerService;

	public BurgersApi(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@RequestMapping("/api/burgers")
	public List<Burger> index() {
		return burgerService.allBurgers();
	}
	
    @RequestMapping(value="/api/burgers", method=RequestMethod.POST)
    public Burger create(
    		@RequestParam(value="burgerName") String burgerName, 
    		@RequestParam(value="resturantName") String resturantName, 
    		@RequestParam(value="rating") Integer rating
    		) {
        Burger burger = new Burger(burgerName, resturantName, rating);
        return burgerService.createBurger(burger);
    }
    
    
    @RequestMapping("/api/burgers/{id}")
    public Burger Show(@PathVariable("id") Long id) {
    	Burger burger = burgerService.findBurger(id);
    	return burger;
    }
	
	
}
