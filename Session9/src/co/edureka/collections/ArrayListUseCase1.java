package co.edureka.collections;

import java.util.ArrayList;

import co.edureka.model.Customer;
import co.edureka.persistance.FileIOOperations;

public class ArrayListUseCase1 {

	public static void main(String[] args) {
		
		FileIOOperations fileIo = new FileIOOperations();
		ArrayList<String> lines = fileIo.readTextFromFile();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		System.out.println();
		System.out.println("Iterating in ArrayList");
		
		for(String line: lines) {
			//System.out.println(line);
			String[] data = line.split(",");
			Customer customer = new Customer(data[0], data[1], Double.parseDouble(data[2]), data[3], data[4]);
			customers.add(customer);
		}
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Customer customer : customers) {
			System.out.println(customer.name+"\t"+customer.entryDateTimeStamp);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
