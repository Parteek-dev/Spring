package com.springjdbc.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.entity.Student;
import com.springjdbc.javaconfig.JavaConfig;

public class MainApp {

	public MainApp() {

	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		StudentDaoImpl studentDaoImpl = context.getBean("studentDaoImpl",StudentDaoImpl.class);


		Student s1 = new Student();
		s1.setId(44);
		s1.setName("Pinkal");
		s1.setAddress("GP Noida");

		//INSERT
//		int result = studentDaoImpl.insert(s1);
//
//		System.out.println("Nbr of rows inserted: "+result);
//		System.out.println(s1.getId()+" : "+s1.getName()+" : "+s1.getAddress());

		//UPDATE
//		int result = studentDaoImpl.update(s1);
//
//		System.out.println("Nbr of rows updated: "+result);
//		System.out.println(s1.getId()+" : "+s1.getName()+" : "+s1.getAddress());
		
		//DELETE		
		/*
		 * int result = studentDaoImpl.delete(3);
		 * System.out.println("Nbr of rows deleted: "+result);
		 */ 
		
		//SELECT for one Object
//		 Student stu = studentDaoImpl.selectOne(1);
//		 System.out.println(stu);
		
		//SELECT all students object
		System.out.println(studentDaoImpl.getAll());

	}

}
