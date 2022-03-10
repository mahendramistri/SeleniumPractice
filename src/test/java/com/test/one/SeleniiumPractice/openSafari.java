package com.test.one.SeleniiumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class openSafari {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.navigate().to("http://www.google.com/");

	}

}
