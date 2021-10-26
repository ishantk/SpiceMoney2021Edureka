package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Object is Super Class i.e. Parent of all the classes in Java by default
// Root Class :)
//class Product extends Object{
class Product extends Object{
	
	String name;
	int price;
	
	Product(){
		 
	}
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// Override the method of Parent Object in Product
	public String toString() {
		return "Name: "+name+"\nPrice: "+price;
		//return name+" "+price+"\n"+super.toString();
	}
	
}

class SortProducts implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		//return o1.price - o2.price; // Ascending
		//return o2.price - o1.price;   // Descending
		
		return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
	}
	
}

public class ArrayListUseCase {

	public static void main(String[] args) {
		
		Product p1 = new Product("iPhone 11", 80000);
		Product p2 = new Product("Adidas Ultraboost", 7000);
		Product p3 = new Product("Samsung Watch", 30000);
		
		//System.out.println("p1 is: "+p1);
		//System.out.println("p2 is: "+p2.toString());
		//System.out.println("p3 is: "+p3.toString());
		
		ArrayList<Product> shoppingCart = new ArrayList<Product>();
		shoppingCart.add(p1);
		shoppingCart.add(p2);
		shoppingCart.add(p3);
		
		//shoppingCart.remove(p2);
		
		//Collections.sort(shoppingCart); // PS: sort shall work on String and Numbers but not for UserDefined Objects
		
		Collections.sort(shoppingCart, new SortProducts());
		
		System.out.println("Shopping Cart: ["+shoppingCart.size()+"]");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(Product product : shoppingCart) {
			System.out.println(product);
			System.out.println();
		}
		
		// Other Use Cases : WhatsApp Contact List
		//				   : Chat Messages
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(70);
		list.add(80);
		list.add(15);
		list.add(22);
		
		System.out.println("List Before Sort is ");
		System.out.println(list);
		
		//Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("List After Sort is ");
		System.out.println(list);

	}

}
