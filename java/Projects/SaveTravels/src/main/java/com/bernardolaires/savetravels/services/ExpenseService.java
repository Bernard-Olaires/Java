package com.bernardolaires.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bernardolaires.savetravels.models.Expense;
import com.bernardolaires.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	// adding the repository as a dependency
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	// returns all the expenses
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}
	
	// creates an expense
	public Expense create(Expense b) {
		return expenseRepo.save(b);
	}
	
	// updates an expense
	public Expense update(Expense b) {
		return expenseRepo.save(b);
	}
	
	// retrieves an expense 
	public Expense find(Long id) {
		Optional<Expense> optional = expenseRepo.findById(id);
		if(optional.isPresent() ) {
			return optional.get();
		} else {
			return null;
		}
	}
	
	// deletes an expense
	public void deleteExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			expenseRepo.deleteById(id);
		}
	}
	
}
