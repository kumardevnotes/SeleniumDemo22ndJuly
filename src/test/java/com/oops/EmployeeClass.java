package com.oops;

public class EmployeeClass implements CompanyInterface{

	public static void main(String[] args) {
		EmployeeClass obj = new EmployeeClass();
		obj.employeeName();
		obj.employeeFullName("Kumar", "Modern");
		int empsal  = obj.empSal();
		System.out.println(empsal);
	}

	//concrete method
	@Override
	public void employeeName() {
	System.out.println("Mike Tyson");
	}

	@Override
	public void employeeFullName(String firstName, String lastName) {
	System.out.println("Fullname: "+firstName+lastName);
	}

	@Override
	public int empSal() {
		return 3000;
	}

}
