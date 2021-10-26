package co.edureka.collections;

import java.util.TreeMap;

public class MapUseCase {

	public static void main(String[] args) {
		
		TreeMap<String, TreeMap<String, Integer>> covidCases = new TreeMap<String, TreeMap<String,Integer>>();
		
		
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.put("active",1233);
		map1.put("confirmed",345);
		map1.put("recovered",15467);
		
		TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("active",3562);
		map2.put("confirmed",1345);
		map2.put("recovered",215467);
		
		TreeMap<String, Integer> map3 = new TreeMap<String, Integer>();
		map3.put("active",3233);
		map3.put("confirmed",1345);
		map3.put("recovered",515467);
		
		covidCases.put("Maharashtra", map1);
		covidCases.put("Punjab", map2);
		covidCases.put("Himachal", map3);
		
		// TASK:
		// Sort the covidCases Map as per active cases (State with highest active cases to lowest)

		// TASK:
		// filtering: filter the data i.e. just the active cases or confirmed cases or recovered
		//			  take the input from user -> (active, confirmed or recovered)
		

	}

}
