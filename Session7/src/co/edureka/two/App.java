package co.edureka.two;

import co.edureka.one.One;
//import co.edureka.one.Two; // error

// default means only inside the package



// Package Level Inheritance
// One from the package one is Parent and Three from the package two is Child
class Three extends One{
	
	void show() {
		//pvtShow(); // error
		//defShow(); // error
		protShow(); // OK => Accessible within the child :)
	}
	
}


public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow(); // error
		//oRef.defShow(); // error
		//oRef.protShow(); // error
		//oRef.pubShow();
		
		Three tRef = new Three();
		tRef.pubShow(); // Three is accessing public property of the Parent
		
	}

}

// private -> inside the class
// default and protected -> inside the package
// public -> accessible everywhere

// So what is the difference between default and protected
// protected is accessible within the child across the package
