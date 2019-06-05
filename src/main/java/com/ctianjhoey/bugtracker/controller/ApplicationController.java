package com.ctianjhoey.bugtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ctianjhoey.bugtracker.entity.Application;
import com.ctianjhoey.bugtracker.service.ApplicationService;

@RestController
@RequestMapping("/app")
public class ApplicationController {

	@Autowired
	ApplicationService appService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void addApplication(@RequestBody Application app) {
		appService.addApplication(app);
	}
}
