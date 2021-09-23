package com.example.docker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.docker.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

	
	
}
