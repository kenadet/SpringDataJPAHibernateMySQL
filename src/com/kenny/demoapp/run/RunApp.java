package com.kenny.demoapp.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kenny.demoapp.entities.Person;
import com.kenny.demoapp.service.PersonService;
import com.kenny.demoapp.serviceimpl.PersonServiceImpl;

public class RunApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Resources/applicationContext.xml");
		
		PersonService personService= applicationContext.getBean("personService", PersonServiceImpl.class);
		
		Person person= new Person();
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setVersion(1);
		
		personService.validateUser(person);
		
		
	}

}
