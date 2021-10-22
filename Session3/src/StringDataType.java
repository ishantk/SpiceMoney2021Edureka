
public class StringDataType {

	public static void main(String[] args) {
		
		// Interned String -> Directly allocate the literal 
		String s1 = "Hello";
		String s2 = "Hello";
		
		// Object Strings -> We create the objects to store String
		String s3 = new String("Hello");
		String s4 = new String("HeLLo");
		
		// s1, s2, s3 and s4 are reference variables :)
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		// Strings are Reference Types -> We are suppose to see some HashCodes on printing the reference variables
		// When we print our reference variable, toString method is executed which shows the Data instead of HashCode :)
		
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
		
		if(s1 == s2) { // true
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) { // false
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) { // false
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}
		
		
		//if(s3.equals(s4)) { 
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("s3 equals s4");
		}else {
			System.out.println("s3 not equals s4");
		}
		
		//if(s3.compareTo(s4) == 0) {
		if(s3.compareToIgnoreCase(s4) == 0) {
			System.out.println("s3 compared to s4");
		}else {
			System.out.println("s3 not compared to s4");
		}
		
		
		

	}

}
