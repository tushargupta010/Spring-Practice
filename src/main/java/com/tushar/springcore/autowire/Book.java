package com.tushar.springcore.autowire;

public class Book {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public Book() { super(); } public Book(String name) { super(); this.name =
	 * name; }
	 */
	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
}
