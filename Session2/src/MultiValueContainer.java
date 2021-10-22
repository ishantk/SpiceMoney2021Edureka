
public class MultiValueContainer {

	public static void main(String[] args) {
		
		int burgerPrice = 100;
		int friesPrice = 50;
		int sandwichPrice = 80;
		int noodlesPrice = 120;
		int pizzaPrice = 200;
		
		// Multi Value Container -> Array
		// Arrays are homogeneous in nature
		String[] titles = {"Burger", "Fries", "Sanwich", "Noodles", "Pizza"};	
		int[] prices = {100, 50, 80, 120, 200};
		
		System.out.println("burgerPrice is: "+burgerPrice); // Value
		
		// prices is a reference variable
		// which holds the HashCode of Array
		// Array is created in the Heap Region :)
		System.out.println("prices is: "+prices); // HashCode
		
//		System.out.println(prices[0]);
//		System.out.println(prices[1]);
//		System.out.println(prices[2]);
//		System.out.println(prices[3]);
//		System.out.println(prices[4]);
		
		System.out.println("prices length is: "+prices.length);
		
		for(int idx=0; idx<5; idx++) {
			System.out.println(titles[idx]+" "+prices[idx]);
//			System.out.println(prices[idx]);
		}
		
		System.out.println("~~~~~~while~~~~~~");
		
		int i=0;
		
		while(i<5) {
			System.out.println(prices[i]);
			i++;
		}
		
		System.out.println("i is: "+i);
		
		System.out.println("~~~~~do While~~~~~~");
		
		i = 0;
		do {
			System.out.println(prices[i]);
			i++;
		}while(i<5);
		
		
		System.out.println("~~~~~~Enhanced For~~~~~~~");
		
		// Enhanced For Loop OR For-Each Loop
		// Read Only Loop for Arrays Only as of now
		for(int anyName : prices) {
			System.out.println(anyName);
		}
	}

}
