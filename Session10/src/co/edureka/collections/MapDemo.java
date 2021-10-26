package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> employees = new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> employees = new LinkedHashMap<Integer, String>();
		//TreeMap<Integer, String> employees = new TreeMap<Integer, String>();
		//Hashtable<Integer, String> employees = new Hashtable<Integer, String>(); // Synchronized + no nulls accepted
		
		// Insert Operation
		employees.put(101, "John");
		employees.put(333, "Anna");
		employees.put(245, "Dave");
		employees.put(121, "Leo");
		employees.put(345, "Sim");
		
		//Update Operation
		employees.put(121, "John"); 

		//employees.put(null, "Tim");
		//employees.put(875, null);
		
		
		System.out.println(employees);
		
		String name = employees.get(101);
		System.out.println("name is: "+name);
		
		if(employees.containsKey(345)) {
			System.out.println("Key 345 exists");
		}
		
		if(employees.containsValue("Anna")) {
			System.out.println("Anna Exists");
		}
		
		Set<Integer> keys = employees.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = employees.get(key);
			System.out.println(key+"\t"+value);
		}
		
		//employees.remove(101);
		//employees.clear();
		
		System.out.println(employees.size());

	}

}
