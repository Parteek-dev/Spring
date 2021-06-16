package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Labor {

	private int id;
	private String name;
	
	//By Type
	@Autowired
	@Qualifier("work3")
	private Work work;
	@Autowired
	@Qualifier("work2")
	private Work work1;
	
	
	
	public Work getWork1() {
		return work1;
	}


	//By Name
	//@Autowired
	public void setWork1(Work work1) {
		this.work1 = work1;
	}



	@Override
	public String toString() {
		return "Labor [id=" + id + ", name=" + name + ", work=" + work + ", work1=" + work1 + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Work getWork() {
		return work;
	}

	//By Name
	//@Autowired
	public void setWork(Work work) {
		this.work = work;
	}



	public Labor() {
		// TODO Auto-generated constructor stub
	}


	//By Constructor - it will inject only work object
	//@Autowired
	public Labor(Work work) {
		super();
		System.out.println("Construct work object");
		this.work = work;
	}


	//By Constructor - it will inject both work object
	//@Autowired
	public Labor(Work work, Work work1) {
		super();
		this.work = work;
		this.work1 = work1;
	}
	
	

}
