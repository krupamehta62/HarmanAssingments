package com.owner.model.dao;

import java.util.List;

public interface BookDao {
	public List<Book> getAll();
	public void addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, Book book);
	public Book findById(int id);
}


