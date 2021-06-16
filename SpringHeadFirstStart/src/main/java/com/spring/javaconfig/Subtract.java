package com.spring.javaconfig;

import org.springframework.stereotype.Component;

/**
 * using @Component because Spring container will create the object of Subtract class
 * we are not using bean tag in the XML file
 * @author Parteek.Kumar
 *@Component is an alternative of @Bean 
 */

@Component
public class Subtract {

	private int a ;
	private int b;
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	@Override
	public String toString() {
		return "Subtract [a=" + a + ", b=" + b + "]";
	}



	public Subtract() {
		// TODO Auto-generated constructor stub
	}
	
	public void doSubstract()
	{
		System.out.println("Substract is "+(a-b));
	}

}
