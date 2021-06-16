package com.spring.person;

import java.util.List;

import com.spring.certificate.Certificate;

public class Person {
	
	private String name;
	private List<Certificate> cert;

	public Person(String name, List<Certificate> cert) {
		super();
		this.name = name;
		this.cert = cert;
	}
	
	public void printDetails()
	{
		System.out.println("Person Name: "+ name);
		System.out.println("Person Certificates: "+ cert);
	}
	

}
