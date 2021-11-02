package co.edureka.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchTransactionApp {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "auribises");
			
			statement = connection.createStatement();
			
			String sql1 = "insert into Employee values(null, 'Kim', 50000)";
			String sql2 = "delete from Employee where email = '1'";
			
			connection.setAutoCommit(false); // As a developer i will manage the transaction
			
			statement.addBatch(sql1);
			statement.addBatch(sql2);
			
			statement.executeBatch();
			connection.commit();// execute the batch as a transaction
			
			
			connection.close();
			System.out.println("Batch Executed");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			try {
				System.out.println("Rolling Back Due to Exception");
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}

	}

}
