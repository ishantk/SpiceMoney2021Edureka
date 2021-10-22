package co.edureka.one;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		Two tRef = new Two();
		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}

// private: which can be accessed only inside the class and not outside the class
// All other access modifiers can be accessed if they are in the same package either the class is default otr public 

// In the same source code we cannot have more than 1 public class
// RULE: if the class in source file is public, than the name of the source file
//       should be same name as that of class name
//public class YourApp{
	
//}


// default classes are allowed
// no access modifier :)
/*class OurApp{
	
}*/

// RULE: We cannot have private or protected classes
//private class SomeApp{
//protected class SomeApp{
	
//}

// 4 Access Modifiers -> public, default(no need to write the keyword), private and protected