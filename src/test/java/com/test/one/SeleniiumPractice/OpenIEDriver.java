package com.test.one.SeleniiumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEDriver {

	public static void main(String[] args) {
		  // System Property for IEDriver   
        System.setProperty("webdriver.ie.driver", "D:\\IEDriver\\IEDriverServer.exe");  
          
           // Instantiate a IEDriver class.       
        WebDriver driver=new InternetExplorerDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.google.com/");  
          
           //Maximize the browser  
          driver.manage().window().maximize();  
            
           // Click on the search text box and send value  
        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
              
           // Click on the search button  
        driver.findElement(By.name("btnK")).click();  
            

	}

}
