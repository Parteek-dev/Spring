package com.spring.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAppStreo {

	public TestAppStreo() {
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = 
		new ClassPathXmlApplicationContext("com/spring/streotype/streotype-config.xml");
		
		//use this below line when we are using @Component 
		//Student s = context.getBean("student",Student.class);
		
		//we have define the variable name stu in @Component("stu") in bean class
		Student s = context.getBean("stu",Student.class);
		
		System.out.println(s.id+" - "+s.address+" - "+s.name);
		
		/**
		 * Bean Scope singleton - return same hash-code every time. 
		 * and prototype - return different hash-code every time. 
		 * we are stereotype , so we are using @Scope annotation 
		 * if you are using XML based configuration then you can use
		 *  <bean id="student" class="com.spring.Student" scope="" />
		 */
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(context.getBean("stu",Student.class).hashCode());
		}
		
	}

}
