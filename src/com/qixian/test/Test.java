package com.qixian.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qixian.dao.impl.Person;
import com.qixian.model.PersonDto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("source/applicationContext.xml");
		
		Person personImpl = (Person)context.getBean("person");
		
		List<PersonDto> resultPersonList = new ArrayList<PersonDto>();
		resultPersonList = personImpl.getListPerson();
		for (PersonDto person : resultPersonList) {
			System.out.println("Id:" + person.getId() + " Name: " + person.getName() + " Age:" + person.getAge() 
			+ " Sex:" + person.getSex());
		}
		
		PersonDto personDto = personImpl.getPersonByName("test2");
		System.out.println(personDto.getAge());
		
		PersonDto personById = personImpl.getPersonById("1");
		System.out.println(personById.getName());
		
//		PersonDto insertPerson = new PersonDto();
//		insertPerson.setAge(44);
//		insertPerson.setId("4");
//		insertPerson.setName("t est4");
//		insertPerson.setSex("M");
//		
//		personImpl.savePerson(insertPerson);
		
//		personImpl.savePerson(new PersonDto("5", "test5", 55, "F"));
		
		personImpl.updatePerson(new PersonDto("5", "test5", 15, "M"));
		
 
	}

}
