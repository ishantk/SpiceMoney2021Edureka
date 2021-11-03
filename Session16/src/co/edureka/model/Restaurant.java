package co.edureka.model;

public class Restaurant {
	
	Integer rid;
	String name;
	String phone;
	String operatingHours;
	Float ratings;
	Integer pricePerPerson;
	
	// Here we have reference to an Address object
	// i.e. whenever a Restaurant Object will be created, it will internally have reference to Address object
	Address address; // 1 to 1 Mapping | Has-A relation

	public Restaurant() {
		
	}
	
	public Restaurant(Integer rid, String name, String phone, String operatingHours, Float ratings,
			Integer pricePerPerson, Address address) {
		this.rid = rid;
		this.name = name;
		this.phone = phone;
		this.operatingHours = operatingHours;
		this.ratings = ratings;
		this.pricePerPerson = pricePerPerson;
		this.address = address;
	}
	

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
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

	public Float getRatings() {
		return ratings;
	}

	public void setRatings(Float ratings) {
		this.ratings = ratings;
	}

	public Integer getPricePerPerson() {
		return pricePerPerson;
	}

	public void setPricePerPerson(Integer pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours
				+ ", ratings=" + ratings + ", pricePerPerson=" + pricePerPerson + ", address=" + address + "]";
	}

}
