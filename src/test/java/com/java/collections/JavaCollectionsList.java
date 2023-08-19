package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionsList {

	public static void main(String[] args) {
		
		//List, Set, Map  --> Interface has all the method declarations which can be used by its implementing class
		
		//EmpDetails EmpName, EmpId, EmpGender, EmpSal, EmpCity
		//List collection follows insertion order
		//List accepts duplicate values
		
		List empDetails = new ArrayList(); //ArrayList implements List internally
		
		empDetails.add("John Legend");
		empDetails.add(112233);
		empDetails.add('M');
		empDetails.add(2000);
		empDetails.add("Denver");
		
		empDetails.add('M');
		empDetails.add(2000);
		empDetails.add("Denver");

		 System.out.println(empDetails);

		empDetails.add(0, "Manager");
		
       System.out.println(empDetails);
		
//		for(Object obj : empDetails) {
//			System.out.print(obj+ " * ");
//		}
       
       System.out.println(empDetails.contains("NewYork"));
       
       List empAdditionalDetails = new ArrayList();
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
