package com.spring.collections.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	
	private List<String> qualification;
	private Set<String> address;
	private Map<Integer,String> courses;
	private Properties empProp;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<Integer, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}
	public Properties getEmpProp() {
		return empProp;
	}
	public void setEmpProp(Properties empProp) {
		this.empProp = empProp;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", qualification=" + qualification + ", address=" + address
				+ ", courses=" + courses + ", empProp=" + empProp + "]";
	}
	
	
	
}
