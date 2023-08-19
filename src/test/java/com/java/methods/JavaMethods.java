package com.java.methods;

public class JavaMethods {
	
	static int empId = 1122;
	int empSalary = 1000; //non-static

	public static void main(String[] args) {
		
		System.out.println("execution stars from main()");
		
		System.out.println(empId);
		
		//A standard expression to create object of a class
		JavaMethods obj = new JavaMethods();
		//Calling a non-static method inside main() by using class object
		obj.printEmpSal();
		
		//Calling a static method inside main() without using class object
		printEmpName();
		
		System.out.println("execution ends in main()");
		
	}
	
	//Declaring a non-static method
	public void printEmpSal() {
		System.out.println(empSalary);
	}
	
	//Declaring a static method
	public static void printEmpName() {
		System.out.println("John Legend");
		System.out.println("John Legend");
		System.out.println("John Legend");
		System.out.println("John Legend");
		System.out.println("John Legend");
	}

}
