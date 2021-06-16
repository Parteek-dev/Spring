package com.spring.mvc.orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.orm.entities.User;
import com.spring.mvc.orm.userdao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	
	public int insertUser(User user) {
		return userDao.saveUser(user);
	}

}
