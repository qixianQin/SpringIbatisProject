package com.qixian.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.qixian.dao.IPerson;
import com.qixian.model.PersonDto;

public class Person extends SqlMapClientDaoSupport  implements IPerson{

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonDto> getListPerson() {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("getAllPerson", null);
		
	}

	@Override
	public PersonDto getPersonByName(String personName) {
		// TODO Auto-generated method stub
		return (PersonDto) getSqlMapClientTemplate().queryForObject("getPersonByName", personName);
	}

	@Override
	public PersonDto getPersonById(String personId) {
		// TODO Auto-generated method stub
		return (PersonDto) getSqlMapClientTemplate().queryForObject("getPersonById", personId);
	}

	@Override
	public void savePerson(PersonDto personDto) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().insert("insertPerson", personDto);
	}

	@Override
	public void delectPerson(PersonDto personDto) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().delete("delectPerson", personDto);
	}

	@Override
	public void updatePerson(PersonDto personDto) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().update("udpatePerson", personDto);
		
	}

}
