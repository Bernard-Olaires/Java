package com.bernardolaires.loginpage.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bernardolaires.loginpage.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	Optional<User> findByEmail(String email); // find any users witht the given email - if any

}
