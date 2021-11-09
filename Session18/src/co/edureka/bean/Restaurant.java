package co.edureka.bean;

import java.util.List;

public class Restaurant {
	
	String name;
	String phone;
	String operatingHours;
	float ratings;
	FoodItem item;					 // HAS-A Relation // 1 to 1
	List<String> searchKeywords; 	 // HAS-A Relation // 1 to many
	
	//List<FoodItem> foodItems; 		 // TASK -> Configure this in XML File
	
	public Restaurant() {
		System.out.println("[DEFAULT] Restaurant Object Created");
	}
	
	public Restaurant(String name, String phone, String operatingHours, float ratings, FoodItem item) {
		this.name = name;
		this.phone = phone;
		this.operatingHours = operatingHours;
		this.ratings = ratings;
		this.item = item;
		System.out.println("[PARAMETERIZED] Restaurant Object Created");

	}

	public Restaurant(FoodItem item) {
		this.item = item;
		System.out.println("DI WITH CONSTRUCTOR");
		System.out.println("[PARAMETERIZED With FOOD ITEM] Restaurant Object Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public FoodItem getItem() {
		return item;
	}

	public void setItem(FoodItem item) {
		System.out.println("DI WITH SETTER FOR FOOD ITEM OBJECT");
		this.item = item;
	}
	

	public List<String> getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(List<String> searchKeyowords) {
		System.out.println("DI WITH SETTER FOR SEARCH KEYWORDS");
		this.searchKeywords = searchKeyowords;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", ratings="
				+ ratings + ", item=" + item + "]";
	}
	
	/*public Restaurant() {
		//item = new FoodItem(); // High Coupling
	}
	
	// Constructor
	public Restaurant(FoodItem item) {
		this.item = item; // Low Coupling
	}
	 
	// Setter
	public void setFoodItem(FoodItem item) {
		this.item = item; // Low Coupling
	}*/
	
	
	

}
