package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethods6 {

	@Test
	public void launchApp() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		
		WebElement emailElement = driver.findElement(By.id("login1"));
		emailElement.sendKeys("TestUser@gmail.com");
		
		WebElement signInBtnElement = driver.findElement(By.name("proceed"));
		signInBtnElement.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); // It clicks on OK button on the alert box
		//alert.dismiss(); // It clicks on cancel button on the alert box
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
