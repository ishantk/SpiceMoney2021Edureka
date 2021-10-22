
public class ConditionalConstruct {

	public static void main(String[] args) {
		
		double amount = 200;
		int tryNew = 101;
		int promoCode = 101;
		
		// simple if/else
		/*if(amount >= 149) {
			System.out.println("You can Apply Promo Code");
		}else {
			System.out.println("Promo Code is not Valid");
		}*/
		
		if(amount >= 149) {
			System.out.println("You can Apply Promo Code");
			
			// Nested if/else
			if(promoCode == tryNew) {
				System.out.println("Promo Code Applied Successfully");
				
				double discount = amount * 0.50;
				
				if(discount > 100) {
					amount -= 100;
				}else {
					amount -= discount; // amount = amount-discount;
				}
				
				System.out.println("Please Pay a final Amount: "+amount);
				
			}else {
				System.out.println("Sorry ! Promo Code seems incorrect !");
			}
			
		}else {
			System.out.println("Amount is lesser for applying promo code");
		}

	}

}
