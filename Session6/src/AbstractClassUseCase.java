// PayTM has developed the PaymentGateway which can be integrated by other companies
// PayTM will give the SDK to the developers to integrate their code
abstract class PayTmPaymentGateway{
	
	boolean isBankInterfaceUp = true;
	
	final void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[PayTM] Payment Processed");
			System.out.println("[PayTM] Amount Successfully Received");
			onSuccess();
		}else {
			System.out.println("[PayTM] Payment Failed");
			onFailure();
		}
	}
	
	// Abstract Method will have no definition/body
	// Abstract Method can be declared only in Abstract Class
	// Abstract Method is a RULE, which children must define 
	abstract void onSuccess();
	abstract void onFailure();
	
}

class ZomatoPaymentPage extends PayTmPaymentGateway{

	
	void onSuccess() {
		System.out.println("[ZOMATO] Thank You for placing the Order");
		System.out.println("[ZOMATO] Restaurant Notified");
		System.out.println("[ZOMATO] Delivery Agent Notified");
	}

	void onFailure() {
		System.out.println("[ZOMATO] Payment Failed");
		System.out.println("[ZOMATO] Please pay using other payment method");
	}
	
}


public class AbstractClassUseCase {

	public static void main(String[] args) {
		
		//ZomatoPaymentPage payment = new ZomatoPaymentPage();
		PayTmPaymentGateway payment = new ZomatoPaymentPage();
		//PayTmPaymentGateway payment = new PayTmPaymentGateway();
		
		payment.pay(3000);
		
	}

}
