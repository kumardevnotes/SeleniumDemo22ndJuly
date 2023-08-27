package com.oops;

public class ConstructorsDemo {
	
	//Creating class constructor with the name of the class as shown below
	//If you create an object for your class, then this constructor will be called automatically
	//Default constructor
	ConstructorsDemo(){
		System.out.println("I am a default constructor!");
	}
	
	//Parameterized constructor
	ConstructorsDemo(String message){
		System.out.println("I am parameterized constructor with message "+message);
	}

	public static void main(String[] args) {
		ConstructorsDemo obj = new ConstructorsDemo();
		obj.displayEmpName();
		obj.displayEmpTaxStatus(3000);
		
		ConstructorsDemo obj2 = new ConstructorsDemo("Hello All!");
	}

	public void displayEmpName() {
		System.out.println("John Doe");
	}

	public void displayEmpTaxStatus(int empSal) {
		if (empSal > 2500)
			System.out.println("Emp has to pay the tax of 10%");
		else
			System.out.println("Emp no to pay the tax");
	}

}
