class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		System.out.println("Parent Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
	}
	
	void showDetails() {
		System.out.println("~~~~~Parent Details~~~~~~");
		System.out.println(fname+" "+lname);
		System.out.println("Wealth: \u20b9"+wealth);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

//class Child{
class Child extends Parent{ // Creating Inheritance Relationship
	
	String fname;
	int wealth;
	String companyName;
	
	Child(){
		fname = "Fionna";
		wealth = 200000;
		companyName = "ABC Corp";
		System.out.println("Child Object Constructed");
	}
	
	// Method Overiding :)
	// ReDefine something of the Parent in the Child
	void showDetails() {
		
		// super is a keyword which refers to the Parent Object from the Child Object
		// when to use super -> when we have same property in child as well
		super.showDetails();
		
		//System.out.println(wealth); // 190000
		//System.out.println(super.wealth);// 100000
		
		System.out.println("~~~~~Child Details~~~~~~");
		System.out.println(fname+" "+lname);
		System.out.println("Wealth: \u20b9"+wealth);
		System.out.println("Company Name: "+companyName);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

public class WhatIsInheritance {

	public static void main(String[] args) {
		
//		Parent pRef = new Parent();
//		pRef.showDetails();
//		System.out.println("pRef is: "+pRef);
		
		Child cRef = new Child();
		System.out.println("cRef is: "+cRef);
		
		// RULE #1
		// Before the object of Child, Parent Object will be created in the memory
		// And hence, the two objects are related as Parent and Child due to extends keyword
		// If anything in Parent is private, child cannot access it
		
		// RULE #2
		// Child can access anything of the Parent if Child does not have it
		// If child has its own property, child will access it rather than of the parent
		
		// Reference Variable of the Child can access data of the Parent
		cRef.wealth -= 10000;
		cRef.showDetails();

	}

}
