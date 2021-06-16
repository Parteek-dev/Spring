package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.addition.Addition;
import com.spring.comp.Company;
import com.spring.emp.Employee;
import com.spring.lifecycle.LifcycleUsingInterface;
import com.spring.lifecycle.LifecycleUsingAnno;
import com.spring.lifecycle.Pepsi;
import com.spring.person.Person;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {
		
		System.out.println("Main App Started..");
		
		@SuppressWarnings("resource")
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		/**
		 * To call destroy method then use AbstractApplicationContext
		 * to register shutdown hook
		 */
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//to call destroy method registering ShutdownHook 
				context.registerShutdownHook();
		
		/**
		 * Setter injection with primitive type as follows:
		 */
		/*System.out.println("Using with basic way => "+context.getBean("student"));
		
		Student s1 = (Student)context.getBean("student1");
		
		System.out.println("Using attribute in property tag => "+s1);
		
		Student sp = (Student)context.getBean("student2");
		
		System.out.println("Using p Sechema => "+sp);*/
		
		/**
		 * Setter injection with Collections type as follows:
		 */
		
//		Employee e1 = (Employee) context.getBean("emp");
//		
//		System.out.println(e1);
		
		/**
		 * Setter injection with Reference type as follows:
		 */
//		Company c1 = (Company) context.getBean("comp");
//		
//		c1.testConnection();
//		
//		System.out.println("Object ref => Address: " + e1.getObjCmp().getAddress()
//				+ ", Name: "+c1.getName()
//				+", Rank: " +e1.getObjCmp().getRank() 
//				);
		
		
		/**
		 * Constructor injection with Reference type as follows:
		 */
		
//		Person p1 = (Person) context.getBean("person");
//		p1.printDetails();
		
		/**
		 * Constructor injection solve ambiguity problem as follows:
		 * to solve ambiguity can add type and index in constructor-args in xml file
		 */
//		Addition add = (Addition) context.getBean("add");
//		
//		add.doSum();
		
		/**
		 * calling life cycle methods using XML
		 */

		Pepsi pep1 = (Pepsi) context.getBean("pep");
		System.out.println(pep1);
		
		/**
		 * calling life cycle methods using Interface
		 */

		LifcycleUsingInterface l1 = (LifcycleUsingInterface) context.getBean("l1");
		System.out.println(l1);
		
		/**
		 * calling life cycle methods using Annotation
		 */

		LifecycleUsingAnno anno = (LifecycleUsingAnno) context.getBean("anno");
		System.out.println(anno);

	}

}
