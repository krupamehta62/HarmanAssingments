package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class BooksCollection {

	private String ownerName;
	private ArrayList<Book> books;

	public BooksCollection(String ownerName) {
		this.ownerName = ownerName;
		this.books=new ArrayList<Book>();
		init();
	}

	private void init() 
	{
		books.add(new Book(1, "java in action", "foo"));
		books.add(new Book(109, "power of mind", "bar"));
		books.add(new Book(19, "Java in depth", "jar"));
	}


	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;

	}


	public boolean hasBook(Book b) 
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getTitle().contains(b.getTitle()) && books.get(i).getAuthor().contains(b.getAuthor())) 
				{
				System.out.println("Owner of Book is "+ownerName+" having book with Id no. - "+b.getId()+",Title : "+b.getTitle()+" and Book Author : "+b.getAuthor());
				return true;			
				}
		}
		return false;  
	}


	public void sort1()
	{		
		 System.out.println("Sorted Book by book Name :");
		   Collections.sort(books, Book.bookNameComparator);

		      for(Book b: books)
				   {
						System.out.println(b.getTitle());
				   }    
	}


	public void sort2()
	{		
		 System.out.println("Sorted Book by Author Name :");
		   Collections.sort(books, Book.bookAuthorComparator);

		      for(Book b: books)
				   {
						System.out.println(b.getAuthor());
				   }    
	}
}