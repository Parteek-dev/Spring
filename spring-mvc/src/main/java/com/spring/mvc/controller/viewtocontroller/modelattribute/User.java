package com.spring.mvc.controller.viewtocontroller.modelattribute;

public class User {
	
	private String username;
	private String email;
	private String userpassword;
	private boolean isChecked;
	
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
	public boolean getIsChecked() {
		return isChecked;
	}
	public void setIsChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", userpassword=" + userpassword + ", isChecked="
				+ isChecked + "]";
	}

	
}
