package com.tushar.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	// constructor injection
	@Autowired
	public Student(@Qualifier("book111")Book book) {
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
