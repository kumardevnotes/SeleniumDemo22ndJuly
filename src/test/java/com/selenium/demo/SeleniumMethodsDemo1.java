package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 1. Launch browser
		 * 2. Launch app https://speaklanguages.com
		 * 3. Click on login link
		 * 4. Enter email address and password and click on Login button
		 * 5. Then verify login error
		 * */
		//1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2.  Launch app https://speaklanguages.com
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		
		//3. Click on Login lnk
		WebElement loginLinkElement  = driver.findElement(By.linkText("Log in"));
		loginLinkElement.click();
		
		WebElement signUpLinkElement  = driver.findElement(By.partialLinkText("Sign up"));
		signUpLinkElement.click();
		
		//WebElement tagNameElement  = driver.findElement(By.tagName("div"));
		
		//4. Enter email address and password and click on Login button
		WebElement emailElemenet  = driver.findElement(By.name("email"));
		emailElemenet.sendKeys("test@gmail.com");
		
		WebElement pwdElement  = driver.findElement(By.id("password_input"));
		pwdElement.sendKeys("pwd4343433");
		
		WebElement loginButtonElement  = driver.findElement(By.id("login_button"));
		loginButtonElement.click();
		
		Thread.sleep(6000);
		
		// 5. Then verify login error
		boolean isErrorDisplayed  = driver.findElement(By.className("error_message")).isDisplayed();
		System.out.println(isErrorDisplayed);

		driver.quit();
	}

}
