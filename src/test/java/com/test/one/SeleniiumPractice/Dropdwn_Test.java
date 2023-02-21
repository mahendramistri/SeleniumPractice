package com.test.one.SeleniiumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdwn_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/dell/Documents/Drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		// expected wait condition

		WebDriverWait wait = new WebDriverWait(driver, 30);
		By elem_dynamic = By.name("country");

		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		wait.until(ExpectedConditions.presenceOfElementLocated(elem_dynamic));
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("antarctica");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
}
