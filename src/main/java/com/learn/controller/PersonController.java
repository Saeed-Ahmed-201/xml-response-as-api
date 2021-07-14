package com.learn.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.models.Person;
import com.learn.services.PersonService;

@RestController
public class PersonController {
	
	   @Autowired(required = true)
	   private PersonService personService;
	   
	   @GetMapping(value = "/person/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	   public Person findPersonById(@PathVariable Long id) {
		      return this.personService.findById(id);
	   }
	   
	   @GetMapping(value = "/persons", produces = MediaType.APPLICATION_XML_VALUE)
	   public List<Person> findAllPersons() {
		      return this.personService.demo();
	   }
	   

}
