
abstract class AbstractClass{
	
	String appName;
	
	AbstractClass(){
		appName = "Edureka";
		System.out.println("AbstractClass Object Constructed");
	}
	
	void welcome() {
		appName = "Edureka Learning";
		System.out.println("Welcome to "+appName);
	}
	
	abstract void message();
	
}

interface MyInterface{
	
	// appName resides in the Interface Storage Container on PermGen Space 
	String appName = "edureka"; // -> public static final String appName = "edureka";
	
	// error: cannot have constructors
	// hence objects are impossible, directly or indirectly
	// i.e. Parent Child relationship does not exist with interfaces
	/*MyInterface(){
		
	}*/
	
	// error -> we cannot have definitions
	/*void welcome() {
		appName = "Edureka Learning";
		System.out.println("Welcome to "+appName);
	}*/
	
	void message(); // -> public abstract void message();
}

interface YourInterface{
	void bye();
}

// Inheritance for Interfaces
// This is not inheritance we have seen earlier
// This is kind of inheritance where we are creating a new rule book from the previous rule books
interface OurInterface extends MyInterface, YourInterface{
	
}

//class Child extends AbstractClass{ // Parent Child Relationship

// Fundamental is: Implementation of Rule Book i.e. Interface and Not Inheritance :) 
//class Child implements MyInterface, YourInterface{ // NOT Parent Child Relationship
class Child implements OurInterface{
	
	Child(){
		System.out.println("Child Object Constructed");
	}
	
	public void message() {
		System.out.println("This is Message implemented in Child");
	}
	
	public void bye() {
		System.out.println("This is bye implemented in Child");
	}
	
}

public class AbstractVsInterfaces {

	public static void main(String[] args) {
		
		// Direct Object Construction not Allowed
		//AbstractClass ref = new AbstractClass(); // error :)
		
		Child cRef = new Child(); 
		// 1 Parent Object i.e. of Abstract Class and another Child Object
		// And shall be related to each other

	}

}
