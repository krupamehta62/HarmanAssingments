package assignment4;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		BooksCollection bc=new BooksCollection("Pragati Book Centre");
		Book b=new Book(109, "power of mind", "bar");
		System.out.println("Book already exist :"+bc.hasBook(b));
		bc.toString();
		System.out.println("\n");

		bc.sort1();
		System.out.println("\n");
		bc.sort2();



	}

}