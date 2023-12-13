package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	static WebDriver driver;
		
	@Test
	public static void One() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	  
	}
	
	@Test(enabled = true)
	private void Two() throws InterruptedException {
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		
		element.click();
		

	}
	
	@Test
	private void Three() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   

	}
	
	   
	}
		
	
		
	
	

	

