package org.test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	   
	  WebElement ddn = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	   
	   Select select = new Select (ddn);
	   
	   
//	   
//       select.selectByIndex(1);
//   
//	   select.selectByIndex(3);
//   
//	   select.selectByIndex(4);
//	   
//	   List<WebElement> options = select.getAllSelectedOptions();
//	   
//	   for (int i = 0; i <options.size(); i++) {
//		   
//		   WebElement element = options.get(i);
//		   
//		   String text = element.getText();
//		   
//		   System.out.println(text);
	   
	   select.isMultiple();
	   
	   
//	   List<WebElement> options = select.getOptions();
//	   
//	   for (int i = 0; i <options.size(); i++) {
// 	   
// 	   WebElement element = options.get(i);
// 	   
//        String text = element.getText();
// 	   
//  	   System.out.println(text);
		   
		   
		
	}
		
	}

		
	
		
	
		
	
	   
	   
	   


	

