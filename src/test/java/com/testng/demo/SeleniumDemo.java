package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class SeleniumDemo {
	
	WebDriver driver = null;
	
	@Parameters({ "browser" })
	@BeforeClass (alwaysRun = true)
	public void beforeClass(String browser) {
		switch (browser) { //Chrome
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}
		// to maximize the browser
		driver.manage().window().maximize();
	}

	@Test
	public void launchApp() throws Exception {

		// to launch an app in the chrome that is opened from Script
		driver.get("https://www.speaklanguages.com/");

		// Script will wait 3 seconds
		Thread.sleep(3000); // 3000ms == 3seconds
	}

	@AfterClass  (alwaysRun = true)
	public void afterClass() {
		// close the browser
		driver.quit();
	}

}
