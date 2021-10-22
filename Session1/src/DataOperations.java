// Controller
// Computation Module -> Operators
public class DataOperations {

	public static void main(String[] args) { // static -> main belongs to the class DataOperations
		
		// Arithmetic Operators
		double dish1Price = 200.25;
		double dish2Price = 100.50;
		
		double taxes = 0.18;
		
		double total = dish1Price + dish2Price;
		double amountToPay = total + taxes*total;
		
		System.out.println("Amount to Pay is: \u20b9"+amountToPay);
		
		int buckets = 13;
		int number = 20;
		int hashCode = number % buckets;
		System.out.println("hashCode is: "+hashCode);
		
		int quantity = 1;
		quantity++; // 2
		quantity++; // 3
		quantity--; // 2
		++quantity; // 3
		
		System.out.println("Quantity is: "+quantity);
		
		//int finalQuantity = quantity++;
		int finalQuantity = ++quantity;
		System.out.println("finalQuantity is: "+finalQuantity);
		System.out.println("Quantity Now is: "+quantity);
		
		int x = 1;
		x += 1; // x = x + 1
		x += 3;
		
		System.out.println("x is: "+x); // 5
		
		x %= 3; // x = x % 3; // 2
		System.out.println("x now is: "+x);
		
		// Relational
		int wallet = 250;
		int cabFare = 250;
		
		System.out.println("Can i book the cab: "+(wallet >= cabFare));
		
		int promoCode = 20911;
		System.out.println("Can is get a discount: "+(promoCode == 10911));

		boolean internetSwitch = true;
		boolean gpsSwitch = false;
		
		System.out.println("Can i Navigate using Google Maps: "+(internetSwitch && gpsSwitch));
		
		System.out.println("Can i book cab and get discount: "+( (wallet >= cabFare) && (promoCode == 10911) ));
	}

}
