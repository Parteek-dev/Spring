package com.spring.autowiring;

public class Work {

	private String workName;
	
	
	
	protected String testWork() {
		return "work already started..";
	}
	
	@Override
	public String toString() {
		return "Work [workName=" + workName + "]";
	}



	public String getWorkName() {
		return workName;
	}



	public void setWorkName(String workName) {
		System.out.println("Setting work name");
		this.workName = workName;
	}



	public Work() {
		// TODO Auto-generated constructor stub
	}

}
