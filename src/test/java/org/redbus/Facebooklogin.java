package org.redbus;

import java.awt.AWTException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("username");
	   
	   driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
	    
	   

		

	}
	
}
