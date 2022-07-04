package com.tushar.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class IceCream implements InitializingBean, DisposableBean {
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public IceCream() {
		super();
	}
	@Override
	public String toString() {
		return "IceCream [price=" + price + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("IceCream is already created now in the init method we buy it from the shop");
	}
	@Override
	public void destroy() throws Exception {
		// destroy method
		System.out.println("IceCream pack going to be disposed now after shutdownhook.");
	}
}
