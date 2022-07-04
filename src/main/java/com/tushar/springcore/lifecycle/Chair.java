package com.tushar.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chair {
	private int qty;
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Chair() {
		super();
	}
	@Override
	public String toString() {
		return "Chair [qty=" + qty + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside init method of chair");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method of chair");
	}
}
