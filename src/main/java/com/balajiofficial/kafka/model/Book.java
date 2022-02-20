package com.balajiofficial.kafka.model;

public class Book {
	private String bookName;
	private String isbn;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(String bookName, String isbn) {
		super();
		this.bookName = bookName;
		this.isbn = isbn;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", isbn=" + isbn + ", getBookName()=" + getBookName() + ", getIsbn()="
				+ getIsbn() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+"]";
	}
	
	
}
