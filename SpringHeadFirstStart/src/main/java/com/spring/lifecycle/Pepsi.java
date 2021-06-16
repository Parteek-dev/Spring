package com.spring.lifecycle;

public class Pepsi {
	
	private int size;
	private long price;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		System.out.println("---------PEPSI--------\nSetting properties");
		this.size = size;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pepsi [size=" + size + ", price=" + price + "]";
	}
	
	@SuppressWarnings("unused")
	private void init() {
		System.out.println("Starting.. init");
	}
	
	@SuppressWarnings("unused")
	private void destroy() {
		System.out.println("ending.. destroy");
	}

}
