package org.redbus;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bus {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://www.redbus.in/");
	   driver.manage().window().maximize();
	   
	   WebElement element = driver.findElement(By.xpath("//input[@id='src']"));
	   
	   element.sendKeys("Salem");
	   
	   Robot robot = new Robot();
  
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='dest']"));
	   
	   element2.sendKeys("Chennai");
	   
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	   WebElement element3 = driver.findElement(By.xpath("//input[@id='onward_cal']"));
	   
	   element3.click();
	   
	   
	   Actions action = new Actions(driver);
	   
	   action.moveToElement(element3).perform();
	   
	   WebElement element4 = driver.findElement(By.xpath("//td[text()='18']"));
	   
	   element4.click();
	   
	   Thread.sleep(4000);
	   
	   WebElement element5 = driver.findElement(By.xpath("//button[text()='Search Buses']"));
	   
	   element5.click();
		
        
			
		}
	   

}
	
