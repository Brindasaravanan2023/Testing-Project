package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	static WebDriver driver;
	
	@Test
	public static void Test1() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Frames.html");
	   driver.manage().window().maximize();
	   
	   WebElement element = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	   
	   element.click();
	   
	   

}
	
}
