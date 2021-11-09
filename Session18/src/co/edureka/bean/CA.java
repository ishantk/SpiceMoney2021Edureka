package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CA {

	CB cb;

	public CA() {
		System.out.println("Default CA Object Construction");
	}
	
	//@Autowired
	public CA(CB cb) {
		System.out.println("Paramterized CA Object Construction");
		System.out.println("Constructor Injection");
		this.cb = cb;
	}

	public CB getCb() {
		return cb;
	}

	@Autowired
	public void setCb(CB cb) {
		System.out.println("Setter Injection");
		this.cb = cb;
	}
	
}
