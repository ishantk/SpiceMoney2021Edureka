
public class ImmutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE 
		// i.e. we cannot change the contents of the String :)
		String s1 = "john watson";
		String s2 = new String("FIONNA FLYNN");
		
		System.out.println("s1 before is: "+s1);
		System.out.println("s2 before is: "+s2);
		
		// String Manipulation means, a new String in the memory :)
		String s3 = s1.toUpperCase();
		String s4 = s2.toLowerCase();
		
		System.out.println("s1 after is: "+s1);
		System.out.println("s2 after is: "+s2);
		
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);

	}

}
