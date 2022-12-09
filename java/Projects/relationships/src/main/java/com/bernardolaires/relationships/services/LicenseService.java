package com.bernardolaires.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bernardolaires.relationships.models.License;
import com.bernardolaires.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	
	// adding LicenseRepository as a dependency
	private final LicenseRepository licenseRepo;
	
	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	// returns all license's 
	public List<License> allLicense() {
		return licenseRepo.findAll();
	}
	
	// creates a license 
	public License createLicesne(License b) {
		return licenseRepo.save(b);
	}
	
	// retrieves a license
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		}else {
			return null;
		}
	}
	
	// updated license
	
	public License updateLicense(License license) {
		return licenseRepo.save(license);
	}
	
	// delete a license
	public void deleteLicense(Long id) {
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if(optionalLicense.isPresent()) {
			licenseRepo.deleteById(id);
		}
	}
}
