package co.edureka.collections;

import java.io.File;

class FileIOOperations{
	
	
	void writeInFile(String path) {
		
		FileIOHelper helper = new FileIOHelper();
		if(helper.checkFile(path)) {
			System.out.println("Write in File");
		}else {
			System.out.println("Cannot Write in File");
		}
		
	}
	
	
	// Nested Class
	// Inner Class
	// Helper Class -> more readable and maintainable code
	class FileIOHelper{
		
		boolean checkFile(String path) {
			
			boolean isAvailble = false;
			
			try {
				File file = new File(path);
				isAvailble = file.exists();
			} catch (Exception e) {
				System.out.println("Something went wrong: "+e);
			}
			
			return isAvailble;
		}
	}
	
}

public class InnerClasses {

	public static void main(String[] args) {
	
		FileIOOperations operations = new FileIOOperations();
		operations.writeInFile("/Users/ishantkumar/Downloads/customers-25-oct-2021.csv");
		
		FileIOOperations.FileIOHelper helper = operations.new FileIOHelper();
		System.out.println(helper.checkFile("/Users/ishantkumar/Downloads/customers.csv"));

	}

}
