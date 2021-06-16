package com.spring.autowiring;

public class Labor {

	private int id;
	private String name;
	private Work work,work1;
	
	
	
	public Work getWork1() {
		return work1;
	}



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



	public void setWork(Work work) {
		this.work = work;
	}



	public Labor() {
		// TODO Auto-generated constructor stub
	}



	public Labor(Work work) {
		super();
		System.out.println("Construct work object");
		this.work = work;
	}



	public Labor(Work work, Work work1) {
		super();
		this.work = work;
		this.work1 = work1;
	}
	
	

}
