/*
 	
 	Real World:
 		Object: Anything which exists in reality.
 				Consider object as a Box which can store lot of data
 				details of an object are known as state of an object
 				
 		Class:  is a representation of an Object
 				i.e. drawing of an object
 		
 	Computer Science:
 		Object: Multi Value Container i.e. Data Storage in our Program :)
 				data associated with object -> state of an object/data member/attributes
 				
 		Class : structure of an object
 				i.e. we code the structure of an object as a class and 
 				than tell the JVM to create the Object in memory by reading what we coded in class
 				
 				
 	Principle of OOPS:
 		1. Identify an Object, from the problem statement
 		2. Code the Class i.e. Object's representation
 		3. From the Class, use it to create real objects in memory
 		
 		
 	>> 1. Identify an Object, from the problem statement	
 	From zomato.com
 		Restaurant is an Object
 			attributes: name, phone, email, ratings, operatingHours, categories, address
 			
 		Menu is an object
 			attributes: name, numberOfDishes, servingHours
 			
 		Dish is an Object
 			  attributes: name, description, price
 			  
 		Objects can be related
 			  Restaurant HAS-A Menu
 			  Menu HAS Dishes
 			  
 		
 		MobileRecharge is an Object
 			attributes:
 				typeOfMobile // 1 means prepaid and 2 means postpaid
 				mobileNumber
 				operator
 				amount
 	
 */

// >> 2. Code the Class i.e. Object's representation

// structure of an object: whatever you code in class basically is property of object
class MobileRecharge{
	
	// attributes -> Property of object
	int typeOfMobile; // 1 means prepaid and 2 means postpaid
	String mobileNumber;
	String operator;
	int amount;
	
	// methods -> property of object
	// Which will be used to process the data inside an object :)
	void changeType(int type) {
		if(type == 1 || type == 2) {
			typeOfMobile = type;
			System.out.println("Type of Mobile Modified");
		}else {
			System.out.println("Invalid Type Details");
		}
	}
	
	void showDetails() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		String type = typeOfMobile==1 ? "Prepaid": "Postpaid"; 
		System.out.println("Type of Mobile: "+type);
		System.out.println("Mobile Numner: "+mobileNumber);
		System.out.println("Operator: "+operator);
		System.out.println("Amount: \u20b9"+amount);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	void applyPromoCode(String promoCode) {
		if(promoCode.equals("PAYTM")) {
			amount -= 50;
			System.out.println("Promo Code Applied");
		}else {
			System.out.println("Invalid Promo Code");
		}
	}
	
}

class Restaurant{
	// attributes :) -> Property of object
	String name, phone, email, operatingHours, categories, address;
	double ratings;
}

// Main Class of our Program
// Typically to execute the program we will not code this class as object.
// we are just having this class for executions :)
public class OOPS {

	public static void main(String[] args) {
		
		// >> 3. From the Class, use it to create real objects in memory
		MobileRecharge reference1 = new MobileRecharge();
		// new is an operator which will create the Object at run time
		// i.e. object will be constructed in the heap area of allocated RAM
		// new will return the hashcode of the created object 
		// and that will be stored in a reference variable
		
		MobileRecharge reference2 = new MobileRecharge();
		MobileRecharge reference3 = reference1; // Reference Copy
		
		// In above example, we have created 2 objects.
		// reference1, reference2, reference3 are NOT OBJECTS
		// They are reference variables which holds the hashcode of the objects of type MobileRecharge
		
		System.out.println("reference1 is: "+reference1);
		System.out.println("reference2 is: "+reference2);
		System.out.println("reference3 is: "+reference3);
		
		// Operations on object
		// 1. Write/Update
		// 2. Read
		// 3. Delete
		
		// 1. Write/Update
		reference1.typeOfMobile = 1; // prepaid
		reference3.mobileNumber = "+91 98765 12345";
		reference3.operator = "Airtel";
		reference1.amount = 500;
		
		reference2.typeOfMobile = 2; // postpaid
		reference2.mobileNumber = "+91 99999 22222";
		reference2.operator = "Idea";
		reference2.amount = 300;
		
		reference3.amount = 1200; // update
		
		// update the references
		// reference3 = reference2; // Here we are now manipulating our reference variable3 to holds the hashcode of rference2
		
		System.out.println();
		
		//System.out.println(reference1.mobileNumber+" will be recharged with an amount of "+reference1.amount+" type: "+reference1.typeOfMobile);
		//System.out.println(reference2.mobileNumber+" will be recharged with an amount of "+reference2.amount+" type: "+reference2.typeOfMobile);
		//System.out.println(reference3.mobileNumber+" will be recharged with an amount of "+reference3.amount+" type: "+reference3.typeOfMobile);
		
		reference1.showDetails();
		reference2.showDetails();
		reference3.showDetails();
		
		System.out.println();
		
		//reference1.typeOfMobile = 2;
		reference1.changeType(7);
		//System.out.println(reference1.mobileNumber+" will be recharged with an amount of "+reference1.amount+" type: "+reference1.typeOfMobile);

		reference1.applyPromoCode("PAYTM");
		reference1.showDetails();
		
	}

}
