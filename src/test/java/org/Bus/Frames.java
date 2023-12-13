package org.Bus;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("name")).sendKeys("Saravanan");
	   
	   driver.switchTo().frame(driver.findElement(By.id("frm1")));
	   
	   Select select = new Select (driver.findElement(By.id("course")));
	   
	   select.selectByVisibleText("Python");
	   
	   driver.switchTo().defaultContent();

}
	
}
