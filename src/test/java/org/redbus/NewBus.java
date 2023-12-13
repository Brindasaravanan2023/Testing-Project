package org.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBus {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwixt7isx6H7AhVBRisKHfKUC1oYABAAGgJzZg&ase=2&ohost=www.google.com&cid=CAASJuRoNoNiClC2oxkFOQ6PORjwU6y1JCsehJQv6EnYvnBTg627Wo4r&sig=AOD64_0XT8oTXXrxEk96es2Z1AdZLpXoGw&q&nis=4&adurl&ved=2ahUKEwjA4bKsx6H7AhWt2DgGHVJBDFQQ0Qx6BAgJEAE");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(3000);
	   
	   
	   WebElement element1 = driver.findElement(By.xpath("//*[@id=\"autosuggestBusSRPSrcHome\"]"));
	   
	   element1.sendKeys("Salem");
	   
	   Robot robot = new Robot();
	   
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   Thread.sleep(3000);
	   
	   WebElement findElement1 = driver.findElement(By.xpath("//*[@id=\"downshift-1-item-0\"]/li/span"));
	   
	   findElement1.click();
	   
	   
	   WebElement element2 = driver.findElement(By.xpath("//*[@id=\"autosuggestBusSRPDestHome\"]"));
	   
	   element2.sendKeys("Chennai");
	   
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   Thread.sleep(3000);
	   
	   WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"downshift-2-item-0\"]/li/span"));
	   
	   findElement2.click();
	   
	   
	   WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/section[1]/section/div[5]/button"));
	   
	   element3.click();
	   
	   Thread.sleep(3000);
	   
	   String text = driver.findElement(By.xpath("//*[@id=\"srpCardLayoutinner\"]/div[1]/div[1]")).getText();
	   
	   System.out.println(text);
	   
	   
		
	}
	  
	   
	  
	}


	
