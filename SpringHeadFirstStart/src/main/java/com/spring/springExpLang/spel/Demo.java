package com.spring.springExpLang.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	//this is a spring EL  
	@Value("#{2+6}")
	private int x;
	@Value("#{55>10?1:0}")
	private int y;
	
	@Value("#{1>0}")
	private boolean isActive;
	
	@Value("#{new String('Sethi Saab')}")
	private String name;
	
	@Value("#{T(java.lang.Math).PI}")
	private double valueOfPI;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double sqrt;
	
	//used user defined classes 	
	@Value("#{T(com.spring.springExpLang.spel.TestSpEL).val}")
	private int z;
	
	@Value("#{T(com.spring.springExpLang.spel.TestSpEL).test()}")
	private String nameCheck;
	
	
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String getNameCheck() {
		return nameCheck;
	}

	public void setNameCheck(String nameCheck) {
		this.nameCheck = nameCheck;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValueOfPI() {
		return valueOfPI;
	}

	public void setValueOfPI(double valueOfPI) {
		this.valueOfPI = valueOfPI;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", isActive=" + isActive + ", name=" + name + ", valueOfPI=" + valueOfPI
				+ ", sqrt=" + sqrt + ", z=" + z + ", nameCheck=" + nameCheck + "]";
	}
	
	

}
