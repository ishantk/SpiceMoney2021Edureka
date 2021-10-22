package co.edureka.lang;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int i = 10;
		
		//Integer iRef = new Integer(i); // Older Versions
		
		// BOXING
		// Primitive Converted into Object
		// valueOf method will create an Integer Object in memory with data as 10
		Integer iRef = Integer.valueOf(i); // Newer Versions of Java
		
		// For int -> Integer is a Wrapper Class
		// UNBOXING
		int j = iRef.intValue(); // Get the primitive int from the Object
		System.out.println("j is "+j);
		
		char ch1 = 'A';
		Character cRef = Character.valueOf(ch1); // Converted primitive to Object
		char ch2 = cRef.charValue();
		System.out.println("ch2 is: "+ch2);
		
		
		long l = 20;
		
		// AUTO BOXING 
		Long lRef = l; //Long lRef = Long.valueOf(l);
		
		// AUTO UNBOXING
		long m = lRef; // long m = lRef.longValue();
		
		
	}

}
