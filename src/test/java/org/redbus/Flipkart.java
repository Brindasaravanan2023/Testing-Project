package org.redbus;

import java.awt.AWTException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	      
	   WebElement element = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']//preceding::input[1]"));
	   
	   element.sendKeys("I Phone 14promax");
	   
	   WebElement element2 = driver.findElement(By.id("nav-search-submit-button"));
	   
	   element2.click();
	   
	   WebElement element3 = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (256 GB) - Deep Purple'][1]"));
	   
	   element3.click();
	   
	
	// Window handles Concept
	   
	   Set<String> allwindow = driver.getWindowHandles();
	   
	   System.out.println(allwindow);
	   
	   List<String> eachwindow = new LinkedList<String>();
	   
	   eachwindow.addAll(allwindow);
	   
	   String parentwindow = eachwindow.get(0);
	   
	   driver.switchTo().window(parentwindow);	
	   
	   Thread.sleep(3000);
	     
	   WebElement element4 = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (256 GB) - Space Black']"));
	   
	   element4.click();
	   
       String childwindow = eachwindow.get(1);
	   
	   driver.switchTo().window(childwindow);
	      

}
	
	
}
