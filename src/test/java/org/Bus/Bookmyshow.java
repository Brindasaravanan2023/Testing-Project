package org.Bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookmyshow {

static WebDriver driver;	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://in.bookmyshow.com/explore/home/salem");
	   driver.manage().window().maximize();
	   
	   
	   WebElement element1 = driver.findElement(By.xpath("//div[text()='Ponniyin Selvan - Part 2']"));
	   
	   element1.click();
	   
	   Thread.sleep(3000);
	   
	   WebElement element2 = driver.findElement(By.xpath("//span[text()='Book tickets'][1]"));
	   
	   element2.click();
	   
	   
	   
	  
	   
	   
	   
	   
	   
}
	

	
}
