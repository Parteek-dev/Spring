package com.spring.mvc.orm.userdao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.orm.entities.User;

@Repository
public class UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		Integer id = (Integer)	hibernateTemplate.save(user);
		return id;
	}
	
}
