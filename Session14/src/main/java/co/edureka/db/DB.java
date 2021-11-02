package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.User;


/*
 	JDBC Procedure
 	--------------
 	
 	1. Link the Driver
 	   1.1 Download the driver which will be a jar file (jar file is collection of .class files)
 	   	   Reference Link: https://dev.mysql.com/downloads/connector/j/
 	   1.2 Link the Jar with Your Java Project
 	   1.3 Use the API Class.forname to load the driver class from the jar file
 	   
 	2. Create the Connection with DB
 	   2.1 URL for the DB
 	   2.2 Username and Password
 	   2.3 Use the API Connection and DriverManager to obtain Connection
 	   
 	3. Write and Execute the SQL Statement
 	   3.1 wirte SQL statement to be executed as a String
 	   2.3 Use the API Statement or PreparedStatement to execute SQL Query
 	   
 	4. Close the Connection
 	   4.1 Execute the close method on Connection
 */

public class DB {
	
	Connection connection;
	PreparedStatement preparedStatement;
	
	// 1. Link the Driver
	public DB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	// 2. Create the Connection with DB
	public void createConnection() {
		try {
			
			String url = "jdbc:mysql://localhost/mydb";
			String user = "root";
			String password = "auribises";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Created");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	// 3. Write and Execute the SQL Statement
	public boolean registerUser(User user) {
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.name);
			preparedStatement.setString(2, user.email);
			preparedStatement.setString(3, user.password);
			
			i = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return (i>0);
		
	}
	
	public boolean loginUser(User user) {
		
		boolean loginStatus = false;
		
		try {
			
			String sql = "select * from User where email = ? and password = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.email);
			preparedStatement.setString(2, user.password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			loginStatus = resultSet.next();
			
			if(loginStatus) {
				user.uid = resultSet.getInt(1);
				user.name = resultSet.getString(2);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return loginStatus;
		
	}	
	
	// 4. Close the Connection
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("4. Connection Closed");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	

}
