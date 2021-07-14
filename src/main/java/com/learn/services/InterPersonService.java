package com.learn.services;


import com.learn.models.Person;
import com.learn.models.Persons;

public interface InterPersonService {

	  Person findById(Long id);
	  
	  Persons findAll();
	  
	  
}
