package com.qixian.dao;

import java.util.List;

import com.qixian.model.PersonDto;

public interface IPerson {
	
	public List<PersonDto> getListPerson();
	
	public PersonDto getPersonByName(String PersonName);
	
	public PersonDto getPersonById(String PersonId);
	
	public void savePerson(PersonDto personDto);
	
	public void delectPerson(PersonDto personDto);
	
	public void updatePerson(PersonDto personDto);
}
