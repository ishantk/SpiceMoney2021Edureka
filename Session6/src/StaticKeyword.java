
class Dish{
	
	// Non Static -> Belongs to Object
	String name;
	int price;
	int quantity;
	
	// Static -> Belongs to Class
	static int totalQuantity; // by default 0
	static int numberOfDishes;
	
	Dish(){
		numberOfDishes++;
	}

	Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		totalQuantity += quantity;
		
		numberOfDishes++;
	}
	
	void increment() {
		quantity++;
		totalQuantity++;
	}
	
	void decrement() {
		quantity--;
		totalQuantity--;
	}
	
	void showDish() {
		System.out.println("------------------------");
		System.out.println(name+" "+price+" ["+quantity+"]");
		System.out.println("------------------------");
		System.out.println();
	}
	
	// static method -> belongs to class
	// inside the static method, we cannot access non static properties
	static void show() {
		System.out.println("Your Order: "+totalQuantity);
		System.out.println("Number of Dishes: "+numberOfDishes);
		// System.out.println("price is: "+price); error :)
	}
	
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Poori Channa", 100, 1);
		Dish dish2 = new Dish("Lassi", 50, 1);
		
		Dish dish3 = new Dish();
		dish3.increment();
		
		dish1.increment();
		dish1.increment();
		
		dish2.increment();
		
		dish1.showDish(); // quantity -> 3
		dish2.showDish(); // quantity -> 2
		
		//System.out.println("Your Order: "+(dish1.quantity+dish2.quantity));
		
		Dish.show();
		

	}

}
