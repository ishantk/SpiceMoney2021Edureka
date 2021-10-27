package co.edureka.main;

import java.util.ArrayList;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("E101", "John Watson", 30000, "Software Engineer");
		Employee employee2 = new Employee("E201", "Fionna Flynn", 50000, "Senior Software Engineer");
		System.out.println(employee1);
		System.out.println(employee2);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);

	}

}
