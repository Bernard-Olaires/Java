package com.bernardolaires.loginpage.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bernardolaires.loginpage.models.User;
import com.bernardolaires.loginpage.services.UserService;

@Controller
public class MainController {
    
    // Linking our Services
	@Autowired
	private UserService userService;
	
	
	// Login/Registration Page
	@GetMapping("/")
	public String loginRegPage(@ModelAttribute("registerUser") User newUser) {
		return "loginreg.jsp";
	}
	
	// Dashboard - must be logged in
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model viewModel) {
		Long userId = (Long) session.getAttribute("userId");
		viewModel.addAttribute("loggedUser", userService.findById(userId));
		return "dashboard.jsp";
	}
    
	// Register user, if valid
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("registerUser") User newUser,
			BindingResult result, HttpSession session) {
		User changedUser = userService.register(newUser, result); // Call on additional validations here
		if(result.hasErrors()) { // Will have run the baseline validations in the model
			return "loginreg.jsp";
		}
		// User is already registered in the register method UserService file
		session.setAttribute("userId", changedUser.getId());
		
		// Go to dashboard
		return "redirect:/dashboard";
	}
	
	// Login user, if valid 
	@PostMapping("/login")
	public String loginUser() {
		return null;
	}
	
	
	// Log out by clearing session and sending back to login/reg page
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // Clears session
		return "redirect:/";
	}

}
