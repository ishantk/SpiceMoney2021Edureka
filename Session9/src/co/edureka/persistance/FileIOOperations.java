package co.edureka.persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileIOOperations {
	
	// FileWriter Class
	public void writeTextInFile(String data) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/customers-25-oct-2021.csv");
			//FileWriter writer = new FileWriter(file);		// append mode disabled
			FileWriter writer = new FileWriter(file, true); // append mode enabled
			writer.write(data);
			writer.close(); // close the stream to release the memory resources
			System.out.println("Data Writter in File :)");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}
	
	// FileReader Class
	public ArrayList<String> readTextFromFile() {
		
		ArrayList<String> lines = new ArrayList<String>();
		
		try {
			File file = new File("/Users/ishantkumar/Downloads/customers-25-oct-2021.csv");
			FileReader reader = new FileReader(file);			// Read char by char
			BufferedReader buffer = new BufferedReader(reader); // Read Line by Line
			
			String line = "";
			
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
				lines.add(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return lines;
		
	}
	
	
	// FileOutputStream Class
	public void writeBinaryInFile(String data) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/my-customers-25-oct-2021.csv");
			//FileOutputStream stream = new FileOutputStream(file); 		// append mode disabled
			FileOutputStream stream = new FileOutputStream(file, true); 	// append mode enabled
			stream.write(data.getBytes()); // writing the data as bytes :)
			stream.close(); // close the stream to release the memory resources
			System.out.println("Data Writter in File :)");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}
	
	// FileInputStream Class
	public void readBinaryFromFile() {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/my-customers-25-oct-2021.csv");
			
			FileInputStream stream = new FileInputStream(file);
			// Task: Explore how to read line by line with binary streams
			
			int ch = 0;
			while((ch = stream.read()) != -1) {
				System.out.print((char)ch);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}

}
