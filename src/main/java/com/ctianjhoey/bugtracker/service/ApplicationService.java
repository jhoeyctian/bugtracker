package com.ctianjhoey.bugtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctianjhoey.bugtracker.entity.Application;
import com.ctianjhoey.bugtracker.repository.ApplicationRepository;

@Service
public class ApplicationService {

	@Autowired
	ApplicationRepository appRepo;

	public void addApplication(Application app) {
		appRepo.save(app);
	}
}
