package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Customer;

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
	Statement statement;
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
	public void insertCustomer(Customer customer) {
		
		try {
			
			//String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', "+customer.temperature+")";
			//statement = connection.createStatement();
			//int i = statement.executeUpdate(sql); //executeUpdate -> insert, update and delete SQL Commands
			
			
			String sql = "insert into Customer values(null, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setFloat(3, customer.temperature);
			
			int i = preparedStatement.executeUpdate();
			
			if(i>0) {
				System.out.println("3. Customer "+customer.name+" Added in Table");
			}else {
				System.out.println("3. Customer Not Added in Table");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public void updateCustomer(Customer customer) {
		
		try {
			
			String sql = "update Customer set name = ?, phone = ?, temperature = ? where cid = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setFloat(3, customer.temperature);
			preparedStatement.setInt(4, customer.cid);
			
			int i = preparedStatement.executeUpdate();
			
			if(i>0) {
				System.out.println("3. Customer "+customer.name+" Updated in Table");
			}else {
				System.out.println("3. Customer Not Updated in Table");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public void deleteCustomer(int cid) {
		
		try {
			
			String sql = "delete from Customer where cid = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, cid);
			
			int i = preparedStatement.executeUpdate();
			
			if(i>0) {
				System.out.println("3. Customer with ID "+cid+" Deleted from Table");
			}else {
				System.out.println("3. Customer Not Deleted from Table");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public ArrayList<Customer> fetchCustomers() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			String sql = "select * from Customer";
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				/*Customer cRef = new Customer();
				
				cRef.cid = resultSet.getInt(1);
				cRef.name = resultSet.getString(2);
				cRef.phone = resultSet.getString(3);
				cRef.temperature = resultSet.getFloat(4);
				
				System.out.println(cRef);*/
				
				customers.add(new Customer(resultSet.getInt(1), 
						 resultSet.getString(2), 
						 resultSet.getString(3), 
						 resultSet.getFloat(4))
						);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return customers;
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
