package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	
	static WebDriver driver;
	
	@Test
	public static void Test1() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	   
	   WebElement element = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	   
	   Thread.sleep(3000);
	   
	   Actions action = new Actions(driver);
	   
	   action.moveToElement(element).perform();
	   
	   
	   Thread.sleep(3000);
	   
	   WebElement element2 = driver.findElement(By.xpath("//a[text()='Frames']"));
	   
	   element2.click();
	   

}
	
}
