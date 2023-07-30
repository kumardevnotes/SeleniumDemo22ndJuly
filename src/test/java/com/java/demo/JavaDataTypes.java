package com.java.demo;

public class JavaDataTypes {

	public static void main(String[] args) {
		// EmpDetails: empName, empId, empSal, empIncentive, empGender, empAddress, empMaritalStatus
		
		String empName = "John Doe";
		int empId =  1122; // ... -3 -2 -1 0 1 2 3 4 ...infinite
		
		float empSal =  1000.406565768686868989898f;
		double empIncentive = 300.76767676767557798798989898;
		
		char empGender = 'M'; //'F'
		
		String empAddress = "Mr John Smith. 132, My Street, Kingston, New York 12401.";
		
		boolean empMaritalStatus = true; //false
		
		System.out.println(empName + " : " + empId + " : " + empSal + " : " + empIncentive + " : " +empGender+ " : " + empAddress + " : " + empMaritalStatus );

	}

}
