package com.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * using @Component because Spring container will create the object of Addition class
 * we are not using bean tag in the XML file
 * @author Parteek.Kumar
 * @Component is an alternative of @Bean 
 * 
 *
 */

@Component
public class Addition {
	
	@Value("12")
	private int a;
	@Value("10")
	private int b;
	
	
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

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

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("Constructor => Int , Int ");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor => double , double ");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor => String , String ");
	}
	
	public void doSum()
	{
		System.out.println("Sum is "+(a+b));
	}
	
}
