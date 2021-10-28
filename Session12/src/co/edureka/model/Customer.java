package co.edureka.model;

import java.util.Scanner;

/*
 	
 	ORM : Object Relational Mapping
 	
 	// structure of object
 	class Customer {
		int cid;
		String name;
		String phone;
		float temperature;
	}
	
	Customer customer = new Customer(1, "john", "+91 99999 11111", 98.4);
	
	SQL
	create table Customer(
		cid int primary key auto_increment,
		name varchar(256),
		phone varchar(20),
		temperature float
	);
	
	insert into Customer values(1, 'john', '+91 99999 11111', 98.4);
	
	update Customer set name='john watson', temperature=99.1 where cid = 1
	
	delete Customer where cid = 1
	
	select * from Customer
	select * from Customer where cid = 1
	select name, temperature from Customer
	select name, temperature from Customer where cid = 1211
	select name, temperature from Customer where phone = '+91 99999 11111'
 	
 */

public class Customer {
	
	public int cid;
	public String name;
	public String phone;
	public float temperature;
	
	public Customer() {
		
	}
	
	public Customer(boolean input) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		name = scanner.nextLine();
		System.out.println("Enter Customer Phone: ");
		phone = scanner.nextLine();
		System.out.println("Enter Customer Temperature: ");
		temperature = scanner.nextFloat();
		scanner.close();
		
	}
	
	public Customer(int cid) {
		
		this.cid = cid;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		name = scanner.nextLine();
		System.out.println("Enter Customer Phone: ");
		phone = scanner.nextLine();
		System.out.println("Enter Customer Temperature: ");
		temperature = scanner.nextFloat();
		scanner.close();
		
	}
	
	public Customer(int cid, String name, String phone, float temperature) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", temperature=" + temperature + "]";
	}

}
