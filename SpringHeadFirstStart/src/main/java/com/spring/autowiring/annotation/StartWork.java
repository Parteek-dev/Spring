package com.spring.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWork {

	public StartWork() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/annotation/autowire-config.xml");
		Labor l = context.getBean("labor", Labor.class);
		
		System.out.println(l.getWork().testWork());
		System.out.println(l);
	}

}
