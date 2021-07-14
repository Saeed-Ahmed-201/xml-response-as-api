package com.learn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.models.Person;
import com.learn.models.Persons;
import com.learn.repository.PersonRepository;

@Service
public class PersonService implements InterPersonService{
	
	    @Autowired
	    private PersonRepository personRepository;

		@Override
		public Person findById(Long id) {
			   return this.personRepository.findById(id).orElse(null);
		}

		@Override
		public Persons findAll() {
			var retrievedPersons = (List<Person>) this.personRepository.findAll();
			Persons persons = new Persons();
			persons.setPersons(retrievedPersons);
			return persons;
		}
	    
		
		public List<Person> demo(){
			   Person p = new Person();
			   List<Person> persons = (List<Person>) this.personRepository.findAll();
			   p.setPerson(persons);
			   return persons;
			   
		}
	    

}
