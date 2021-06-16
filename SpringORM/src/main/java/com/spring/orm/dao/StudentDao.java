package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional
	public int insert(Student stu) {
		
		Integer row = (Integer) hibernateTemplate.save(stu);
		return row;
	}
	
	public Student get(int studentId) {
		
		return hibernateTemplate.get(Student.class, studentId);
	}
	
	public List<Student> getAll() {
		return hibernateTemplate.loadAll(Student.class);
		
	}
	
	@Transactional
	public void delete(int studentId) {
		
		hibernateTemplate.delete(hibernateTemplate.get(Student.class, studentId));
	}
	
	@Transactional
	public void update(Student s) {
		hibernateTemplate.update(s);
	}
}
