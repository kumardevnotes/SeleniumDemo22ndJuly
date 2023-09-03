package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoWithXPath {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2.  Launch app https://speaklanguages.com
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		
		//3. Click on Login lnk
		WebElement loginLinkElement  = driver.findElement(By.xpath("//a[.='Log in']"));
		loginLinkElement.click();
		
		WebElement signUpLinkElement  = driver.findElement(By.xpath("//a[.='Sign up']"));
		//signUpLinkElement.click();
		
		//WebElement tagNameElement  = driver.findElement(By.tagName("div"));
		
		//4. Enter email address and password and click on Login button
		WebElement emailElemenet  = driver.findElement(By.xpath("//input[@type='email']"));
		emailElemenet.sendKeys("test@gmail.com");
		
		WebElement pwdElement  = driver.findElement(By.xpath("//input[@name='password']"));
		pwdElement.sendKeys("pwd4343433");
		
		WebElement loginButtonElement  = driver.findElement(By.xpath("//input[@id='login_button']"));
		loginButtonElement.click();
		
		Thread.sleep(6000);
		
		// 5. Then verify login error
		boolean isErrorDisplayed  = driver.findElement(By.xpath("//li[@class='error_message']")).isDisplayed();
		System.out.println(isErrorDisplayed);

		driver.quit();
	}

}
