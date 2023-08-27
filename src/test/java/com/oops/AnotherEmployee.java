package com.oops;

public class AnotherEmployee implements CompanyInterface {

	public static void main(String[] args) {
		AnotherEmployee obj = new AnotherEmployee();
		obj.employeeName();
	    obj.employeeFullName("Mike", "Miller");
	    System.out.println(obj.empSal());
	}

	@Override
	public void employeeName() {
	System.out.println("Printing employee name...");
	System.out.println("John Miller");
	}

	@Override
	public void employeeFullName(String firstName, String lastName) {
	System.out.println(String.format("The employee fullname is %s %s", firstName, lastName ));
	}

	@Override
	public int empSal() {
		int bonus = 1000;
		int finalSal = 2000 + bonus;
		return finalSal;
	}

}
