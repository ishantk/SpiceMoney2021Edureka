//abstract class PayTMGateway{
interface PayTMGateway{
	
	boolean isBankInterfaceUp = true;
	
	// We can define methods in Interfaces from Java8+
	// using the default keyword
	default void payTmPay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[PayTM] Transaction in Progress...");
			System.out.println("[PayTM] Amount Paid: "+amount);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			onSuccess();
		}else {
			System.out.println("[PayTM] Transaction Failed");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			onFailure();
		}
	}
	
	abstract void onSuccess();
	abstract void onFailure();
}

//abstract class GooglePayGateway{
interface GooglePayGateway{
	
	boolean isBankInterfaceUp = true;
	
	default void googlePay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[GooglePay] Transacting Payment...");
			System.out.println("[GooglePay] Amount Received: "+amount);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			onPaymentSuccess();
		}else {
			System.out.println("[PayTM] Unfortuantely Transaction Failed");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			onFailure();
		}
	}
	
	abstract void onPaymentSuccess();
	abstract void onFailure();
}

// Challenge #1 : Zomato wont be able to integrate multiple Gateways in this implemetation
//				  As abstract class is suppose to be extended

// Challenge #2: Rule of Inheritance -> Object of Parent is getting constructed for no reason
//										in this particular use case, we dont need the parent object

// Solution: Use Interfaces for such use cases :)




//class ZomatoPayment extends PayTMGateway, GooglePayGateway{
class ZomatoPayment implements PayTMGateway, GooglePayGateway{
	
	public void onSuccess() {
		System.out.println("[ZOMATO] Thank you for your payment");
		System.out.println("[ZOMATO] We are processing Your Order...");
	}
	
	public void onPaymentSuccess() {
		System.out.println("[ZOMATO] Thank you for your payment");
		System.out.println("[ZOMATO] We are processing Your Order...");
	}
	
	public void onFailure() {
		System.out.println("[ZOMATO] Payment Failed. Please Try Again");
	}
	
}

public class InterfaceUseCase {

	public static void main(String[] args) {
		
		ZomatoPayment payment = new ZomatoPayment();
		//payment.payTmPay(2000);
		payment.googlePay(2000);
		

	}

}
