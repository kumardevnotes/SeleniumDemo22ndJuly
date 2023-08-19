package com.control.structures;

public class ArraysExample {

	public static void main(String[] args) {
	
		int empId = 3;
		
		empId =  3344;
		
		//System.out.println(empId);
		
		//Arrays will try to store multiple values or more than 1 values into a single variable
		
		
		//int[] empIds = {101, 102, 103, 104, 105};
		int empIds[] = {101, 102, 103, 104, 105}; // empIds.length - 1 ==> 5-1 = 4 
		
		/*
		 * empIds[0] =  101
		 * empIds[1] =  102
		 * empIds[2] =  103
		 * empIds[3] =  104
		 * empIds[4] =  105
		 * */
		
		//Declaring array with size 4
		int myEmpIds[] = new int[100];
		
		myEmpIds[0] = 101;
		myEmpIds[1] = 102;
		myEmpIds[2] = 103;
		myEmpIds[3] = 104;
		
		System.out.println("classic forloop starts below");
		
		for (int i = 0; i < myEmpIds.length; i++) { // 4 < 4
			System.out.println(myEmpIds[i]); // myEmpIds[3]
		}
		
		System.out.println("classic forloop ends above");
		
		
		
	   System.out.println("advanced forloop starts below");
		
		for (Integer myEmpId : myEmpIds) {  //int --> Integer
			System.out.println(myEmpId); 
		}
		
		System.out.println("advanced forloop ends above");
		
		String empCities[] = {"Newyork", "NewJersy", "NewDelhi", "Denver"};
		
		//empCities[4] = "Hyderabad";
		

		System.out.println("advanced forloop starts below");
			
			for (String empCity : empCities) {  //int --> Integer
				System.out.println(empCity); 
			}
			
		System.out.println("advanced forloop ends above");
		
		/*
		 * Arrays store more than one value into a single variable
		 * Arrays store only same type of data or homogeneous data
		 * Arrays are fixed in size.. that means you can not increase array size or store the values beyond arrays capacity
		 * adding/removing of Array elements is complex
		 * Unused memory will be created if we use arrays
		 * */
	
	}

}
