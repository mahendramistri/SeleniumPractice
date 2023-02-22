package com.test.one.SeleniiumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		 
		  System.setProperty("webdriver.chrome.driver", ReadProperties.getProperties("chromepath"));
		    WebDriver driver=new ChromeDriver();
			String url = ReadProperties.getProperties("url");
		    driver.navigate().to(url);
		    driver.quit();
	    }  
	}
