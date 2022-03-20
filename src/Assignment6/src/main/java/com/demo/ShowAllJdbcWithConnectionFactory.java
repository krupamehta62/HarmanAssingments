package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.owner.factory.ConnectionFactory;

public class ShowAllJdbcWithConnectionFactory {
	
	
	public static void main(String[] args) {
		
		Statement stmt=null;
		ResultSet rs=null;
		Connection connection=null;
		
		try {
			 connection=ConnectionFactory.getConnection();
			
			stmt=connection.createStatement();
			rs=stmt.executeQuery("select * from book");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("bookname"));
				System.out.println(rs.getString("author"));
				System.out.println(rs.getInt("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

