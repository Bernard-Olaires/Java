package com.bernardolaires.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bernardolaires.savetravels.models.Expense;
import com.bernardolaires.savetravels.services.ExpenseService;

@Controller
public class MainController {

	@Autowired
	ExpenseService expenses;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String expenses(@ModelAttribute("expense") Expense expense, Model model) {
		
		model.addAttribute("expenses", expenses.allExpenses());
		
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("expenses", expenses.allExpenses());
			return "index.jsp";
		}
		System.out.println(expense);
		expenses.create(expense);
		
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenses.find(id));
		System.out.println("this is the platform solution");
		
		return "edit.jsp";
	}
	
	@PostMapping("/expenses/{id}/edit")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			expenses.update(expense);
			return "redirect:/";
		}
		
	}
	
    @GetMapping("/expenses/{id}/delete")
    @DeleteMapping("/expenses/{id}/delete")
    public String deleteFromDb(@PathVariable("id") Long id) {
    	expenses.deleteExpense(id);
    	return "redirect:/";
    }
}
