package com.testng.demo;

import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMethods9 {
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
	
		//Seleniun4  wait -  for PageLoad
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.get("https://www.speaklanguages.com/");
		
		//Selenium4 - implicit wait for the complete driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		

		//selenium4 - explicit wait - is used to make sure the button/link/image is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement signUpElement  = driver.findElement(By.linkText("Sign up"));
		
		//visibility of element
		wait.until(ExpectedConditions.visibilityOf(signUpElement));
		
		//button to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Sign In Btn")));
		
		//alert present
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		// Pollwait or FluentWait
		WebElement loginPagebtn = driver.findElement(By.id("revealed"));

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);

		fluentWait.until(d -> {
			loginPagebtn.click();
			return true;
		});

			Thread.sleep(4000);
		driver.quit();

	}

}
