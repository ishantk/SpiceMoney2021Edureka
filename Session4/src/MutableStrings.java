
public class MutableStrings {

	public static void main(String[] args) {
	
		// IMMUTABLE
		String s1 = new String("Hello");
		s1.concat(" John Watson");	
		
		System.out.println("s1 is: "+s1);
		
		// MUTABLE STRINGS
		// Key Feature -> Thread Safe
		StringBuffer s2 = new StringBuffer("Hello");
		s2.append(" John Watson");
		
		System.out.println("s2 is: "+s2);
		
		// Not Thread Safety
		StringBuilder s3 = new StringBuilder("Hello");
		s3.append(" Fionna Flynn");
		System.out.println("s3 is: "+s3);
		
		// Cannot use it as Interned Strings :)
		//StringBuffer s4 = "Hello"; // error
		//StringBuilder s5 = "Hello"; // error
		
	
	}

}
