package Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import Dao.BookDao;
@ExtendWith(MockitoExtension.class)
class BookServiceImplTestWithMockito {


	@Mock
	private BookDao bookDao;
	
	@InjectMocks
	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		List<String> books=Arrays.asList("java adv","java basics","rich dad poor dad");
		when(bookDao.getBooks()).thenReturn(books);
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
