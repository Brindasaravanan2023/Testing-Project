package org.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	   driver.manage().window().maximize();
	   
	  WebElement element1 = driver.findElement(By.xpath("//input[@id='search']"));
	  
	  element1.sendKeys("Vijay Ranjithameye song");
	  
	  WebElement element2 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	  
	  element2.click();
	  
	  Thread.sleep(3000);
	  
	  WebElement element3 = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
	  
	  element3.click();
	  
	  
	  
	  
	  
}
	
}
