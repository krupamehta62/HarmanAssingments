package assignment4;

import java.util.Comparator;

public class Book {


	private int id;
	private String title;
	private String author;

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static Comparator<Book> bookNameComparator=new Comparator<Book>(){

		public int compare(Book b1, Book b2) {
		   String BookName1 = b1.getTitle().toUpperCase();
		   String BookName2 = b2.getTitle().toUpperCase();

		   return BookName1.compareTo(BookName2);
	  }};

	 public static Comparator<Book> bookAuthorComparator=new Comparator<Book>() {

		 public int compare(Book b1,Book b2) {
		 String BookAuthor1 = b1.getAuthor().toUpperCase();
		 String BookAuthor2 = b2.getAuthor().toUpperCase();

		 return BookAuthor1.compareTo(BookAuthor2);
	 }};

}