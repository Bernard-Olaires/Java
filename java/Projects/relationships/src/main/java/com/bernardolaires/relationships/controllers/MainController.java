package com.bernardolaires.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bernardolaires.relationships.models.License;
import com.bernardolaires.relationships.models.Person;
import com.bernardolaires.relationships.services.LicenseService;
import com.bernardolaires.relationships.services.PersonService;

@Controller
public class MainController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private LicenseService licenseService;
	
	// NEW PERSON FORM
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person, Model model ){
		model.addAttribute("person", person);
		return "newPerson.jsp";
	}
	
	// CREATE PERSON ROUTE
	@PostMapping("/persons/create")
	public String createPerson(@Valid @ModelAttribute("person") Person person,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "newPerson.jsp";
		}else {
			personService.createPerson(person);
			return "redirect:/persons/new";
		}
		
	}
	
	// SHOW PERSON ROUTE
	
	@GetMapping("/persons/{person_id}")
	public String showPerson(@PathVariable Long person_id, Model model) {
		Person someAwesomePerson = personService.findPerson(person_id);
		model.addAttribute("person", someAwesomePerson);
		
		return "showPerson.jsp";
	}
	
	// ADD LICENSE FORM 
	@GetMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("person", personService.allPersons());
		return "newLicense.jsp";
	}
	
	// New License
	@PostMapping("/licenses/create")
	public String createLicense(@Valid @ModelAttribute("license") License license) {
		licenseService.createLicesne(license);
		return "redirect:/persons/new";
		
	}
	
	
	
	
	
}
