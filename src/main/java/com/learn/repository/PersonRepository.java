package com.learn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learn.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

}
