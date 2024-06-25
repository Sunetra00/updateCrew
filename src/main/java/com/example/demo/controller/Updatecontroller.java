package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Crewinfo;
import com.example.demo.services.Updateresttemplateservice;


@RestController
public class Updatecontroller {
	
	@Autowired
	public Updateresttemplateservice updateresttemplateservice;
	
	@PutMapping("/updateCrew")
	public void updateEmployee(@RequestBody Crewinfo  crew) {
		
		updateresttemplateservice.updateCrew(crew);
		
	}

}
