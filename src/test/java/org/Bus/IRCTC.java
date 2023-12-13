package org.Bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class IRCTC {
	
static WebDriver driver;	
	
	@Test
	public static void One() throws InterruptedException, AWTException, IOException  {
		
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
		   driver.get("https://www.irctc.co.in/nget/train-search");
		   driver.manage().window().maximize();
		   
		   WebElement element1 = driver.findElement(By.xpath("//input[@aria-haspopup='true'][1]"));
		   
		   element1.sendKeys("Salem");
		   
		   WebElement element2 = driver.findElement(By.xpath("//span[text()='SALEM JN - SA']"));
		   
		   Actions action = new Actions(driver);
		   
		   action.moveToElement(element2).perform();
		   
		   element2.click();
		   
		   WebElement element3 = driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']"));
		   
		   element3.sendKeys("Tirupati");
		   
		   Robot robot = new Robot();
		   
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
		   
		   WebElement element4 = driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));

		   element4.click();
		   
		   WebElement element5 = driver.findElement(By.xpath("//a[text()='15']"));
		   
	       Actions action1 = new Actions(driver);
		   
		   action1.moveToElement(element5).perform();
		   
		   element5.click();
		   
		   WebElement element6 = driver.findElement(By.xpath("//span[@class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"));
		   
		   element6.click();
		   
		   WebElement element7 = driver.findElement(By.xpath("//span[text()='Sleeper (SL)']"));
		   
	       Actions action2 = new Actions(driver);
		   
		   action1.moveToElement(element7).perform();
		   
		   element7.click();
		   
		   WebElement element8 = driver.findElement(By.xpath("//button[text()='Search']"));
		   
		   element8.click();
		   
		   Thread.sleep(3000);
		   
		   WebElement element9 = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[1]/span"));
		   
		   String text = element9.getText();
		   
		   System.out.println(text);
		   

}
		
	}
