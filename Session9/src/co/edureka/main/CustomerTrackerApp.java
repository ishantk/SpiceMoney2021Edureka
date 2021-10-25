package co.edureka.main;

import java.util.Date;
import java.util.Scanner;

import co.edureka.model.Customer;
import co.edureka.persistance.FileIOOperations;

public class CustomerTrackerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Customer Tracker App");
		
		Scanner scanner = new Scanner(System.in);
		FileIOOperations fileIO = new FileIOOperations();
		//fileIO.writeBinaryInFile("Name,Phone,Temperature,Entry,Exit\n");
		
		// We are Checking in the Customer into a mall/store
		//Date date = new Date();
		//Customer customer = new Customer("John", "+91 99999 11111", 98.4, date.toString(), "NA");
		//System.out.println(customer.toCSV());
		
		//fileIO.readTextFromFile();
		fileIO.readBinaryFromFile();
		
		
		/*while(true) {
			
			Customer customer = new Customer();
			System.out.println(customer.toCSV());
			System.out.println("~~~~~~~~~~~~~~~~");
			//fileIO.writeTextInFile(customer.toCSV());
			fileIO.writeBinaryInFile(customer.toCSV());
			
			
			System.out.println("Enter quit to exit or anything to resume");
			String choice = scanner.nextLine();
			if(choice.equals("quit")) {
				break;
			}
			
		}*/

		
		scanner.close();
		System.out.println("Thank you for using Customer Tracker App");
		
		// Task: Complete this App to perform Exits for the Customers
		//		 Compute how much time did the customer was inside the mall also save that detail in another file may be:)
	}

}
