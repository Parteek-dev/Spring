package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunMaths {

	public RunMaths() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//using this class because we are not using XML configuration
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Maths m = context.getBean("maths", Maths.class);
		
		System.out.println(m);
		m.getAdd().doSum();
		
		m.getSub().setA(100);
		m.getSub().setB(200);
		
		m.getSub().doSubstract();
		
	}

}
