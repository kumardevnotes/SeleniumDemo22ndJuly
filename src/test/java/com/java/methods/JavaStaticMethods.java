package com.java.methods;

public class JavaStaticMethods {

	public static void main(String[] args) {
		//calling a static method
		displayEmpName();
		displayEmpName();
		displayEmpName();
		
		displayEmpName("John Miller");
		displayEmpName("Sam Josh");
		displayEmpName("Sanjay Sharma");
		
		displayEmpName("Hanari", "Carnes");
		
		//https://www.w3schools.com/sql/sql_select.asp
		
		
		int empSal = getEmpSal(2500);
		System.out.println(empSal + " dollars");
		
		 empSal = getEmpSal(3500);
		System.out.println(empSal + " dollars");
		
		isEmployeeEligibleForGratuity(5); // Yes, Emp is eligible for gratuity , No, Emp is not eligible for gratuity
		
		isEmployeeEligibleForGratuity(1);
		
		isEmployeeEligibleForGratuity(4);
		
		isEmployeeEligibleForGratuity(9); 
	}


	private static void isEmployeeEligibleForGratuity(int empExpInYears) {
		if(empExpInYears >= 5) 
			System.out.println("Yes, Emp is eligible for gratuity");
		else 
			System.out.println("No, Emp is not eligible for gratuity");
	}

	// Declaring a static method without params
	public static void displayEmpName() {
		System.out.println("EmpName without param: John Legened");
	}

	// Declaring a static method with String param
	public static void displayEmpName(String empName) {
		System.out.println("EmpName with param: " + empName);
	}

	// Declaring a static method with String param
	public static void displayEmpName(String firstName, String lastName) {
		System.out.println("EmpName with 2 params: " + firstName + " " + lastName);
		
		System.out.println("emp firstName: " + firstName);
		System.out.println("emp lastName: " +  lastName);
	}
	
	public static int getEmpSal(int baseSal) {
		int incentive = 100; // 100 dollars
		return baseSal + incentive;
	}

}
