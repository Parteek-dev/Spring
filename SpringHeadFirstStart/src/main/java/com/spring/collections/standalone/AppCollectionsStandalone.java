/**
 * Stand-alone Collections Example
 */

package com.spring.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollectionsStandalone {

	private static ApplicationContext ac;
	
	public AppCollectionsStandalone() {
		
	}

	public static void main(String[] args) {
	
		ac = new ClassPathXmlApplicationContext("com/spring/collections/standalone/"
				+ "standcollect-config.xml");
		
		Employee emp  = ac.getBean("emp",Employee.class);
		
		System.out.println("_____"+ emp.getClass().getName()+"_______");
		System.out.println("_______Qualifications__________");
		System.out.println(emp.getQualification());
		System.out.println("_______Address____________");
		System.out.println(emp.getAddress());
		System.out.println("________Courses_________");
		System.out.println(emp.getCourses());
		
	}

}
