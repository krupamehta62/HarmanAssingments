package com.owner.model.service;

import java.util.List;

import com.owner.model.dao.Book;
import com.owner.model.dao.BookDao;
import com.owner.model.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao=new BookDaoImpl();
	}
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookDao.getAll();
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.addBook(book);
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookDao.deleteBook(id);
	}

	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		bookDao.updateBook(id, book);
	}

	public Book findById(int id) {
		// TODO Auto-generated method stub
		return bookDao.findById(id);

	}

	

}
