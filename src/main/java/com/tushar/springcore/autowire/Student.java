package com.tushar.springcore.autowire;

public class Student {
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Student(Book book) {
		super();
		this.book = book;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [book=" + book + "]";
	}	
}
