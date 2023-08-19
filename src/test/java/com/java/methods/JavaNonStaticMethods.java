package com.java.methods;

public class JavaNonStaticMethods {

	public static void main(String[] args) {
		
		JavaNonStaticMethods obj = new JavaNonStaticMethods();
		obj.displayEmpName();
		
		//calling a static method
		obj.displayEmpName();
		obj.displayEmpName();
		obj.displayEmpName();
		
		obj.displayEmpName("John Miller");
		obj.displayEmpName("Sam Josh");
		obj.displayEmpName("Sanjay Sharma");
		
		obj.displayEmpName("Hanari", "Carnes");
		
		//https://www.w3schools.com/sql/sql_select.asp
		
		
		int empSal = obj.getEmpSal(2500);
		System.out.println(empSal + " dollars");
		
		 empSal = obj.getEmpSal(3500);
		System.out.println(empSal + " dollars");
		
		obj.isEmployeeEligibleForGratuity(5); // Yes, Emp is eligible for gratuity , No, Emp is not eligible for gratuity
		
		obj.isEmployeeEligibleForGratuity(1);
		
		obj.isEmployeeEligibleForGratuity(4);
		
		obj.isEmployeeEligibleForGratuity(9); 
	}


	private void isEmployeeEligibleForGratuity(int empExpInYears) {
		if(empExpInYears >= 5) 
			System.out.println("Yes, Emp is eligible for gratuity");
		else 
			System.out.println("No, Emp is not eligible for gratuity");
	}

	// Declaring a static method without params
	public void displayEmpName() {
		System.out.println("EmpName without param: John Legened");
	}

	// Declaring a static method with String param
	public void displayEmpName(String empName) {
		System.out.println("EmpName with param: " + empName);
	}

	// Declaring a static method with String param
	public void displayEmpName(String firstName, String lastName) {
		System.out.println("EmpName with 2 params: " + firstName + " " + lastName);
		
		System.out.println("emp firstName: " + firstName);
		System.out.println("emp lastName: " +  lastName);
	}
	
	public int getEmpSal(int baseSal) {
		int incentive = 100; // 100 dollars
		return baseSal + incentive;
	}

}
