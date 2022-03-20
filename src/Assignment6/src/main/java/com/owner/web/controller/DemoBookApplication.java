package com.owner.web.controller;

import java.util.List;

import com.owner.model.dao.Book;
import com.owner.model.service.BookService;
import com.owner.model.service.BookServiceImpl;

public class DemoBookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService bookService=new BookServiceImpl();
		List<Book>books=bookService.getAll();
	System.out.println("......All Books......");
	for(Book book: books)
		System.out.println(book);
	//Book book=bookService.findById(102);
	//System.out.println(book);
		
		Book book1=new Book("zxc", "qwe", 2300);
		//bookService.addBook(book1);
		
		//bookService.updateBook(3, book1);
	}

}
