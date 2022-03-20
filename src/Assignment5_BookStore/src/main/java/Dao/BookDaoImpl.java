package Dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImpl implements BookDao {

	public List<String> getBooks() {
		// TODO Auto-generated method stub
		System.out.println("i am Called");
		return Arrays.asList("java adv","java basics","rich dad poor dad");
	}

	
}
