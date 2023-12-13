package org.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swigy {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.swiggy.com/");
	   driver.manage().window().maximize();
	   
	   WebElement element1 = driver.findElement(By.id("location"));
	   
	   element1.sendKeys("Salem Ponnammapet");
	   
	   Thread.sleep(4000);
	   
	   WebElement element2 = driver.findElement(By.xpath("//span[@class='_2W-T9']//following::span[2]"));
	   
	   Actions action = new Actions(driver);
	      
	   action.moveToElement(element2).perform();
	   
	   element2.click();
	   
	   Thread.sleep(4000);
	   
	   WebElement element3 = driver.findElement(By.xpath("//span[text()='Search']"));
	   
	   element3.click();
	   
	   Thread.sleep(4000);
	   
	   WebElement element4 = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
	   
	   element4.sendKeys("Chicken Biryani");
	   
	   Robot robot = new Robot();
	   
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   Thread.sleep(4000);
	   
	   WebElement element5 = driver.findElement(By.xpath("//div[text()='By Dindigul Thalappakatti']"));
	   
	   element5.click();
	   
	   Thread.sleep(4000);
	   
	   WebElement element6 = driver.findElement(By.xpath("//h3[text()=' Black Pepper Chicken [boneless]']//following::div[text()='ADD'][1]"));
	   
       element6.click();
       
       Thread.sleep(4000);
       
       WebElement element7 = driver.findElement(By.xpath("//span[text()='Add Item']"));
       
       element7.click();
}

}