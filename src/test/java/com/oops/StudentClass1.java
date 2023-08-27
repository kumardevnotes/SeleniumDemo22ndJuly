package com.oops;

             //SubClass      extends SuperClass
            //ChildClass extends ParentClass
public class StudentClass1 extends SchoolClass {
	
	//Instance variable
	int pinCode =  12401;

	public static void main(String[] args) {
		//non-statc Method calling by creating an object
		
		StudentClass1 myObj = new StudentClass1(); // Standard expression to create an object of a class
//		myObj.displayStdName();
//		myObj.displayStdRollNum();
//		
//		myObj.displaySchoolName();
//		myObj.displaySchoolAddress();
		myObj.printPincode();
	}

	//Declaring a non-static method
	private void displayStdRollNum() {
		System.out.println(112233);
	}

	//Declaring non-static method
	private void displayStdName() {
		System.out.println("John Legend");
	}
	
	public void printPincode(){
	 System.out.println(this.pinCode);
	 System.out.println(super.pinCode);
	 System.out.println(pinCode);
	}

}
