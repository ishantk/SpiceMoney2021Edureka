package co.edureka.bean;

// Parent Child Relation
public class Pizza extends FoodItem{ // IS-A Relationship

	int size;
	String toppings;
	
	public Pizza() {
		
	}
	
	public Pizza(int size, String toppings) {
		this.size = size;
		this.toppings = toppings;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + toppings + ", name=" + name + ", price=" + price + "]";
	}
	
}
