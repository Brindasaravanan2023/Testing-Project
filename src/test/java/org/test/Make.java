package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make {
	
static WebDriver driver;
	
	@Test
	public static void One() throws InterruptedException, AWTException {
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://www.makemytrip.com/");
	   driver.manage().window().maximize();
	   
	   WebElement element1 = driver.findElement(By.xpath("//span[text()='Hotels'][1]"));
	   
	   element1.click();
	   
	   Thread.sleep(3000);
	   
	   WebElement element2 = driver.findElement(By.xpath("//span[text()='City, Property name or Location']"));
	   
	   element2.click();
	   
	   Thread.sleep(3000);
	   
	   WebElement element3 = driver.findElement(By.xpath("//input[@autocomplete='nope']"));
	   
	   element3.sendKeys("Chennai");
	   
	   Thread.sleep(3000);
	   
	   WebElement element4 = driver.findElement(By.xpath("//p[text()='Sholinganallur, Chennai']"));
	   
	   element4.click();
	   
	   Thread.sleep(3000);
	   
       Robot robot = new Robot();
	   
	   for (int i = 1; i <=3; i++) {
		
		   robot.keyPress(KeyEvent.VK_DOWN);
		   robot.keyRelease(KeyEvent.VK_DOWN);
	}
	     
	   WebElement element5 = driver.findElement(By.xpath("//div[text()='30'][1]"));
	    
	   element5.click();
	   
	   WebElement element6 = driver.findElement(By.xpath("//div[text()='31'][1]"));
	    
	   element6.click();
	   
	   WebElement element7 = driver.findElement(By.xpath("//span[@data-testid='children_count']"));
	   
	   element7.click();
	   
	   WebElement element8 = driver.findElement(By.xpath("//li[@data-cy='GuestSelect$$_323'][2]"));
	   
	   element8.click();
	   
	   WebElement element9 = driver.findElement(By.xpath("//button[text()='Apply']"));
	   
	   element9.click();
	   
	   WebElement element10 = driver.findElement(By.xpath("//span[text()='Price per Night']"));
	   
	   element10.click();
	   
	   WebElement element11 = driver.findElement(By.xpath("//li[@class='ppn__list--item'][1]"));
	   
	   element11.click();
	   
	   WebElement element12 = driver.findElement(By.xpath("//button[text()='Search']"));
	   
	   element12.click();

}
	
}
