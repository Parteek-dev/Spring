package com.spring.certificate;

import java.util.List;

public class Certificate {

	private String name;
	private List<String> authBy;
	
	public Certificate(String name, List<String> authBy) {
		super();
		this.name = name;
		this.authBy = authBy;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + ", authBy=" + authBy + "]";
	}
	
	

}
