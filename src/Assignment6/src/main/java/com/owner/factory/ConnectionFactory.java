package com.owner.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private static Connection connection = null;

	private ConnectionFactory() {
	}

	public static Connection getConnection() {
			
		//read the prop file
		InputStream inputStream=ConnectionFactory.class.getClassLoader()
				.getResourceAsStream("database.properties");
		
		Properties properties=new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url=properties.getProperty("jdbc.url");
		String driver=properties.getProperty("jdbc.driverName");
		String username=properties.getProperty("jdbc.username");
		String password=properties.getProperty("jdbc.password");
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		connection=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
