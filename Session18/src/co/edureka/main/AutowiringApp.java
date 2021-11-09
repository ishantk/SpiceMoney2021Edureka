package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.CA;

public class AutowiringApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		CA cRef = context.getBean("ca", CA.class);
		cRef.getCb().show();
	}

}
