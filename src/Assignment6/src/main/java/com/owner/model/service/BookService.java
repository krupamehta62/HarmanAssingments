package com.owner.model.service;

import java.util.List;

import com.owner.model.dao.Book;

public interface BookService {

	public List<Book> getAll();
	public void addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, Book book);
	public Book findById(int id);
}
