package com.learn.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JacksonXmlRootElement(localName = "person")
public class Person {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @JacksonXmlProperty(isAttribute = true)
	   private Long id;
	   
	   @Column(name = "first_name")
	   @JacksonXmlProperty
	   private String firstName;
	   
	   @Column(name = "last_name")
	   @JacksonXmlProperty
	   private String lastName;
	   
	   @Column(name = "contact")
	   @JacksonXmlProperty
	   private String contact;
	   
	   @Transient
	   @JacksonXmlProperty(localName = "persons")
	   @JacksonXmlElementWrapper(useWrapping = false)
	   private List<Person> person = new ArrayList<>();

}