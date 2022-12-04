package com.bernardolaires.burgertracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bernardolaires.burgertracker.models.Burger;
import com.bernardolaires.burgertracker.services.BurgerService;

@Controller
public class BurgerController {
	
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("burger") Burger burger, Model model) {
		
		List<Burger> burgers = burgerService.allBurgers();
		
		model.addAttribute("burgers", burgers);
		
		return "burgers.jsp";
	}
	
	@PostMapping("/burger/new")
	public String create(
			@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result,
			Model model
			) {
		if (result.hasErrors()) {
			return "/burgers.jsp";
		} else {
			burgerService.createBurger(burger);
			return "redirect:/";
		}
	}
	
}
