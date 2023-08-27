package com.oops;

public class StudentClass2 extends SchoolClass{

	public static void main(String[] args) {
		//Method calling
		displayStdName();
		displayStdRollNum();
		
		displaySchoolName1();
		displaySchoolAddress1();
	}

	//Declaring static method
	private static void displayStdRollNum() {
		System.out.println(445566);
	}

	//Declaring static method
	private static void displayStdName() {
		System.out.println("Mike Tyson");
	}

}
