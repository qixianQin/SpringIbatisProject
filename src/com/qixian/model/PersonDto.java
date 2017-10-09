package com.qixian.model;

/**
 * 
 * @Description: TODO
 * @author qin.qixian
 * @date 2017年9月29日 下午11:11:36
 * @version V1.0
 */

public class PersonDto {
	
	private String id;
	
	private String name;
	
	private int age;
	
	private String sex;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public PersonDto(){
		
	}
	
	public PersonDto(String id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
}
