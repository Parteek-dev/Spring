package com.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * using @Component because Spring container will create the object of Maths class
 * we are not using bean tag in the XML file
 * @author Parteek.Kumar
 *@Component is an alternative of @Bean 
 */
@Component
public class Maths {

	/**
	 * This Maths class depends on Addition and Subtract class so we need to inject the 
	 * dependency in this class to achive this we can use @autowired annotation on
	 * Reference type variable - ByType , getters method - ByName, and constructor - constructor
	 */
	
	private Addition addition;
	private Subtract subtract;
	

	public Addition getAdd() {
		return addition;
	}

	@Autowired
	public void setAdd(Addition add) {
		this.addition = add;
	}


	public Subtract getSub() {
		return subtract;
	}

	@Autowired
	public void setSub(Subtract sub) {
		this.subtract = sub;
	}


	@Override
	public String toString() {
		return "Maths [add=" + addition + ", sub=" + subtract + "]";
	}


	public Maths() {
		System.out.println("Maths - Default Constructor");
		
	}

	
	public Maths(Addition addition, Subtract subtract) {
		super();
		this.addition = addition;
		this.subtract = subtract;
		System.out.println("Maths - parametrized Constructor");
	}
	
}
