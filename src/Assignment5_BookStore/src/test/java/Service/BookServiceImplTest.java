package Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Dao.BookDao;
import Dao.BookDaoImpl;

class BookServiceImplTest {

	private BookDao bookDao;
	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		bookDao=new BookDaoImpl();
		bookService=new BookServiceImpl();
		bookService.setBookDao(bookDao);
	}
	
	@Test
	void test_bookserce_return_two_book() {
		Assertions.assertEquals(2, bookService.getBooks("java").size());
	}


	@AfterEach
	void tearDown() throws Exception {
		bookDao=null;
		bookService=null;
	}

}
