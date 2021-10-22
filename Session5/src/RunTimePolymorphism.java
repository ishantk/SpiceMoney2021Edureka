class Plan{
	
	Plan(){
		System.out.println("Plan Object Constructed");
	}
	
	void show() {
		System.out.println("The Basic Plan");
		System.out.println("Please Pay \u20b9"+100);
	}
	
}

class Plan4G extends Plan{
	
	Plan4G(){
		System.out.println("Plan4G Object Constructed");
	}
	
	void show() { // OVERRIDING -> ReDefinied the method of Parent in Child
		System.out.println("The Plan 4G");
		System.out.println("Please Pay \u20b9"+200);
	}
	
	void subscribe() {
		System.out.println("Subscribe to Yearly Plan");
	}
}


public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		// Polymorphic Statement
		// Reference Variable of the Parent can refer to the Object of Child
		Plan pRef = new Plan4G();
		
		// We can access i.e. execute only those methods which are overrided
		pRef.show(); // execute the show of Child
		
		// pRef.subscribe(); // Not Accessible :(

	}

}
