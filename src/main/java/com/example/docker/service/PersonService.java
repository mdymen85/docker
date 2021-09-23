package com.example.docker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.docker.model.Person;
import com.example.docker.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	public Person create(String name, String surname) {
		return this.repository.save(new Person(name,surname));
	}
	
}
