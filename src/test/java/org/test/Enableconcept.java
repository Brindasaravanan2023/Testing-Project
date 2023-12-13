package org.test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enableconcept {
	
static WebDriver driver;
	
	
	@Test (enabled = true)
	public static void One() throws InterruptedException, AWTException {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	   
	   WebElement element = driver.findElement(By.id("checkbox1"));
	   
	   element.click();  
	   
	   String text = driver.findElement(By.xpath("//label[text()=' Cricket ']")).getText();
	   
	   System.out.println(text);

}
	
}
