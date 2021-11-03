package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Address;
import co.edureka.model.Restaurant;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Johns Cafe");
		restaurant.setPhone("+91 99999 11111");
		restaurant.setOperatingHours("10:00 to 20:00");
		restaurant.setPricePerPerson(200);
		restaurant.setRatings(4.5f);
		
		Address address = new Address();
		address.setAdrsLine("Redwood Shores");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setZipCode(141002);
		
		// One to One Mapping
		restaurant.setAddress(address);
		address.setRestaurant(restaurant);
		
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
			

			session.save(restaurant);
			
			
			transaction.commit();
			System.out.println("Transaction Completed");
			session.close(); // disconnet from DB
			sessionFactory.close();
			
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}

	}

}
