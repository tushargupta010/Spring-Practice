package com.tushar.springcore.constructorinjection;

public class Person {
	
	private String name;
	private int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	

}
