package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.utility.TestBase;

public class LogInPage {
	
	public By emailAddressField = By.id("email_input");
	public By pwdField = By.id("password_input");
	public By loginBtn = By.id("login_button");

	
	WebDriver driver;
	TestBase testBase;

	public LogInPage(TestBase testBase) {
		this.testBase = testBase;
	}
	
	public void loginIntoApp(String emailAddress, String pwd) {
		testBase.enterText(emailAddressField, emailAddress);
		testBase.enterText(pwdField, pwd);
		testBase.clickElement(loginBtn);
	}
	
}
