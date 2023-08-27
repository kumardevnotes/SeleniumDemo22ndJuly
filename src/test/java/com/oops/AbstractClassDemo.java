package com.oops;

public abstract class AbstractClassDemo {
	
	//Abstract class starts with abstract keyword of java
	//Abstract class contains both concrete and abstract methods
	//concrete method means method with body
	//abstract method means method with signature but no body

	//concrete method
	public void displayName() {
		System.out.println("John Legened");
	}
	
	//concrete method
	public void displayID() {
		System.out.println("1122");
	}
	
	//abstract method with abstract keyword
	public abstract void displayEmployeeAddress();

}
