package assignment2.BookStoreSystem;

public class BookStoreApp {
	
public static void main(String args[]) {
	
	BookStore bookStore=new BookStore();
	System.out.println("Welcome to BOOK STORE APP");
	bookStore.sell("The Alchemist", 2);
	bookStore.order("The India Story",9);
	bookStore.display();
}
}
