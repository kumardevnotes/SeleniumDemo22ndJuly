package com.app.tests;

import org.testng.annotations.Test;
import com.app.pages.*;
import com.automation.utility.TestBase;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AppTests {

	//Declare the class objects
	TestBase testBase = null;
	HomePage homePage = null;
	LogInPage loginPage = null;
	SignUpPage signUpPage = null;
	
	Properties props = new Properties();

	@BeforeMethod
	public void beforeMethod() throws IOException {
		// Creating object and assigning the created object to the existing obj variable
		//Initializing the objects
		testBase = new TestBase();
		homePage = new HomePage(testBase);
		loginPage = new LogInPage(testBase);
		signUpPage = new SignUpPage(testBase);
	}

	@Test
	public void verifyUserName() throws Exception {
		
		String rootFolderPath = System.getProperty("user.dir");
		FileReader myFileObj = new FileReader(rootFolderPath + "/src/test/resources/appData.properties");
		props.load(myFileObj);
		
		String userEmailID = props.getProperty("appUserEmailID");
		String password = props.getProperty("apppassword");;
		String loggedInUserNameExpected = props.getProperty("appUserName");;
		
		homePage.navigateToLoginPage();
		loginPage.loginIntoApp(userEmailID, password);
		String loggedInUserActual = homePage.returnLoggedInUserName();
		
		//Assert.assertEquals(loggedInUserActual, loggedInUserNameExpected, "userName verification failed! Please check");
		
		if(loggedInUserActual.equals(loggedInUserNameExpected)) {
			System.out.println("username verification is successful!");
		}
		else {
			testBase.captureScreenshot("verifyUserName_failed");
			Assert.fail("userName verification failed! Please check");
		}
		
		System.out.println("Testcase passed");
	}


	@AfterMethod
	public void afterMethod() {
		testBase.closeBrowser();
	}

}
