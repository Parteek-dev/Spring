package com.spring.springExpLang.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelApp {


	public SpelApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] strings) {
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = 
		new ClassPathXmlApplicationContext("com/spring/springExpLang/spel/spel.xml");
		
		
		Demo demo = context.getBean("demo",Demo.class);
		
		System.out.println(demo);
		
	}

}
