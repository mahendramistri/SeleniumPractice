package com.test.one.SeleniiumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenFirefox {

	public static void main(String[] args) {
		// System Property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver.exe");

		// Initialize Gecko Driver using Desired Capabilities Class
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);

		// Launch Website
		driver.navigate().to("http://www.javatpoint.com/");

		// Click on the Custom Search text box and send value
		driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");

		driver.quit();
	}

}
