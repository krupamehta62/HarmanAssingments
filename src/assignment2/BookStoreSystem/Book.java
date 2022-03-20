package assignment2.BookStoreSystem;

class Book {
private String title;
private String author;
private int isbn;
protected int NoOfCopies;

	public Book(String author,String title,int isbn,int NoOfCopies) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.NoOfCopies=NoOfCopies;
	}

	public int getNoOfCopies() {
		return NoOfCopies;
	}

	public void setNoOfCopies(int NoOfCopies) {
		this.NoOfCopies = NoOfCopies;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
	public void Display() {
		System.out.println("Book Info: ");
		System.out.println("1)Tittle:"+ title);
		System.out.println("2) Author:"+ author);
		System.out.println("3) ISBN:"+ isbn);
		System.out.println("4) No of copies:"+ NoOfCopies);
	}

	
    
}
