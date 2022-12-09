package com.bernardolaires.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bernardolaires.relationships.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	
	// retrieves all License's
	List<License> findAll();
}
