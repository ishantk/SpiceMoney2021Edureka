package co.edureka.bean;

public class Product {
	
	int pid;
	String name;
	int price;
	String brand;
	int stock;
	boolean canBuy;
	
	public Product() {
		
	}
	
	public Product(int pid, String name, int price, String brand, int stock, boolean canBuy) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.stock = stock;
		this.canBuy = canBuy;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isCanBuy() {
		return canBuy;
	}

	public void setCanBuy(boolean canBuy) {
		this.canBuy = canBuy;
	}
	
	// Business Method: Algo Processing
	/*public void purchaseProduct(String where, String when) {
		
		// 1. Check for the Stock. This may be a bigger task i.e. it may run as a separate thread also
		if(stock > 0) {
			
			System.out.println("Stock Validated. Proceed Towards Transaction");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			// 2. Process Payment. This is again a task
			System.out.println("Online Bank Transaction Started for price "+price);
			System.out.println("Thank You for making a purchase for the product "+name);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			// 3. Notify the Customer and Logistics Department
			System.out.println("Email Sent with Invoice");
			System.out.println("Your Product "+name+" will be delivered at "+where+" by "+when);
			System.out.println();
			System.out.println("Notified the Logistics Department");
			
		}else {
			System.out.println("Sorry. Product is Out of Stock. Please come back again");
		}
		
	}*/
	
	public void purchaseProduct(String where, String when) {
		
		// 1. Check for the Stock. This may be a bigger task i.e. it may run as a separate thread also
		if(canBuy) {
			
			// 2. Process Payment. This is again a task
			System.out.println("Online Bank Transaction Started for price "+price);
			System.out.println("Thank You for making a purchase for the product "+name);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		}else {
			System.out.println("Sorry. Product is Out of Stock. Please come back again");
		}
		
	}
	

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ ", canBuy=" + canBuy + "]";
	}
	
}
