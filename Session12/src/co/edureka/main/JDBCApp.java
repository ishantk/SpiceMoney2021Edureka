package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.DB;
import co.edureka.model.Customer;

public class JDBCApp {

	public static void main(String[] args) {
		
		//Customer customer = new Customer(0, "dave", "+91 90909 10101", 99.9f);
		//Customer customer = new Customer(true);
		//Customer customer = new Customer(4);
		
		DB db = new DB();
		db.createConnection();
		//db.insertCustomer(customer);
		//db.updateCustomer(customer);
		//db.deleteCustomer(4);
		ArrayList<Customer> customers = db.fetchCustomers();
		
		for(Customer customer: customers) {
			System.out.println(customer);
		}
		
		db.closeConnection();
		

	}

}
