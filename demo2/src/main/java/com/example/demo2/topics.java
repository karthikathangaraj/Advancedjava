package com.example.demo2;

public class topics {
	
	private String book;
	private Long bookid;
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(long bookid) {
		this.bookid = (long) bookid;
	}
	public topics(String book, long bookid) {
		super();
		this.book = book;
		this.bookid = (long) bookid;
	}
	public topics() {
		
	}

}
