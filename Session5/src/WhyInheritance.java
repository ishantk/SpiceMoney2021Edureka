// ecommerce platform
// we have so many products :)

// Shoe:   name, brand, price, color, shoeSize
// TV  :   name, brand, price, color, technology, screenSize
// Mobile: name, brand, price, color, os, ram, screenSize

/*class Shoe{
	
	String name, brand, color;
	int price, shoeSize;
	
	Shoe() {
		
	}
	
	Shoe(String name, String brand, String color, int price, int shoeSize) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.shoeSize = shoeSize;
	}
	
}

class TV{
	
	String name, brand, color, technology;
	int price, screenSize;
	
	TV() {
		
	}

	TV(String name, String brand, String color, String technology, int price, int screenSize) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.technology = technology;
		this.price = price;
		this.screenSize = screenSize;
	}
	
}

class Mobile{
	
	String name, brand, color, technology, os;
	int price, ram, screenSize;
	
	Mobile() {
		
	}

	Mobile(String name, String brand, String color, String technology, String os, int price, int ram,
			int screenSize) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.technology = technology;
		this.os = os;
		this.price = price;
		this.ram = ram;
		this.screenSize = screenSize;
	}

	
}*/

// Generic Class for creating different Products
class Product{
	
	String name, brand, color;
	int price;
	
	Product(){
		
	}

	Product(String name, String brand, String color, int price) {
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
}

class Shoe extends Product{
	
	int shoeSize;
	
	Shoe(){
		
	}
	
	Shoe(String name, String brand, String color, int price, int shoeSize) {
		super(name, brand, color, price);
		this.shoeSize = shoeSize;
	}
	
}

class TV extends Product{
	
	String technology;
	int screenSize;
	
	TV(){
		
	}
	
	TV(String name, String brand, String color, int price, String technology, int screenSize) {
		super(name, brand, color, price);
		this.technology = technology;
		this.screenSize = screenSize;
	}
	
}

class Mobile extends Product{
	
	String os;
	int ram, screenSize;
	
	Mobile(){
		
	}
	
	Mobile(String name, String brand, String color, int price, String os, int ram, int screenSize) {
		super(name, brand, color, price);
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
	}
	
}




public class WhyInheritance {

	public static void main(String[] args) {
		

	}

}
