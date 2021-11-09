package co.edureka.bean;

public class Connection {
	
	String url;
	String user;
	String password;
	
	public Connection() {
		System.out.println("[DEFAULT] Connection Object Constructed");
	}
	
	public Connection(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		System.out.println("[PARAMETERIZED] Connection Object Constructed");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void myInit() {
		System.out.println("myInit Executed");
	}
	
	public void myDestroy() {
		System.out.println("myDestroy Executed");
	}
	
	@Override
	public String toString() {
		return "Connection [url=" + url + ", user=" + user + ", password=" + password + "]"+" - "+super.toString();
	}

}
