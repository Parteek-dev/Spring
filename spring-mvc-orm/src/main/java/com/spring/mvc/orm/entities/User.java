package com.spring.mvc.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	@Column(name = "name" )
	private String username;
	@Column(name = "email" )
	private String email;
	@Column(name = "password")
	private String userpassword;
	
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", userpassword=" + userpassword + "]";
	}

	
}
