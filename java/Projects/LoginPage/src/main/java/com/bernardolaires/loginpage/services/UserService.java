package com.bernardolaires.loginpage.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.bernardolaires.loginpage.models.User;
import com.bernardolaires.loginpage.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User register(User newUser, BindingResult result) {
		// First, check to see if passwords match
		if(!newUser.getConfirm().equals(newUser.getPassword())) { // !true -> flase; !flase -> true
			result.rejectValue("confirm", "Matches", "Your password must match!");
		}
		// Check to see whether we have any users registered already with the email
		Optional<User> optionalUser = userRepository.findByEmail(newUser.getEmail());
		// If a user already refistered with that email
		if(optionalUser.isPresent()) {
			result.rejectValue("email", "Matches", "Email is already registered.");
		} 
		// Return the user back - if the validations are okay
		if(result.hasErrors()) {
			return null;
		}else { // elseif all validations are good
			// Hash the password then save the user in the database
			String hashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashedPassword); // Hashed password will be saved in a database
			return userRepository.save(newUser); // Save new user in DB
		}
	}
	
	
	public User findById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.orElseGet(() -> null);
	}
	
	public User findByEmail(String email) {
		Optional<User> optionalUser = userRepository.findByEmail(email);
		return optionalUser.orElseGet(() -> null);
	}
	
	public User updateUser(User newUser) {
		return userRepository.save(newUser);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	
		
		
		
}
