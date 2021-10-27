package co.edureka.model;

public class Employee {
	
	public String eid;
	public String name;
	public int salary;
	public String designation;
	
	public Employee() {
		
	}
	
	public Employee(String eid, String name, int salary, String designation) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	

}
