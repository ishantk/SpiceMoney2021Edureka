package co.edureka.dp;

class Connection{
	
	private static Connection con = new Connection(); // static variable will refer to the Connection Object
	
	private Connection(){
		System.out.println("Connection Object Constructed");
	}
	
	public static Connection getConnection() {
		return con;
	}
}

public class Singleton {

	public static void main(String[] args) {
	
		//Connection con1 = new Connection();
		//Connection con2 = new Connection();
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);
		

	}

}
