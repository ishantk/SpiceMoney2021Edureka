public class Methods {

	// Function
	// Inside the class is known as Method :)
	
	// sayHello is a static method
	// void is return type which means return nothing
	static void sayHello() {
		System.out.println("Hello Everyone !!");
		//.....
		//...
	}
	
	// sayBye is a non static method
	void sayBye() {
		System.out.println("Bye Everyone !!");
		//.....
		//...
	}
	
	// Method's last statement must be a return statement
	// and it should return int :)
	static int addNumbers(int num1, int num2) { // method with inputs/arguments :)
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		// Execution/Invocation of the Methods
		// We can execute the methods by its name from the main :)
		
		// Static methods -> can be executed directly if main and methods are in same class
		// Or with Class Name
		sayHello();
		Methods.sayHello();
		
		// Non Static Methods -> we need the object for the class to execute the method
		Methods refVar = new Methods(); // Object Construction Statement
		// refVar will hold the HashCode of the Object :)
		refVar.sayBye(); 
		
		int result = Methods.addNumbers(10, 20);
		System.out.println("result is "+result);
		
		System.out.println("Sum of 11 and 22 is: "+addNumbers(11, 22));

	}

}
