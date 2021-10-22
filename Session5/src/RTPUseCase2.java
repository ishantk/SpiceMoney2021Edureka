class PayTMPaymentGateway{
	
	boolean isPaymentMInterfaceUp = true;
	
	void pay(int amount) {
		if(isPaymentMInterfaceUp) {
			System.out.println("[PayTM] Payment Processed: "+amount);
			onSuccess();
		}else {
			onFailure();
		}
	}
	
	void onSuccess() {
		System.out.println("[PayTM] Payment Successfull");
	}
	
	void onFailure() {
		System.out.println("[PayTM] Payment Failed");
	}
	
}

class ZomatoPaymentPage extends PayTMPaymentGateway{
	
	void onSuccess() {
		System.out.println("[Zomato] Thank You For Placing Order With Us. Our Agent will deliver the order Soon");
	}
	
	void onFailure() {
		System.out.println("[Zomato] Sorry !! We could not process Your Order. Please Try Again");
	}
	
}

public class RTPUseCase2 {

	public static void main(String[] args) {
		
		PayTMPaymentGateway gateway = new ZomatoPaymentPage();
		gateway.pay(2000);

	}

}
