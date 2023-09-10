package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SeleniumMethods3 {

	@Test
	public void launchApp() throws Exception {

		String appUserEmailID = "johnnitesh2@gmail.com";
		String apppassword = "Testing@123";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
	
		WebElement loginElement  = driver.findElement(By.xpath("//a[.='Log in']"));
		loginElement.click();
		
		WebElement emailElement  = driver.findElement(By.id("email_input"));
		emailElement.sendKeys(appUserEmailID);
		
		WebElement pwdElement  = driver.findElement(By.id("password_input"));
		pwdElement.sendKeys(apppassword);
		Thread.sleep(3000);
		
		emailElement.clear();
		pwdElement.clear();
		Thread.sleep(3000);
		
		emailElement.sendKeys(appUserEmailID);
		pwdElement.sendKeys(apppassword);
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_button")).click();

		Thread.sleep(7000);
		
		WebElement loggedInUserElement  = driver.findElement(By.xpath("//li[@id='nav_user']/a"));
		System.out.println("LoggedIn UserName: " + loggedInUserElement.getText());
		
		WebElement headerElement  = driver.findElement(By.xpath("//div[@id='community']/h1"));
		System.out.println("Text captured from application " + headerElement.getText());
		
		System.out.println("Attribute values of href: " + loggedInUserElement.getAttribute("href"));
		System.out.println("page title: " + driver.getTitle());
		System.out.println("current page url: " + driver.getCurrentUrl());
		//System.out.println("get source " + driver.getPageSource());

		driver.quit();
	}

}
