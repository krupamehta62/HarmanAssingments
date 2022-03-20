package com.owner.model.dao;

public class Book {
	
	int id;
	String bookname;
	String author;
	int price;
	
	public Book(String bookname,String author, int price) {
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	public Book(int id, String bookname, String author, int price) {
		
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	
	public Book() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}
	

}
