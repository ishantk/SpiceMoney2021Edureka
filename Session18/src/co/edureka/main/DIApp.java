package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.FoodItem;
import co.edureka.bean.Restaurant;

public class DIApp {

	public static void main(String[] args) {
		
		
		//FoodItem item = new FoodItem();
		
		// DI Through the Constructor
		//Restaurant ref = new Restaurant(item);   // Dependency Injection
		
		
		// DI Through the Setter
		//Restaurant restaurant = new Restaurant();
		//restaurant.setFoodItem(item); 			// Dependency Injection
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Restaurant restaurant = context.getBean("rRef", Restaurant.class);
		
		System.out.println(restaurant);
		System.out.println(restaurant.getSearchKeywords());

		// TASK: Configure List of FoodItem Objects for Restaurant using DI Technique
		
	}

}
