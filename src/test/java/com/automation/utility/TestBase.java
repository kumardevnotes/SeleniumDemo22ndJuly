package com.automation.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestBase {

	WebDriver driver = null;
	Properties props = new Properties();

	public TestBase() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String rootFolderPath = System.getProperty("user.dir");
		FileReader myFileObj = new FileReader(rootFolderPath + "/src/test/resources/appData.properties");
		props.load(myFileObj);
		
		driver.get(props.getProperty("appUrl"));
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterText(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public boolean isElementDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public void scrollToElement(By locator) {
		JavascriptExecutor jsObj = (JavascriptExecutor) driver;
		WebElement targetElement = driver.findElement(locator);
		jsObj.executeScript("arguments[0].scrollIntoView();", targetElement);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText().trim();
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void captureScreenshot(String screenShotName) throws IOException {

		// Fullpage screenshot
		String rootPath = System.getProperty("user.dir");
		// Call getScreenshotAs method to create image file
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// create a destination path
		File dest = new File(rootPath + "//Screenshots/" + screenShotName + ".png");
		// Copying from source to destination path
		FileHandler.copy(src, dest);

	}

	public void closeBrowser() {
		driver.quit();
	}

}
