package Service;

import java.util.List;
import java.util.stream.Collectors;

import Dao.BookDao;

public class BookServiceImpl implements BookService {

	
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	public List<String> getBooks(String subject) {
		// TODO Auto-generated method stub
		return bookDao.getBooks().stream().filter
				(title -> title.contains(subject)).collect(Collectors.toList());
	}

}
