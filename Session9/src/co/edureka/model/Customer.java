package co.edureka.model;

import java.util.Date;
import java.util.Scanner;

// User Object Structure
public class Customer {
	
	public String name;
	public String phone;
	public double temperature;
	public String entryDateTimeStamp;
	public String exitDateTimeStamp;
	
	public Customer() {
		System.out.println("[Customer] A new Customer Object Constructed");
		System.out.println("Enter Details for the Customer Entering into Mall");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		this.name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		this.phone = scanner.nextLine();
		
		System.out.println("Enter Customer Temperature: ");
		this.temperature = scanner.nextDouble();
		
		this.entryDateTimeStamp = new Date().toString();
		this.exitDateTimeStamp = "NA";
		
	}
	
	public Customer(String name, String phone, double temperature, String entryDateTimeStamp, String exitDateTimeStamp) {
		System.out.println("[Customer] A new Customer Object Constructed");
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
		this.entryDateTimeStamp = entryDateTimeStamp;
		this.exitDateTimeStamp = exitDateTimeStamp;
	}
	
	public String toCSV() {
		System.out.println("[Customer] Returing CSV Format Data");
		return name+","+phone+","+temperature+","+entryDateTimeStamp+","+exitDateTimeStamp+"\n";
	}
	

}
