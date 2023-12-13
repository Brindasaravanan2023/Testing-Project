package org.redbus;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	   
	   WebElement ddn = driver.findElement(By.id("Skills"));
	   
	   Select select = new Select (ddn);
	   
	   select.selectByIndex(3);
	   
	   
	   List<WebElement> options = select.getOptions();
	   
	   int size = options.size();
	   
	   System.out.println(size);
	   
	   
	   
	   for (int i = 0; i <options.size(); i++) {
		   
		   WebElement element = options.get(i);
		   
		   String text = element.getText();
		   
		   System.out.println(text);
		
	}
	   
	  
	}

}

