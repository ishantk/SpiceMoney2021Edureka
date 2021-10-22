package co.edureka.exceptions;

import java.io.IOException;

// User Defined UnChecked Exception
class MyException extends RuntimeException{ 
	MyException(String message){
		super(message);
	}
}

//User Defined Checked Exception
class YourException extends Exception{ 
	YourException(String message){
		super(message);
	}
}

class BankAccount{
	
	String name;
	int balance;
	
	BankAccount(String name){
		this.name = name;
		balance = 10000;
		System.out.println("Bank Account Created for "+name);
	}
	
	void withdraw(int amount) throws IOException, YourException{
		balance -= amount;
		
		if(balance < 0) {
			// Throwing an UnChecked Exception
			//ArithmeticException ref = new ArithmeticException("Negative Balance");
			
			// Throwing a Checked Exception
			//IOException ref = new IOException("Negative Balance");
			
			//MyException ref = new MyException("Negative Balance");
			YourException ref = new YourException("Negative Balance");
			throw ref;
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[Withdraw] For "+name);
		System.out.println("[Withdraw] Successful for amount "+amount);
		System.out.println("[Withdraw] New Balance is: "+balance);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		System.out.println("Banking Started");
		
		BankAccount account1 = new BankAccount("John");
		BankAccount account2 = new BankAccount("Fionna");
		
		//account1.withdraw(3000);
		
		try {
			for(int i=1;i<=100;i++) {
				account2.withdraw(3000);
			}
		}catch(Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		System.out.println("Banking Finished");

	}

}
