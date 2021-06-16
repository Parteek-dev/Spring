package com.spring.comp;

public class Company {

	private String name;
	private String address;
	private int rank;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void testConnection() {
		System.out.println("Testing.... Connecion OK");
	}
	
	
}
