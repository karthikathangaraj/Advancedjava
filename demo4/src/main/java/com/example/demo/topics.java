package com.example.demo;

public class topics {
	
	private String book;
	private int bookid;
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public topics(String book, int bookid) {
		super();
		this.book = book;
		this.bookid = bookid;
	}
	public topics() {
		
	}

}
