package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaCollectionsSet {

	public static void main(String[] args) {

		// List, Set, Map --> Interface has all the method declarations which can be
		// used by its implementing class

		// EmpDetails EmpName, EmpId, EmpGender, EmpSal, EmpCity
		// Set collection does not follow insertion order
		// Set does not allow duplicate values

		Set empDetails = new HashSet(); // HashSet implements Set internally

		empDetails.add("John Legend");
		empDetails.add(112233);
		empDetails.add('M');
		empDetails.add(2000);
		empDetails.add("Denver");

		System.out.println(empDetails);

		empDetails.add('M');
		empDetails.add(2000);
		empDetails.add("Denver");

		System.out.println(empDetails);

		// empDetails.add(3, "80231"); //Not acceptedin Set

		for(Object obj : empDetails) {
		System.out.print(obj+ " * ");
	}

		System.out.println(empDetails.contains("NewYork"));

		Set empAdditionalDetails = new HashSet();
		empAdditionalDetails.add("80231");
		empAdditionalDetails.add("5");

		System.out.println(empDetails);

		empDetails.addAll(empAdditionalDetails);

		System.out.println(empDetails);

		empDetails.remove(2);
		empDetails.remove("Denver");

		System.out.println(empDetails);

		System.out.println(empDetails.isEmpty());

		System.out.println(empDetails.size());

		empDetails.clear();

		System.out.println(empDetails);

		System.out.println(empDetails.isEmpty());

		System.out.println(empDetails.size());

	}

}
