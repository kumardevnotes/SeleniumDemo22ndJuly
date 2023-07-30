package com.java.demo;

public class JavaStringDemo1 {

	public static void main(String[] args) {
		
		String empFirstName = "John";
		String empLastName = "Legend";
		
		int empId = 1257;
		int empSal = 1000;
		int empIncentive = 200;
		
		
		System.out.println(empId + empSal + empIncentive + 400 + empFirstName + empLastName ); // int + int + int + String + String --> String
		
		System.out.println(empFirstName + empLastName); //String + String --> String .. valid
		
		System.out.println(empSal + empIncentive); // int + int --> int .. valid
		
		System.out.println(empFirstName + empLastName + empId); // String + String + int --> String
		
		System.out.println(empFirstName + empLastName + empId + empSal + empIncentive); // String + String + int + int + int --> String
		
		
	}

}
