package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

//https://www.tutorialspoint.com/testng/testng_basic_annotations.htm

public class AllAnnotationsDemo {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executed: beforeSuite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executed: beforeClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Executed: beforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executed: beforeMethod");
	}

	@Test
	public void testCase1() {
		System.out.println("Passed: testCase1");
	}

	@Test
	public void testCase2() {
		System.out.println("Passed: testCase2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executed: afterMethod");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Executed: afterTest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executed: afterClass");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Executed: AfterSuite");
	}

}
