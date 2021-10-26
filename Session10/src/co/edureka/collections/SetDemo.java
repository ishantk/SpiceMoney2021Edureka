package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jennie");
		list.add("John");
		list.add("Joe");
		list.add("Jim");
		
		System.out.println("list is: ");
		System.out.println(list);
		System.out.println("Size is: "+list.size());
		
		System.out.println();
		
		//HashSet<String> set = new HashSet<String>();
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Joe");
		set.add("Jim");
		
		System.out.println("set is: ");
		System.out.println(set);
		System.out.println("Size is: "+set.size());
		
//		set.remove("Joe");
//		set.clear();
//		set.addAll(anotherSet);
		
		if(set.contains("Joe")) {
			System.out.println("Joe is in the set");
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
	}

}
