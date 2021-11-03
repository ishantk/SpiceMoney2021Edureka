package co.edureka.model;

public class Address {

	// Whatever will be rid, that becomes aid
	Integer aid; // Foreign Key
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	// 1 to 1 mapping
	Restaurant restaurant; // HAS-A Relation

	public Address() {
		
	}
	
	public Address(Integer aid, String adrsLine, String city, String state, Integer zipCode, Restaurant restaurant) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.restaurant = restaurant;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}
	
	
	
}
