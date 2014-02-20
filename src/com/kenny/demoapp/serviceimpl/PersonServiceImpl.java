package com.kenny.demoapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenny.demoapp.dao.PersonRepository;
import com.kenny.demoapp.entities.Person;
import com.kenny.demoapp.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public boolean validateUser(Person person) {
		// TODO Auto-generated method stub
		
		if(!(personRepository.exists(person.getId())) && !person.getFirstName().isEmpty()){
			personRepository.save(person);
			return true;
		}
		return false;
	}

}
