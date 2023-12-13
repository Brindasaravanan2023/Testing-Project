package org.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Governmentbus {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.tnstc.in/home.html");
	   driver.manage().window().maximize();
	   
	   WebElement element1 = driver.findElement(By.id("matchStartPlace"));
	   
	   element1.sendKeys("Salem");
	     

	   Thread.sleep(3000);
	   
	   Robot robot = new Robot();
	   
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
  
	   
	   WebElement element2 = driver.findElement(By.id("matchEndPlace"));
	   
	   element2.sendKeys("Chennai");
	   
       Thread.sleep(3000);
	   
	   Robot robot1 = new Robot();
	   
	   robot1.keyPress(KeyEvent.VK_ENTER);
	   robot1.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	   WebElement element3 = driver.findElement(By.id("txtdeptDateOtrip"));
	   
	   element3.click();
	   
	   
	   WebElement element4 = driver.findElement(By.xpath("//a[text()='14']"));
	   
	   Actions action = new Actions(driver);
	   
	   action.moveToElement(element4).perform();
	   
	   element4.click();
	   
	   
	   WebElement element5 = driver.findElement(By.id("txtdeptDateRtrip"));
	   
	   element5.click();
	   
	   WebElement element6 = driver.findElement(By.xpath("//a[text()='15']"));
	   
       Actions action1 = new Actions(driver);
	   
	   action1.moveToElement(element6).perform();
	   
	   element6.click();
	   
	   
	   WebElement element7 = driver.findElement(By.id("selectOnwardTimeSlab"));
	   
	   Select select = new Select(element7);
	   
	   select.selectByVisibleText("12PM - 08PM");
	   
	   
	   WebElement element8 = driver.findElement(By.id("selectReturnTimeSlab"));
	   
       Select select1 = new Select(element8);
	   
	   select1.selectByVisibleText("08PM - 12AM");
	   
	   WebElement element9 = driver.findElement(By.id("txtAdultMales"));
	   
	   element9.clear();
	   
	   element9.sendKeys("3");
	   
	   
	   WebElement element10 = driver.findElement(By.id("selectClass"));
	   
	   Select select2 = new Select(element10);
	   
	   select2.selectByVisibleText("AC SLEEPER SEATER");
	   
	   WebElement element11 = driver.findElement(By.xpath("//a[text()='SEARCH']"));
   
	   element11.click();
	   

}
	
	
}
