
package assignment2.BookStoreSystem;

class BookStore  {
private Book[] b;

public BookStore() {
	this.b= new Book[10];
	init();
}

private void init() {
	 b[0]=new Book("The Alchemist","Paulo Cabelo",6785,30);
	 b[1]=new Book("Celestial Bodies","Jokha Alharthi",982,20);
	 b[2]=new Book("The Overstory","Richard Powers",6722,10);
	 b[3]=new Book("It’s a Wonderful Life","Ruskin Bond",8885,6);
	 b[4]=new Book("The Great Big Lion","Chryseis Knight",2385,8);
	 b[5]=new Book("The India Story","Bimal Jalan",5685,9);
	 b[6]=new Book("In An Ideal World","Kunal Basu",8985,12);
	 b[7]=new Book("Back to the Roots","Tamannaah Bhatia",7785,15);
	 b[8]=new Book("The Thin Mind Map","Dharmendra Rai",4535,2);
	 b[9]=new Book("Legacy of Learning","Savita Chhabra",6435,3);
}

public void sell(String bookTitle, int noOfCopies) {
int c=0;
	for(int i=0;i<10; i++) {
		if(	b[i].getTitle().equals(bookTitle)) {
			if(b[i].getNoOfCopies()>=noOfCopies) {
			b[i].setNoOfCopies(b[i].getNoOfCopies()-noOfCopies);
			c=1;
		}
	
	if(c==1)
		System.out.println("Book sold");
	
	else 
		System.out.println("Book is not available");
	

}
	}
}


public void order(String bookTitle, int noOfCopies) {
	boolean available=false;
	for(int i=0;i<10; i++) {
		if(	b[i].getTitle().equals(bookTitle)) {
		
			b[i].setNoOfCopies(b[i].getNoOfCopies()+noOfCopies);
			available=true;
			
		}
	}
	if(available==true)
		System.out.println("Order Placed");
	else
		System.out.println("Order cannot be palced");
}


public void display() {
for(Book books:b) {
	books.Display();
 }
}
}



