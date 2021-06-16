package com.spring.orm;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.businesslogic.StudentBL;
import com.spring.orm.dao.StudentDao;

public class RunApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");

		StudentDao stuDao = ac.getBean("studentDao", StudentDao.class);

		System.out.println("\n\n\n\n\n\n*******WELCOME TO APPLICATION*******");

		boolean status = true;
		while(status) {

			try {

				String input = StudentBL.printApplicationDetails();

				switch(input) {
				
				case "1" :					
					StudentBL.studentEntry(stuDao);					 
					break;
					
				case "2" :				
					StudentBL.printAll(stuDao);
					break;

				case "3" :
					StudentBL.printOneStudent(stuDao);
					break;

				case "4" :
					StudentBL.deleteOneStudent(stuDao);
					break;

				case "5" :					
					StudentBL.studentUpdate(stuDao);
					break;

				case "6" :
					status = false;
					break;

				default:
					System.out.println("Please enter a valid input.. \n");
					break;

				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("\nTHANK YOU!! FOR USING THIS APPLICATION");


	}

}
