package com.testng.demo;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethods8 {
	/*
	 * TestCase Title: Verify the language links on the homescreen
	 * 
	 * Steps: 1. Launch Chrome 2. Launch app https://www.speaklanguages.com/ 3.
	 * Verify the lang-links available on the homescreen
	 */

	@Test
	public void verifyLangLinks() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		

		WebElement signUpElement  = driver.findElement(By.linkText("Sign up"));
		signUpElement.click();
		
		Thread.sleep(2000);
		
		WebElement genderDDElement  = driver.findElement(By.name("sex"));
		Select genderDD =  new Select(genderDDElement);
		
		/*
		//selectByIndex
		genderDD.selectByIndex(1);
		Thread.sleep(2000);
		genderDD.selectByIndex(2);
		Thread.sleep(2000);
		genderDD.selectByIndex(1);
		Thread.sleep(4000);*/
		
		//selectByValue
		genderDD.selectByValue("Male");
		Thread.sleep(2000);
		genderDD.selectByValue("Female");
		Thread.sleep(2000);
		genderDD.selectByValue("Male");
		Thread.sleep(4000);
		
		//selectByVisibleText
		genderDD.selectByVisibleText("Male");
		Thread.sleep(2000);
		genderDD.selectByVisibleText("Female");
		Thread.sleep(2000);
		genderDD.selectByVisibleText("Male");
		
		Thread.sleep(4000);
		driver.quit();

	}

}
