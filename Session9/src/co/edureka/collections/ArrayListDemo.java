package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import co.edureka.model.Customer;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Kia", "90909 12000", 98.4, "NA","NA");
		Customer c2 = new Customer("George", "89898 12000", 98.4, "NA","NA");
		Customer c3 = new Customer("Fionna", "76767 12000", 98.4, "NA","NA");
		
		System.out.println();
		
		// Hetrogeneous
		ArrayList list1 = new ArrayList();
		
		// Homogeneous
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Customer> list3 = new ArrayList<Customer>();
		
		// 1. Adding Data
		
		list1.add(10);      // 0
		list1.add(10.2);	// 1
		list1.add('A');		// 2
		list1.add("Harry"); // 3
		list1.add(c1);		// 4
		
		list2.add("John");	// 0
		list2.add("Jennie");// 1
		list2.add("Jim");	// 2
		list2.add("Jack");	// 3
		list2.add("Joe");	// 4
		list2.add("John");	// 5
		list2.add("Joe");	// 6
		
		list3.add(c1);		// 0
		list3.add(c2);		// 1
		list3.add(c3);		// 2
		//list3.add("Kim");	// error
		
		// 2. View data by printing the list directly
		System.out.println("list1: ");
		System.out.println(list1);
		
		System.out.println("list2: ");
		System.out.println(list2);
		
		System.out.println("list3: ");
		System.out.println(list3);
		
		// 3. Get the Data i.e. single element from the list
		
		// Object is Parent class of all the classes in Java
		// Hence, as per RTP its reference variable can refer to any object in Java :)
		Object o = list1.get(3);
		System.out.println(o);
		
		String name = list2.get(2);
		System.out.println(name);
		
		Customer customer = list3.get(1);
		System.out.println(customer.toCSV());
		
		System.out.println("list2 before");
		System.out.println(list2);
		
		// 4. Update the data in the list
		list1.set(1, "Hello All");
		list2.set(1, "Jennie Watson");
		list3.set(0, c3);
		
		// 5. remove the data form the list -> single element
		list2.remove(3);
		//list2.clear(); // remove all the elements
		
		System.out.println("list2 after update and remove");
		System.out.println(list2);
		
		int idx = list2.indexOf("Jim");
		System.out.println("idx of Jim is: "+idx);
		
		if(list2.contains("Jim")) {
			System.out.println("Jim is in the list");
		}
		
		ArrayList<String> moreNames = new ArrayList<String>();
		moreNames.add("Mike");
		moreNames.add("Yamin");
		moreNames.add("Niki");
		
		moreNames.addAll(list2); // we can add all the elements from a list into another list
		System.out.println("moreNames is: "+moreNames.size());
		System.out.println(moreNames);
		
		// get the length of ArrayList
		int size = moreNames.size();
		System.out.println("Size is: "+size);
		System.out.println();
		
		// Iterating in ArrayList
		System.out.println("1. Using For Loop");
		for(int i=0;i<moreNames.size();i++) {
			System.out.println(moreNames.get(i));
		}
		
		System.out.println();
		
		System.out.println("2. Using Enhanced For Loop");
		for(String s : moreNames) {
			System.out.println(s);
		}
		
		System.out.println();
		
		
		System.out.println("3. Using Iterator");
		// Iterator iterates one by one with a method next
		Iterator<String> itr = moreNames.iterator();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			
			if(s.equals("Joe")) {
				itr.remove(); // remove can remove the element from the list directly
			}
		}
		
		System.out.println("moreNames now is: ");
		System.out.println(moreNames);
		System.out.println();
		
		System.out.println("4. Using ListIterator");
		ListIterator<String> listItr = moreNames.listIterator();
		
		while(listItr.hasNext()) {
			String s = listItr.next();
			System.out.println(s);
		}
		
		System.out.println("~~~~~~~");
		
		while(listItr.hasPrevious()) {
			String s = listItr.previous();
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("5. Using Enumeration");
		
		Enumeration<String> enm = Collections.enumeration(moreNames);
		while(enm.hasMoreElements()) {
			String s = enm.nextElement();
			System.out.println(s);
		}
		
		// Thread Safe Version of ArrayList :)
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Jennie");
		vector.add("Jim");
		vector.add("Jack");
		vector.add("Joe");
		
		System.out.println("vector is: ");
		System.out.println(vector);
		
	}

}
