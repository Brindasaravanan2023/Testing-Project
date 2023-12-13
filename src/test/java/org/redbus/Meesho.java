package org.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.meesho.com/");
	   driver.manage().window().maximize();
	   
	}
	
	@Test
	public static void Two() throws InterruptedException, AWTException, IOException  {
	
	   
	   WebElement element1 = driver.findElement(By.xpath("//input[@type='text'][1]"));
	   
	   element1.sendKeys("Babydress");
	   
	   Robot robot = new Robot();
	   
	   robot.keyPress(KeyEvent.VK_ENTER);  
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   Thread.sleep(3000);
	   
	   WebElement element2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[3]/div[2]/div[2]/div/div[3]/a/div/div[2]/p"));
	   
	   element2.click();
	   
	   Thread.sleep(3000);
	   
	   for (int i = 1; i <=3; i++) {
		   
		   robot.keyPress(KeyEvent.VK_DOWN);
		   robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	   
	   Thread.sleep(3000);
	   
	   WebElement element3 = driver.findElement(By.xpath("//span[text()='0-1 Years']"));
	   
	   element3.click();
	   
	   Thread.sleep(3000);
	   
	   
	   WebElement element4 = driver.findElement(By.xpath("//span[text()='Buy Now']//preceding::span[1]"));
	   
	   element4.click();
	   
	   Thread.sleep(3000);
	   
	   
	    
	    
	    Actions action = new Actions(driver);
	    
	    
	    WebElement element5 = driver.findElement(By.xpath("//span[text()='Become a Supplier']"));
	    
	    action.moveToElement(element5).perform();
	    
	    element5.click();
	    
//	    TakesScreenshot screenshot = (TakesScreenshot) driver;
//	    
//	    File src = screenshot.getScreenshotAs(OutputType.FILE);
//	    
//	    File des = new File ("E:\\Users\\AdminB\\eclipse-workspace\\Mavenproject5\\test-output\\Screenshotfolder\\brinda.png");
//	    
//	    FileUtils.copyFile(src, des);
	    
	       	    
	  

}
	
}


