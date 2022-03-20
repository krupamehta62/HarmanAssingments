package demo.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResultSet rs=null;
		Statement smt=null;
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/harman","root","");
			System.out.println("connected");
			smt=connection.createStatement();
			rs=smt.executeQuery("select * from book");
			while(rs.next())
			{
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("bookname"));
				System.out.println(rs.getString("author"));
				System.out.println(rs.getInt("price"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
	}

}
