import java.util.Scanner;

interface Cab{
	void bookCab(String source, String destination);
}

class OlaMini implements Cab{
	public void bookCab(String source, String destination) {
		System.out.println("OLA Mini Cab Booked");
		System.out.println("Mini shall pick you from "+source+" and drop you to "+destination);
	}
}

class OlaSedan implements Cab{
	public void bookCab(String source, String destination) {
		System.out.println("OLA Sedan Cab Booked");
		System.out.println("Sedan shall pick you from "+source+" and drop you to "+destination);
	}
}

class OlaBike implements Cab{
	public void bookCab(String source, String destination) {
		System.out.println("OLA Bike Booked");
		System.out.println("Bike shall pick you from "+source+" and drop you to "+destination);
	}
}


class CabBooking{
	
	static Cab getCab(String typeOfCab) {
		
		Cab cab = null;
		
		if(typeOfCab.equals("mini")) {
			cab = new OlaMini();
		}else if(typeOfCab.equals("sedan")) {
			cab = new OlaSedan();
		}else if(typeOfCab.equals("bike")) {
			cab = new OlaBike();
		}else {
			System.out.println("Invalid Choice");
		}
		
		return cab;
	}
	
}

public class InterfaceUseCase2 {

	public static void main(String[] args) {
		
		// Polymorphic Statement: 
		//		1. Reference of the Parent can point to the child object
		//		2. Reference if the Interface can point to the object which implements it
		
//		Cab cab; // Reference Variable of interface cab
//		//cab = new OlaMini();
//		//cab = new OlaSedan();
//		cab = new OlaBike();
//		cab.bookCab("Home", "Work");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Type of Cab You wish to book");
		String cabType = scanner.nextLine();
		
		Cab bookedCab = CabBooking.getCab(cabType);
		
		if(bookedCab!=null)
			bookedCab.bookCab("Home", "Work");

	}

}
