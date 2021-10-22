
public class Overloading {
	
	static void add(long num1, long num2) {
		long sum = num1 + num2;
		System.out.println("[long] Sum of 2 numbers is: "+sum);
	}

	
	
	// error: we cannot have the variable names different for overloading
	/*static void add(int n1, int n2) {
		int sum = n2 + n2;
		System.out.println("Sum of 2 numbers is: "+sum);
	}*/
	
	// error: return type has no role to play for overloading
	/*static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}*/
	
	// Method Overloading -> Method Name is same
	// But Input list is different and unique
	static void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of 3 numbers is: "+sum);
	}
	
	static void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum of 2 double numbers is: "+sum);
	}
	
	static void login(String email, String password) {
		System.out.println("Login with Email and Password");
	}
	
	static void login(String phone, int otp) {
		System.out.println("Login with Phone and OTP");
	}
	
	static void login(String facebookID) {
		System.out.println("Login with Facebook");
	}
	
	public static void main(String[] args) {
		
		add(10, 20);
		add(100000000l, 20000000l);
		add(10, 20, 30);
		add(10.3, 20.22);
		
		login("john@example.com", "john123");
		login("+91 99999 11111", 3027);
		login("john.watson");

	}
	
	static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("[int] Sum of 2 numbers is: "+sum);
	}

}
