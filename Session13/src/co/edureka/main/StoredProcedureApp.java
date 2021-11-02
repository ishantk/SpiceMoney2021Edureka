package co.edureka.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class StoredProcedureApp {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "auribises");
			String sql = "{call insertEmployee(?, ?)}";
			CallableStatement statement = connection.prepareCall(sql);
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Employee Name: ");
			String name = scanner.nextLine();
			System.out.println("Enter Employee Salary: ");
			int salary = scanner.nextInt();
			scanner.close();
			
			
			statement.setString(1, name);
			statement.setInt(2, salary);
			
			statement.execute();
			
			System.out.println("Procedure Executed");
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		

	}

}
