package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object refBean) throws Throwable {
		
		if(method.getName().equals("purchaseProduct")) {
			
			System.out.println("--after execution started--"+method.getName());
			
			System.out.println("3. Notifiying the Customer and Logistics");
			
			Product product = (Product)refBean;
			if(product.canBuy) {
				System.out.println("Email Sent with Invoice");
				System.out.println("Your Product "+product.getName()+" will be delivered at "+inputs[0]+" by "+inputs[1]);
				System.out.println();
				System.out.println("Notified the Logistics Department");
			}else {
				System.out.println("Product is Out of Stock");
			}
			
			System.out.println("--after execution finished--"+method.getName());
		}
	}

}
