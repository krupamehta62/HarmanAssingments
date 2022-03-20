package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement smt=null;
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/harman","root","");
			 smt=connection.prepareStatement("insert into book(id,bookname,author,price) values (?,?,?,?)");
			 
			 smt.setInt(1, 103);
			 smt.setString(2, "Physics");
			 smt.setString(3, "meheta");
			 smt.setInt(4, 800);
			 
			 int rowsAffected=smt.executeUpdate();
			 System.out.println(rowsAffected);
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
