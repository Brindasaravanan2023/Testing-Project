package org.Bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Onlinepayment {
	
static WebDriver driver;	
	
	@Test
	public static void One() throws InterruptedException, AWTException, IOException  {
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
		   driver.get("https://qa-hrcpatientpay.kernernorland.com/s/zemz4");
		   driver.manage().window().maximize();
		   
		   Thread.sleep(3000);
		   
		   WebElement element1 = driver.findElement(By.xpath("//input[@aria-valuemax='100']"));
		   
		   Actions action = new Actions(driver);
		   
		   action.moveToElement(element1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		   
		   element1.sendKeys("50");
		   
		   Thread.sleep(3000);
		   
		   WebElement element2 = driver.findElement(By.xpath("//input[@aria-valuemax='250']"));
		   
		   Actions action1 = new Actions(driver);
		   
		   action1.moveToElement(element2).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		   
		   element2.sendKeys("100");
		   
		   Thread.sleep(3000);
		   
		  WebElement element3 = driver.findElement(By.xpath("//button[text()='Pay using instalments']"));
		  
		  element3.click();
		   
		   Robot robot = new Robot();
		   
		   for (int i = 1; i <=10; i++) {
			   
			   robot.keyPress(KeyEvent.VK_DOWN);
			   robot.keyRelease(KeyEvent.VK_DOWN);
			
		}
		  
		   Thread.sleep(3000);
		   
		   WebElement element4 = driver.findElement(By.xpath("//div[@class='insta-options-header'][1]"));
		   
		   element4.click();
		   
		   
		   Robot robot1 = new Robot();
		   
		   for (int i = 1; i <=10; i++) {
			   
			   robot1.keyPress(KeyEvent.VK_DOWN);
			   robot1.keyRelease(KeyEvent.VK_DOWN);
			
		}
		 
           Thread.sleep(4000);
		   
		   WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[2]"
		   		+ "/div/div/div/div/div[3]/div[1]"));
		   
		   Actions action2 = new Actions(driver);
		   
		   action2.moveToElement(element5).click().perform();
		   
		   
		   
		   
		   WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[2]"
		   		+ "/div/div/div/div/div[3]/div[2]/label/span/input"));
		   
		   element6.click();
		   
		   
		   
		   
           Thread.sleep(3000);
		   
		   WebElement element7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[2]"
		   		+ "/div/div/div/div/div[3]/button"));
           
		   element7.click();
}
	
}
