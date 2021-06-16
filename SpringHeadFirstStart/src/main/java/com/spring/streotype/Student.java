package com.spring.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component - then use class name to get object from context.
//@Component

//define the variable of object that spring container will make. 
@Component("stu")
@Scope("prototype")
public class Student {

	@Value("012")
	int id;
	@Value("Sethi Saab")
	String name;
	
	@Value("#{al}")
	List<String> address;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting id => "+id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name => "+name);
		this.name = name;
	}	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		System.out.println("Setting address => "+address);
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
