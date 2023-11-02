package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.utility.TestBase;

public class HomePage {

	public By appLogo = By.id("logo");
	public By searchField = By.id("search_input");
	public By searchButton = By.id("search_submit");
	public By logInLink = By.linkText("Log in");
	public By signUpLink = By.linkText("Sign up");

	public By privacyPolicyLInk = By.linkText("Privacy policy");
	public By termsOfUseLink = By.linkText("Terms of use");
	public By contactUsLink = By.linkText("Contact us");
	
	
	public By loggedInUser = By.xpath("//li[@id='nav_user']/a");
	

	WebDriver driver;
	TestBase testBase;

	public HomePage(TestBase testBase) {
		this.testBase = testBase;
	}

	public boolean verifyHomePageLoaded() {
		boolean headerSectionDisplayed = testBase.isElementDisplayed(appLogo) && 
				testBase.isElementDisplayed(searchField) &&
				testBase.isElementDisplayed(searchButton) &&
				testBase.isElementDisplayed(logInLink) &&
				testBase.isElementDisplayed(signUpLink);

		testBase.scrollToElement(privacyPolicyLInk);

		boolean footerSectionDisplayed = testBase.isElementDisplayed(privacyPolicyLInk) &&
				testBase.isElementDisplayed(termsOfUseLink) && testBase.isElementDisplayed(contactUsLink);

		return headerSectionDisplayed && footerSectionDisplayed;
	}

	public void navigateToLoginPage() {
     testBase.clickElement(logInLink);
	}

	public void navigateToSignUpPage() {
     testBase.clickElement(signUpLink);
	}

	public String returnLoggedInUserName() {
		return testBase.getText(loggedInUser);
	}

}
