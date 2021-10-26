package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class RTP {

	public static void main(String[] args) {
		
		List<String> list;
		list = new ArrayList<String>();
		list = new Vector<String>();
		list = new Stack<String>();
		list = new LinkedList<String>();
		
		Queue<String> queue;
		queue = new PriorityQueue<String>();
		
		Set<String> set;
		set = new HashSet<String>();
		set = new LinkedHashSet<String>();
		set = new TreeSet<String>();
		
		Map<Integer, String> map;
		map = new HashMap<Integer, String>();
		map = new LinkedHashMap<Integer, String>();
		map = new TreeMap<Integer, String>();
		
		// Data Structures of Data Structures 
		HashMap<Integer, ArrayList<String>> map1;
		HashSet<Map<Integer, HashMap<String, String>>> set1;
		

	}

}
