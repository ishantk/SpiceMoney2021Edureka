package co.edureka.model;

public class User {

	public Integer uid;
	public String name;
	public String email;
	public String password;
	
	public User() {
		
	}
	
	public User(Integer uid, String name, String email, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}
