
public class PrimitiveTypes {

	// containers which we create inside the main
	// belongs to the main
	public static void main(String[] args) {
		
		// Creating a single value container 
		// which can store only integers
		// byte will create a storage container with size as 8 bits i.e. 1byte
		// 2 power 8 -> 256
		// 256/2 -> -128 0 to 127
		byte age = 20;
		// byte is type 
		// age is name of the container in the memory
		// 20 is the data stored in the container and is known as literal i.e. value
		
		// update the value in age
		age = 22;
		// age = 128; // error :) | out of range
		
		System.out.println("Age is: "+age);
		
		short s = 100;			// 16 bits
		int i = 100000;			// 32 bits
		long l = 10000000000L;  // supports the range for long numbers | 64 bits
		
		float tax = 0.18F;      // 32 bits
		double deliveryCharges = 12.25; // 64bits
		
		char ch = 'A';
		ch = 99;
		System.out.println("ch is: "+ch);
		ch = '\u20b9';
		System.out.println("ch now is: "+ch);

		char nameFirstCharacter = '\u0907';
		System.out.println("nameFirstCharacter: "+nameFirstCharacter);
		// try to print all characters for your name in your native language
		// https://unicode-table.com/
		
		boolean isInternetOn = true;
		isInternetOn = false;
	}

}

class Hello{
	
}
