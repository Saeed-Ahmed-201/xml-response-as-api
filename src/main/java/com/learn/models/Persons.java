package com.learn.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Persons implements Serializable {

	private static final long serialVersionUID = 22L;
	
	@JacksonXmlProperty(localName = "person")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Person> persons = new ArrayList<>();
	
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	public List<Person> getPersons(){
		   return this.persons;
	}
	
}
