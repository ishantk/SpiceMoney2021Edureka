package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Dish;
import co.edureka.model.Restaurant;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Fionnas Intalian Delight");
		restaurant.setPhone("+91 99999 12345");
		restaurant.setOperatingHours("10:00 to 20:00");
		restaurant.setPricePerPerson(300);
		restaurant.setRatings(4.7f);
		
		Dish dish1 = new Dish(null, "Veggie Pizza", 300);
		Dish dish2 = new Dish(null, "Cheese Pizza", 200);
		Dish dish3 = new Dish(null, "Pizza Pocket", 50);
		
		List<Dish> dishes = new ArrayList<Dish>();
		dishes.add(dish1); // 0
		dishes.add(dish2); // 1
		dishes.add(dish3); // 2
		
		restaurant.setDishes(dishes); // One to Many Relationship i.e. 1 Restaurant has many Dishes
		
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
			
			//session.save(restaurant);
			
			Restaurant ref = session.get(Restaurant.class, 2);
			
			System.out.println(ref.getName()+" | "+ref.getRatings());
			List<Dish> list = ref.getDishes();
			for(Dish dish : list) {
				System.out.println(dish);
			}
			
			
			transaction.commit();
			System.out.println("Transaction Completed");
			session.close(); // disconnet from DB
			sessionFactory.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}

	}

}
