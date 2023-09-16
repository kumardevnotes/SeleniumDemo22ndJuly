package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.utility.TestBase;
import com.github.javafaker.Faker;

public class SignUpPage {
	
	public By firstNameField = By.id("first_name");
	public By lastNameField = By.name("last_name");
	public By emailAdressField = By.name("email");
	public By pwdField = By.name("password");
	
	public By genderLocator = By.name("sex");
	
	public By dayLocator = By.name("dob_day");
	public By monthLocator = By.name("dob_month");
	public By yearLocator = By.name("dob_year");
	
	public By signUpBtn = By.xpath("//input[@value='Sign up']");
	public By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");
	
	
	
	public static String emailAddress  = "";
	public static String pwd  = "";

	WebDriver driver;
	TestBase testBase;

	public SignUpPage(TestBase testBase) {
		this.testBase = testBase;
	}

	public void signUPIntoApp() throws Exception {
		
		Faker faker = new Faker();
		
		testBase.enterText(firstNameField, faker.name().firstName());
		testBase.enterText(lastNameField, faker.name().lastName());
		
		emailAddress = faker.internet().emailAddress();
		testBase.enterText(emailAdressField, emailAddress);
		
		pwd = "PwdMike1122";
		testBase.enterText(pwdField, pwd);
		
		WebElement genderElement  = testBase.getElement(genderLocator);
		Select genderDD = new Select(genderElement);
		genderDD.selectByVisibleText("Male");
		
		WebElement dayElement  = testBase.getElement(dayLocator);
		Select dayDD = new Select(dayElement);
		dayDD.selectByVisibleText("10");
		
		WebElement monthElement  = testBase.getElement(monthLocator);
		Select monthDD = new Select(monthElement);
		monthDD.selectByVisibleText("June");
		
		WebElement yearElement  = testBase.getElement(yearLocator);
		Select yearDD = new Select(yearElement);
		yearDD.selectByVisibleText("1988");
		
		Thread.sleep(5000);
		
		testBase.clickElement(signUpBtn);
		
		Thread.sleep(8000);
	}

	public String getSignupSuccessMessage() {
		return testBase.getText(thankYouMessage);
	}
}
