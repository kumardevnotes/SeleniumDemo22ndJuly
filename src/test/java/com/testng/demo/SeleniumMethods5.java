package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethods5 {

	@Test
	public void launchApp() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(4000);
		
		//to perform Scroll on application using Selenium
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		jsObj.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		
		jsObj.executeScript("window.scrollBy(0,-350)", "");

		WebElement targetElement = driver.findElement(By.xpath("//a[.='Privacy policy']"));
		jsObj.executeScript("arguments[0].scrollIntoView();", targetElement);
		
		
		WebElement englishDDElement = driver.findElement(By.id("language_menu"));
		jsObj.executeScript("arguments[0].scrollIntoView();", englishDDElement);
		
		Actions action = new Actions(driver);
		action.moveToElement(englishDDElement).build().perform();
		
		/*WebElement srcElement = driver.findElement(By.id("language_menu"));
		WebElement destinAtionElement = driver.findElement(By.id("language_menu"));
		action.dragAndDrop(srcElement, destinAtionElement).build().perform();*/

		Thread.sleep(4000);

		driver.quit();
	}

}
