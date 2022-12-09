package com.bernardolaires.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bernardolaires.dojosandninjas.models.Dojo;
import com.bernardolaires.dojosandninjas.models.Ninja;
import com.bernardolaires.dojosandninjas.services.DojoService;
import com.bernardolaires.dojosandninjas.services.NinjaService;

@Controller
public class MainController {
	
	// adding DojoService as a dependency
	@Autowired
	private DojoService dojoService;
	
	// adding NinjaService as a dependency 
	private NinjaService ninjaService;
	
	// NEW DOJO FORM
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("dojo", dojo);
		return "newDojo.jsp";
	}
	
	// CREATE DOJO ROUTE
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	// NEW NINJA ROUTE
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojo", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
	// CREATE NINJA ROUTE
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result,
			Model model) {
		ninjaService.createNinja(ninja);
		return "redirect:/ninjas/new";
	}
	
	
}
