package com.testng.demo;

import org.testng.annotations.Test;

//TestNGDemo2 contains RegressionTest cases
public class TestNGDemo2 {
	
	public static String empName = "Json Derulo";
	public static int empId = 4466;
	
	@Test (groups = { "RegressionTest" })
	public void testcase3() {
		System.out.println("testCase3 passed");
		displayEmpdetails();
	}

	@Test (groups = { "RegressionTest" })
	public void testcase4() {
		displayEmpdetails();
	}
	
	@Test (groups = { "RegressionTest" })
	public void testcase5() {
		displayEmpdetails();
	}
	
	public void displayEmpdetails() {
		System.out.println("EmpName: "+empName);
		System.out.println("EmpId: "+empId);
	}
}
