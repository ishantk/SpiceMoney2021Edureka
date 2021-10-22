abstract class Cab{
	
	int baseFare;
	int pricePerKm;
	
	Cab(){
		baseFare = 100;
		pricePerKm = 10;
		System.out.println("Cab Object Constructed");
	}
	
	double getTotalFare(int kms) {
		double total = (pricePerKm*kms) + baseFare;
		total += total*0.18;
		return total;
	}
	
//	void bookCab(String source, String destination) {
//		System.out.println("Cab Booked from "+source+" to "+destination);
//	}
	
	// Rule from Parent
	// Must be Defined By all the children
	abstract void bookCab(String source, String destination);
	
}

class MiniCab extends Cab{
	
	MiniCab(){
		System.out.println("Mini Cab Object Constructed");
	}
	
	void bookCab(String source, String destination) {
		pricePerKm = 8;
		baseFare = 50;
		System.out.println("Mini Cab Booked from "+source+" to "+destination);
	}
	
}

class SedanCab extends Cab{
	
	SedanCab(){
		System.out.println("Sedan Cab Object Constructed");
	}
	
	void bookCab(String source, String destination) {
		pricePerKm = 15;
		baseFare = 150;
		System.out.println("Sedan Cab Booked from "+source+" to "+destination);
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
		
		//Cab cab = new Cab();
		//cab.bookCab("Home", "Work");
		//System.out.println("Fare to be Paid: "+cab.getTotalFare(5));
		
		Cab cab = new MiniCab();
		System.out.println();
		
		cab.bookCab("Home", "Work");
		System.out.println("Fare to be Paid: "+cab.getTotalFare(5));
		
		System.out.println();
		
		cab = new SedanCab();
		System.out.println();
		
		cab.bookCab("Work", "Home");
		System.out.println("Fare to be Paid: "+cab.getTotalFare(5));

		// cab = new Cab(); // error
	}

}
