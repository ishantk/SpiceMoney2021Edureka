package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object refBean) throws Throwable {
		
		
		if(method.getName().equals("purchaseProduct")) {
			
			System.out.println("--before execution started--"+method.getName());
			
			System.out.println("1. Validating the Product");
			
			Product product = (Product)refBean;
			if(product.getStock() < 1) {
				product.setCanBuy(false);
			}else {
				product.setCanBuy(true);
			}
			
			System.out.println("--before execution finished--"+method.getName());
		}
		
		
	}

}
