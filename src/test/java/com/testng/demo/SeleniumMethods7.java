package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumMethods7 {
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
		driver.get("https://www.speaklanguages.com/");
		String parentWindow = driver.getWindowHandle();

		List<WebElement> langugeElements = driver.findElements(By.xpath("//p[@class='site_link']/a"));

		int count = 0;

		for (WebElement langElement : langugeElements) {
			String link = langElement.getAttribute("href");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(link);
			Thread.sleep(2);
			String pageTitle = driver.getTitle();

			if (pageTitle.contains("English"))
				count++;

			System.out.println(pageTitle);
			driver.close();
			driver.switchTo().window(parentWindow);
		}

		captureScreenshots("verifyLangLinks", driver);
		driver.quit();

		Assert.assertEquals(count == 1, true, "Language link verificatin failed");

		Thread.sleep(2000);

	}

	private void captureScreenshots(String screenShotName, WebDriver driver) throws IOException {

		//Fullpage screenshot
		String rootPath = System.getProperty("user.dir");
		// Call getScreenshotAs method to create image file
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// create a destination path
		File dest = new File(rootPath + "//Screenshots/" + screenShotName + ".png");
		// Copying from source to destination path
		FileHandler.copy(src, dest);
		
		//Element level screenshot
		WebElement logoElement = driver.findElement(By.id("logo"));
		File src2 = logoElement.getScreenshotAs(OutputType.FILE);
		File dest2 = new File(rootPath + "//Screenshots/speakLanguages" + ".png");

		FileHandler.copy(src2, dest2);
	}

}
