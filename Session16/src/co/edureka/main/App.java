package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

/*
 	
 	Hibernate Procedure:
 	1. We need a Model to be saved in DB
 	2. Link the Jar Files for Hibernate in our Project: https://hibernate.org/orm/releases/
 	   Hibernate internally uses JDBC hence we need MySQL Driver jar to be linked as well
 	3. Copy configuration file in src directory for hibernate and edit it
 	4. Copy mapping file in src directory for mapping model class with table and edit the same
 	5. In the main class, execute Hibernate APIs
 	
 */

public class App {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(null, "Harry", "harry@example.com", 37000);
		Employee employee2 = new Employee(null, "Jim", "jim@example.com", 25000);
		//System.out.println(employee1;
		
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
			
			// Execute Hibernate APIs to perform CRUD Operations
			// 1. Insert operation
			//session.save(employee1);
			//session.save(employee2);
			
			for(int i=1;i<=100;i++) {
				session.save(new Employee(null, "Employee"+i, "employee"+i+"@example.com", 35000));
			}
			
			// 2. Fetch 1 Single row from DB, where eid is 2
			//Employee employee = session.get(Employee.class, 2);
			//System.out.println(employee);
			
			// 3. Update Operation
			//    Firstly Fetch the Object you wish to update
			//employee.setName("Fionna Flynn");
			//employee.setSalary(89500);
			//session.update(employee);
			
			// 4. Delete Operation
			//Employee employee = new Employee();
			//employee.setEid(2);
			//session.delete(employee); // Delete the Employee where eid = 2
			
			// 5. Fetch Multiple Records
			// 5.1 Hibernate Query Language
			//String hql = "From Employee";
			/*String hql = "From Employee where salary > 35000";
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee employee : employees) {
				System.out.println(employee);
			}*/
			
			// 5.2 Through API Criteria
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 35000));
			
			List<Employee> employees = criteria.list();
			for(Employee employee : employees) {
				System.out.println(employee);
			}*/
			
			transaction.commit();
			System.out.println("Transaction Completed");
			session.close(); // disconnet from DB
			sessionFactory.close();
			
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}

	}

}
