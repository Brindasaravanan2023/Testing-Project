package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	static WebDriver driver;
	
	
	@Test
	public static void One() {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   
	  

	}
	
	@Test 
	public static void Two() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   
	   
	 
	  
	   
		   
		
	

}
	
}
