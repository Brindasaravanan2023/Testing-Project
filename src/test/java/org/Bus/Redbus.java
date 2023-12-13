package org.Bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	
static WebDriver driver;	
	
	@Test
	public static void One() throws InterruptedException, AWTException, IOException  {
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
		   driver.get("https://www.redbus.in/");
		   driver.manage().window().maximize();
		   
		   Thread.sleep(3000);
		   
		   WebElement element1 = driver.findElement(By.xpath("//span[text()='Bus Tickets']//following::div[@class='sc-ifAKCX gLwVlD'][1]"));
		   
		   element1.click();
		   
		  
		   
		   WebElement element2 = driver.findElement(By.xpath("//span[text()='Bus Tickets']//following::div[@class='sc-ifAKCX gLwVlD'][1]"));
		   
		   element2.sendKeys("Salem");
		   
		   


		   
}

}