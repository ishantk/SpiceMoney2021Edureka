package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.bean.Connection;

public class App {

	public static void main(String[] args) {
		
		
		// Traditional Way of Creating an Object
		/*Connection connection = new Connection();
		connection.setUrl("jdbc:mysql://localhost/mydb");
		connection.setUser("root");
		connection.setPassword("");*/
		
		// If we create an object which contains some configuration
		// This may be a Challenge
		// If we change the user or password or url itself, we need to re compile the whole App
		
		// Solution:
		// Spring FW
		// IOC - Inversion of Control
		// Do not create Objects, just configure the data inside an XML File
		// Spring FW will read the XML and construct and manage objects in memory for us
		// Hence, we can easily update er or password or url  in XML file, without compiling the whole code again

		// IOC Containers
		// 1. BeanFactory
		// 2. ApplicationContext
		
		// IOC Procedure
		// 1. Create the Bean Structure
		// 2. Create the Client Class with main method
		// 3. Link the Spring Core Jar File [Reference Link: https://repo.spring.io/ui/native/release/org/springframework/spring/5.3.9]
		// 4. Copy XML File in src directory and configure the bean
		// 5. Execute IOC Container APIs in main method
	
		//Resource resource = new ClassPathResource("beans.xml");   // Parse XML file
		//BeanFactory factory = new XmlBeanFactory(resource);       // Create IOC Container
		
		//Connection con1 = (Connection)factory.getBean("ref1");
		//Connection con2 = factory.getBean("ref2", Connection.class);
		
		//System.out.println(con1);
		//System.out.println(con2);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Connection con1 = (Connection)context.getBean("ref1");
		//Connection con2 = context.getBean("ref2", Connection.class);
		
		//System.out.println(con1);
		//System.out.println(con2);
		
		
		Connection con1 = (Connection)context.getBean("ref1");
		//Connection con2 = (Connection)context.getBean("ref1");
		
		System.out.println(con1);
		//System.out.println(con2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
