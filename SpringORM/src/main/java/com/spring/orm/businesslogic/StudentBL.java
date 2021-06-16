package com.spring.orm.businesslogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class StudentBL {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Student> studentList = null;
	static int studentId = 0; 
	static int noOfStu = 0;

	public static void studentEntry( StudentDao  stuDao) throws NumberFormatException, IOException {
		System.out.println("How many students do want to add");
		noOfStu = Integer.parseInt(br.readLine());
		studentList = new ArrayList<>(noOfStu);

		for(int i=1;i<=noOfStu;i++) {

			System.out.println("Enter the students details. Entry -" + i);

			System.out.println("Enter the student ID");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter the student NAME");
			String name = br.readLine();
			System.out.println("Enter the student ADDRESS");
			String address = br.readLine();

			Student s = new Student(id, name, address);
			studentList.add(s);
			stuDao.insert(s);
			System.out.println("--------------------------");
		}

		System.out.println("Below are the students details has been stored.");
		System.out.println(studentList);
		studentList.clear();	
		System.out.println("________________________");
	}

	public static void studentUpdate(StudentDao  stuDao) throws NumberFormatException, IOException {
		System.out.println("How many students do want to update");
		noOfStu = Integer.parseInt(br.readLine());
		studentList = new ArrayList<>(noOfStu);

		for(int i=1;i<=noOfStu;i++) {
			System.out.println("Enter the students IDs.");
			System.out.println("-------ENTRY "+i+"-------------");

			System.out.println("Enter the student ID");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter the student NAME");
			String name = br.readLine();

			System.out.println("Enter the student ADDRESS");
			String address = br.readLine();

			Student s1 = new Student(id, name, address);

			stuDao.update(s1);
			studentList.add(s1);
			System.out.println("--------------------------");
		}

		System.out.println("Below are the students details has been updated.");
		System.out.println(studentList);
		studentList.clear();
		System.out.println("________________________");
	}

	public static void printOneStudent(StudentDao stuDao) throws NumberFormatException, IOException {

		System.out.println("Enter the student ID");
		studentId = Integer.parseInt(br.readLine());

		Student s= stuDao.get(studentId);

		System.out.println("--------------------------");
		System.out.println("ID: "+s.getStudentId());
		System.out.println("NAME: "+s.getStudentName());
		System.out.println("ADDRESS: "+s.getStudentAddress());
		System.out.println("________________________");
	}

	public static void printAll(StudentDao stuDao) {
		System.out.println("Please see below list of student details.\n");
		List<Student> al =  stuDao.getAll();

		for(Student s: al) {
			System.out.println("--------------------------");
			System.out.println("ID: "+s.getStudentId());
			System.out.println("NAME: "+s.getStudentName());
			System.out.println("ADDRESS: "+s.getStudentAddress());
		}
		System.out.println("________________________");
	}

	public static void deleteOneStudent(StudentDao stuDao) throws NumberFormatException, IOException {
		System.out.println("Enter the student ID");

		studentId = Integer.parseInt(br.readLine());

		System.out.println("Student deleted..\n"+stuDao.get(studentId));
		stuDao.delete(studentId);
		System.out.println("________________________");
	}

	public static String printApplicationDetails() throws IOException {

		System.out.println("PRESS 1 for add new students");
		System.out.println("PRESS 2 for display all students");
		System.out.println("PRESS 3 for get details of single students");
		System.out.println("PRESS 4 for delete students");
		System.out.println("PRESS 5 for update students");
		System.out.println("PRESS 6 for exit");

		return br.readLine();

	} 
}