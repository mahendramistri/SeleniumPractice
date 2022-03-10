package com.test.one.SeleniiumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		 
		  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();    
		    driver.navigate().to("http://www.google.com/");   
		    driver.quit();
	    }  
	}
