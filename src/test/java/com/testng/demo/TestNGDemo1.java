package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

//TestNGDemo1 contains SmokeTest cases
public class TestNGDemo1 {
	
	public static String empName = "Mike Tyson";
	public static int empId = 1122;
	
	@Test (groups = { "SmokeTest", "RegressionTest" })
	public void testcase1() {
		System.out.println("testCase1 passed");
		displayEmpdetails();
	}

	@Test (groups = { "SmokeTest" })
	public void testcase2() {
		displayEmpdetails();
		Assert.fail("Failed testCase2");
	}
	
	public void displayEmpdetails() {
		System.out.println("EmpName: "+empName);
		System.out.println("EmpId: "+empId);
	}
}
