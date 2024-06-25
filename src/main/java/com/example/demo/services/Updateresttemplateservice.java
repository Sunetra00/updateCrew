package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Crewinfo;

@Service
public class Updateresttemplateservice {

	RestTemplate resttemplate = new RestTemplate();
	final String URL = "/ddboperation";

	public void updateCrew(Crewinfo crew) {
		resttemplate.put(URL, crew);
	}

}
