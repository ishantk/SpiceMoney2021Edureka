package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Structure of Employee Object -> MODEL or BEAN or POJO
@Entity
@Table(name = "MY_EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="EID")
	public Integer eid;
	
	@Column(name="NAME")
	public String name;
	
	@Column(name="EMAIL")
	public String email;
	
	@Column(name="SALARY")
	public Integer salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer eid, String name, String email, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
}
