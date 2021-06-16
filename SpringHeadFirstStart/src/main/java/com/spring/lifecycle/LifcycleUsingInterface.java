package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifcycleUsingInterface implements InitializingBean,DisposableBean {

	private int size;
	private long price;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		System.out.println("---------LifcycleUsingInterface--------\nSetting properties");
		this.size = size;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public LifcycleUsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LifcycleUsingInterface [size=" + size + ", price=" + price + "]";
	}
	
	@Override
	public void destroy() throws Exception {
		
		System.out.println("LifcycleUsingInterface --> ending.. destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("LifcycleUsingInterface --> Starting.. init");
		
	}

}
