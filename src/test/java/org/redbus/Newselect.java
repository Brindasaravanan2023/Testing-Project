package org.redbus;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newselect {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	   
	   WebElement element = driver.findElement(By.id("Skills"));
	   
	   Select select = new Select(element);
	   
	    select.selectByVisibleText("CSS");
	    
	   
	  
	}
	  
	 
	   

}
	

