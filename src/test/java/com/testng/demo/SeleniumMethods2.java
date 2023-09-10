package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SeleniumMethods2 {

	@Test
	public void launchApp() throws Exception {

		// Launching first tab
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		String pageTitle1 = "Speak Languages — Learn a new language online";

		// Launching second tab and switching to it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fb.com/");
		String window2 = driver.getWindowHandle();
		System.out.println(window2);
		String pageTitle2 = "Facebook – log in or sign up";

		Thread.sleep(3000);

		/*
		 * Whenever I am in SpeakLanaguges, Print Hello Whenever I am in facebook, Print
		 * Hi
		 */

		Set<String> openedWindows = driver.getWindowHandles();
		for (String openedWindow : openedWindows) {
			driver.switchTo().window(openedWindow);
			if (driver.getTitle().contains(pageTitle1))
				System.out.println("Hello! you are in SpeakLanguages");
			 else if (driver.getTitle().contains(pageTitle2))
				System.out.println("Hi! you are in Facebook");
			else 
				Assert.fail("you are in in any of the applications");
		}

		// driver.switchTo().window(window1);

		// close() closes current tab or window
		// driver.close();

		// Thread.sleep(3000);

		// driver.switchTo().window(window2);
		// Thread.sleep(3000);

		// quit() closes all the opened tabs/windows
		driver.quit();
	}

}
