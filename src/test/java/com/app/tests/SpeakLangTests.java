package com.app.tests;

import org.testng.annotations.Test;
import com.app.pages.*;
import com.automation.utility.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SpeakLangTests {

	TestBase testBase = null;
	HomePage homePage = null;
	LogInPage loginPage = null;
	SignUpPage signUpPage = null;

	@BeforeMethod
	public void beforeMethod() {
		testBase = new TestBase();
		homePage = new HomePage(testBase);
		loginPage = new LogInPage(testBase);
		signUpPage = new SignUpPage(testBase);
	}

	@Test
	public void verifyHomePage() throws Exception {
		if (!homePage.verifyHomePageLoaded())
			System.out.println("homePage verified without issues");
		else {
			testBase.captureScreenshot("verifyHomePage_Failed");
			Assert.fail("Homepage verififcation failed. Please check");
		}
	}

	@Test
	public void verifySignUp() throws Exception {
		homePage.navigateToSignUpPage();
		signUpPage.signUPIntoApp();
		String successMessage = signUpPage.getSignupSuccessMessage();
		System.out.println(successMessage);
		signUpPage.loginIntoApp();
		//Assertion pedning - ToDo
	}

	@AfterMethod
	public void afterMethod() {
		testBase.closeBrowser();
	}

}
