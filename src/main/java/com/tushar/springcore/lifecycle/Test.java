package com.tushar.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tushar/springcore/lifecycle/config.xml");
		Apple apple = (Apple) context.getBean("apple");
		System.out.println(apple);
		// registering shutdown hook
		context.registerShutdownHook();
	}

}