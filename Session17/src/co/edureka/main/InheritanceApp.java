package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Burger;
import co.edureka.model.Dish;
import co.edureka.model.VeggieBurger;

public class InheritanceApp {

	public static void main(String[] args) {
		
		
		// Dish Object
		Dish dish = new Dish();
		dish.setName("Fired Rice");
		dish.setPrice(200);
		
		// Burger with Parent as Dish
		Burger burger = new Burger();
		burger.setName("McVegBurger");
		burger.setPrice(100);
		burger.setBurgerName("Mc Veggie Surprise");
		burger.setDressing("Tomato and Mayonise Dressing");

		// 	VeggieBurger with Parent as Burger and GrandParent as Dish
		VeggieBurger veggieBurger = new VeggieBurger();
		veggieBurger.setName("McKingSupremene");
		veggieBurger.setPrice(300);
		veggieBurger.setBurgerName("Mc King Veggie Delight");
		veggieBurger.setDressing("Tomato and Mayonise Dressing");
		veggieBurger.setHerbs("Orgeano and Parsley");
		veggieBurger.setSpice("Low");
		
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			// configuration file needs to be parsed by hibernate
			// And hence, Hibernate FW will give us the SessionFactory
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			// Obtain the Session from the Session Factory
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.save(dish);
			session.save(burger);
			session.save(veggieBurger);
			
			transaction.commit();
			System.out.println("Transaction Completed");
			session.close(); // disconnet from DB
			sessionFactory.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}

	}

}
