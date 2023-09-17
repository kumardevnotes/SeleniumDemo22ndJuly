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

public class SpeakLangTests {

	TestBase testBase = null;
	HomePage homePage = null;
	LogInPage loginPage = null;
	SignUpPage signUpPage = null;
	Properties props = new Properties();

	@BeforeMethod
	public void beforeMethod() throws IOException {
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
		String successMessageExpected  = "Thank you — now activate your account!";
		homePage.navigateToSignUpPage();
		signUpPage.signUPIntoApp();
		String successMessageActual = signUpPage.getSignupSuccessMessage();
		System.out.println(successMessageActual);
		signUpPage.loginIntoApp();
		testBase.captureScreenshot("verifySignUp");
		Assert.assertEquals(successMessageActual, successMessageExpected, "Fail to Signup");
	}
	
	@Test
	public void verifyAppLogin() throws Exception {
		
		String rootFolderPath = System.getProperty("user.dir");
		FileReader myFileObj = new FileReader(rootFolderPath + "/src/test/resources/appData.properties");
		props.load(myFileObj);

		homePage.navigateToLoginPage();
		loginPage.loginIntoApp(props.getProperty("appUserEmailID"), props.getProperty("apppassword"));
	}

	@AfterMethod
	public void afterMethod() {
		testBase.closeBrowser();
	}

}
