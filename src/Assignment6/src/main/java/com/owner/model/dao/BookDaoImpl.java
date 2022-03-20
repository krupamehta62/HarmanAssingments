package com.owner.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;
import com.owner.factory.ConnectionFactory;
import com.owner.model.exception.BookNotFoundException;

public class BookDaoImpl implements BookDao{

	private Connection connection;
	public BookDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	public List<Book> getAll() {
		// TODO Auto-generated method stub
		Book tempbook = null;
		List<Book> b = new ArrayList<Book>();
		try {
			java.sql.Statement stmt = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from book");

			while (rs.next()) {
				tempbook = new Book (rs.getInt("id"), rs.getString("bookname"), rs.getString("author"), rs.getInt("price"));
				b.add(tempbook);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("insert into book(bookname, author, price) values(?,?,?)");
			stmt.setString(1, book.getBookname());
			stmt.setString(2, book.getAuthor());
			stmt.setInt(3, book.getPrice());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("delete from book where id=?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("update book set price = ? where id=?");
			stmt.setInt(1, book.getPrice());
			stmt.setInt(2, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Book findById(int id) {
		// TODO Auto-generated method stub
		Book tempbook = null;
		try {
			PreparedStatement stmt = 
					connection.prepareStatement("select * from book where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				tempbook = 
						new Book(rs.getInt("id"), rs.getString("bookname"), rs.getString("author"), rs.getInt("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(tempbook==null)
			throw new BookNotFoundException("book with id "+ id +" is not found");
		return tempbook;
	}

	
	}

	

