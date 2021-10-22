// 1. Identify the Object
//    OneWayFlightBooking => source, destination, departureDate, travellers, travelClass  

// 2. Create its class
class OneWayFlightBooking{
	
	// Attributes:
	String source, destination, departureDate, travelClass;
	int travellers; 
	
	// Constructors:
	OneWayFlightBooking(){
		// to write default data for attributes
		source = "Delhi";
		destination = "Bangalore";
		departureDate = "19th Oct 2021";
		travelClass = "Economy";
		travellers = 1;
	}
	
	// Overloaded the Constructor
	OneWayFlightBooking(String s, String destination, String departureDate, String travelClass, int travellers){
		// to write default data for attributes
		// LHS: this.source -> is the attribute of the object
		// RHS: source is the input to constructor
		
		// this is a keyword, for us its a reference variable which refers to the current object
		//System.out.println("this is "+this);
		source = s;
		this.destination = destination;
		this.departureDate = departureDate;
		this.travelClass = travelClass;
		this.travellers = travellers;
	}
	
	// Methods:
	void showDetails() {
		//System.out.println("this is: "+this);
		System.out.println("---------------------------------------------------");
		System.out.println("| "+source+" | "+destination+" | "+departureDate+" | "+travelClass+" | "+travellers+" | ");
		System.out.println("---------------------------------------------------");
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		OneWayFlightBooking booking = new OneWayFlightBooking();
		// booking is reference variable referring to the object in Heap of RAM
		
		// Tedious process as for every object which we will create 
		// we need to manually give the default values
		//booking.source = "Delhi";
		//booking.destination = "Bangalore";
		
		OneWayFlightBooking anotherBooking = new OneWayFlightBooking();
		
		OneWayFlightBooking myBooking = new OneWayFlightBooking("Chandigarh", "Jaipur", "25th October, 2021", "premium economy", 5);
		//System.out.println("myBooking is: "+myBooking);
		
		booking.showDetails();
		
		anotherBooking.travellers = 3;
		anotherBooking.destination = "Goa";
		
		anotherBooking.showDetails();
		myBooking.showDetails();

	}

}
