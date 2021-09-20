package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.model.Person;

@RestController
public class TestController {

	@RequestMapping(path = "/api/v1/test", method = RequestMethod.GET)
	public Person getPerson() {
		Person p = new Person();
		p.setName("Martin");
		p.setSurname("Dymenstein");
		
		return p;
	}
	
}
