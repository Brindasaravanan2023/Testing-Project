package org.redbus;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Train {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.makemytrip.com/railways/");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(3000);
	   
	   WebElement findElement = driver.findElement(By.id("fromCity"));
	   
	   findElement.click();
	   
	   Thread.sleep(3000);
	   
	   WebElement element1 = driver.findElement(By.xpath("//input[@autocomplete='off']"));
	   
	   element1.sendKeys("Salem");
	   
	   Thread.sleep(3000);
	   
	   WebElement element2 = driver.findElement(By.xpath("//span[text()='Salem - All Stations']"));
	   
	   element2.click();
	   
	   Actions action = new Actions(driver);
	   
	   action.moveToElement(element2).perform();
	   
	   WebElement findElement2 = driver.findElement(By.id("toCity"));
	   
	   findElement2.click();
	   
	   Thread.sleep(3000);
	  
	   
	  

}
	
}
