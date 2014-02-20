package com.kenny.demoapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.kenny.demoapp.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long>  {

}
