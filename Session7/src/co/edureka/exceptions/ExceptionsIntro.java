package co.edureka.exceptions;

import java.util.Scanner;

public class ExceptionsIntro {

	public static void main(String[] args) {
		
		boolean debugMode = false;
		
		System.out.println("App Started");
		
		int[] cashBacks = {10, 45, 67, 88, 12, 33, 90, 100, 75, 80};
		int luckyNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Lucky Number [0-9]: ");
		luckyNumber = scanner.nextInt();
		
		try {
			// statements generating errors at run time can be placed in try block
			int cashBack = cashBacks[luckyNumber];
			int additionalCashBack = cashBack / luckyNumber;
			System.out.println("You won a CashBack of \u20b9"+cashBack);
			System.out.println("You won an Additional CashBack of \u20b9"+additionalCashBack);
		}/*catch(ArrayIndexOutOfBoundsException ref) {
			
			if(debugMode) {
				//System.out.println(ref);
				ref.printStackTrace();
			}else {
				System.out.println("Something Went Wrong. Please Enter Correct Lucky Number");	
			}
		}*//*catch(ArithmeticException ref) {
			System.out.println("Something Went Wrong");
			System.out.println(ref);
		}*/
		catch(Exception e) { // e is reference variable of the Parent class Exception. As per RTP, Parent ref can refer to the Child Object
			System.out.println("Something Went Wrong");
			System.out.println("Exception is: "+e);
		}
		finally { // piece of block which will execute for Sure
			System.out.println("Execute something important");
			scanner.close(); 
		}
		
		System.out.println("App Finished");
		

	}

}

/*
  	try{
  	
  	} error
  	
  	
  	try{
  	
  	}catch(){
  	
  	}
  	
  	
  	try{
  	
  	}finally{
  	
  	}
  	
  	try{
  	
  	}catch(){
  	
  	}finally{
  	
  	}
  	
  	try{
	  	try{
	  	
	  	}catch(){
	  	
	  	}finally{
	  	
	  	}
  	}catch(){
  		try{
  	
	  	}catch(){
	  	
	  	}finally{
	  	
	  	}
  	}finally{
  		try{
  	
	  	}catch(){
	  	
	  	}finally{
	  	
	  	}
  	}
 */
