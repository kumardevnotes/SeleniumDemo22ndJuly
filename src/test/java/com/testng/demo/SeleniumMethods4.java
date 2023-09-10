package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods4 {

	@Test
	public void launchApp() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");

		WebElement loginElement = driver.findElement(By.xpath("//a[.='Log in']"));
		loginElement.click();

		WebElement headerElement = driver.findElement(By.xpath("//h1[.='Log in to Speak Languages']"));
		System.out.println(headerElement.isDisplayed());

		WebElement checkBoxElement = driver.findElement(By.id("keep_logged_in_input"));
		System.out.println(checkBoxElement.isSelected());

		WebElement loginBtnElement = driver.findElement(By.id("login_button"));
		System.out.println(loginBtnElement.isEnabled());

		if (headerElement.isDisplayed() && !checkBoxElement.isSelected() && loginBtnElement.isEnabled()) {  // true && false && true
			System.out.println("Login page displayed successfully");
		} else {
			Assert.fail("Login page not displayed successfully");
		}

		Thread.sleep(3000);

		driver.quit();
	}

}
