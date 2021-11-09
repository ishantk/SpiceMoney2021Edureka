package co.edureka.main;

//import org.springframework.aop.framework.ProxyFactoryBean; => Configure in XML File for Spring AOP
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Product;

public class AOPApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		//Product product = context.getBean("pRef", Product.class);
		Product product = context.getBean("productProxy", Product.class);
		System.out.println(product);
		
		System.out.println();
		
		product.purchaseProduct("Home", "Evening");
		

	}

}
