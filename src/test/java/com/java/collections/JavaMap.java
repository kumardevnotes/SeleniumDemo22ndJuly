package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {

	public static void main(String[] args) {

		// Map is a collection which will store data in the form of key value pair
		// where keys should be unique but values may/may not be duplicate

		/*
		 * EmpName : John EmpId: 1122 EmpGender: 'M' EmpCity : "Denver"
		 * EmpSupervisorCity : "Denver"
		 */

		Map<String, String> myMap = new HashMap<String, String>();

		myMap.put("EmpName", "John");
		myMap.put("EmpId", "1122");
		myMap.put("EmpGender", "M");
		myMap.put("EmpCity", "Denver");
		myMap.put("EmpSupervisorCity", "Denver");
		myMap.put("EmpId", "3344");

		// null is accepted as a key but only once as shown below
		myMap.put(null, "ABC");
		myMap.put(null, "XYZ");

		// null can be used any number of times as a a value as shown below
		myMap.put("A", null);
		myMap.put("B", null);
		myMap.put("C", null);

		System.out.println(myMap);

		System.out.println("*****************");
		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("*****************");

		System.out.println(myMap.containsKey("EmpGender"));
		System.out.println(myMap.containsKey("EmpDoorNumber"));

		myMap.clear();

		System.out.println(myMap);

	}

}
