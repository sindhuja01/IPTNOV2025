package com.Maven_Project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class BaseClass {

	public static WebDriver driver;

	protected static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
			    driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			Assert.fail("Error in launching the browser");
		}
		driver.manage().window().maximize();
		return driver;
	}

protected static void launchUrl(String url) {
	try {
		driver.get(url);
	}catch(Exception e) {
		Assert.fail("Error in launching the url");
	}
}
protected static void passInput(WebElement element, String value) {
	try {
		element.sendKeys(value);
		
	}catch(Exception e) {
		Assert.fail("Error in value passing");
	}
}




