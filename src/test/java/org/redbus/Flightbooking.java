package org.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flightbooking {
	
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Generic-EM&utm_content=Tickets-Exact&utm_term=%21SEM%21DF%21G%21Generic%21RSA%2112554947352%21121063961722%21604782801075%21e%21flight+ticket+booking%21c%21&gclid=EAIaIQobChMI1fiNtc-5-wIVZJlmAh3WYwiREAAYAiAAEgJ9-vD_BwE");
	   driver.manage().window().maximize();
	  
	   
	   WebElement element1 = driver.findElement(By.xpath("//span[text()='One-way']//following::span[1]"));
	   
	   element1.click();
	   
	   WebElement element2 = driver.findElement(By.xpath("//p[@class='sc-giYglK eCwiKJ fswWidgetPlaceholder'][1]"));

	   element2.click();
	   
	   WebElement element3 = driver.findElement(By.xpath("//input[@type='text']"));
	   
	   element3.sendKeys("Chennai");
	   
	   Thread.sleep(3000);
	   
	   WebElement element4 = driver.findElement(By.xpath("//div[@class='sc-dPiLbb eIvaEJ'][1]"));
	    
	   Actions action = new Actions (driver);
	   
	   action.moveToElement(element4).perform();
	   
	   element4.click();
	   
	   WebElement element5 = driver.findElement(By.xpath("//input[@type='text']"));
	   
	   element5.sendKeys("Bangalore");
	   
	   
	   Thread.sleep(3000);
	   
	   WebElement element6 = driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']"));
	   
	   action.moveToElement(element6).perform();
	   
	   element6.click();
	   
	   WebElement element7 = driver.findElement(By.xpath("//p[text()='economy']"));
	   
	   element7.click();
	   
	  
	   WebElement element8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[1]/div/span[3]"));
	 
	   action.moveToElement(element8).perform();
	   
       element8.click();
       
       Thread.sleep(3000);
       
       WebElement element9 = driver.findElement(By.xpath("//a[text()='Done']"));
       
       element9.click();
       
       WebElement element10 = driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
       
       element10.click();

	   
}
	
}
