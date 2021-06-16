package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleUsingAnno {

	public LifecycleUsingAnno() {
		// TODO Auto-generated constructor stub
	}
	
	private int size;
	private long price;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		System.out.println("---------LifecycleUsingAnno--------\nSetting properties");
		this.size = size;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifecycleUsingAnno [size=" + size + ", price=" + price + "]";
	}
	
	@PostConstruct
	private void hey() {
		System.out.println("Starting.. hey using Anno");
	}
	
	@PreDestroy
	private void bye() {
		System.out.println("ending.. bye using Anno");
	}

}
