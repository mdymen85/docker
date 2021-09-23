package com.example.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.model.Person;
import com.example.docker.service.PersonService;

@RestController
public class TestController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(path = "/api/v1/test", method = RequestMethod.GET)
	public Person getPerson() {
		Person p = new Person();
		p.setName("Martin");
		p.setSurname("Dymenstein");
		
		return p;
	}
	
	@RequestMapping(path = "/api/v1/person", method = RequestMethod.POST)
	public Person save(@RequestBody PersonDTO person) {
		return personService.create(person.getName(), person.getSurname());
	}
	
}
