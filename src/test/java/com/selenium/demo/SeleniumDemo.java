package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	/*
	 * Sample test automation Selenium Script
	 * 1. Launch chrome/edge
	 * 2. launch an app 
	 * 3. then close the browser
	 */

	public static void main(String[] args) throws InterruptedException {

		// Below step will check and download the matching version of driver file for
		// Chrome
		// Also sets the driver property -
		// System.setProperty("webdriver.chrome.driver","path to chromedriver.exe");

		runScript("Chrome");
		runScript("Edge");

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");

//		//To launch chrome browser
//		WebDriver driver = new ChromeDriver(options); // ChromeDriver implements WebDriver

	}

	private static void runScript(String browser) throws InterruptedException {
		WebDriver driver = null;
		
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch an app in the chrome that is opened from Script
		driver.get("https://www.speaklanguages.com/");
		
		//Script will wait 3 seconds
		Thread.sleep(3000); // 3000ms == 3seconds

		// close the browser
		driver.quit();
	}

}
