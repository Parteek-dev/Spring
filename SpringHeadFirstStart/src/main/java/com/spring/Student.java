package com.spring;

public class Student {

	int id;
	String name;
	String address;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address) {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Setting address => "+address);
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
