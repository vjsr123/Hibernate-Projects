package com.learn.hiberanate.ex1.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	int rollno;
	String name;
	int age;
	
	public student()
	{
		
	}
	public student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	
	

}
