package org.Bus;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OTPlogin {
	
	static WebDriver driver;

	@Test
	public static void One() throws InterruptedException, AWTException, IOException {
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https://bronze1.hcim.cloud/#/user/login");
		driver.manage().window().maximize();

		WebElement element1 = driver.findElement(By.id("email"));

		element1.sendKeys("test1996@mailinator.com");

		WebElement element2 = driver.findElement(By.id("password"));

		element2.sendKeys("Password@12345");
		
		
		WebElement element111 = driver.findElement(By.id("isRememberedDevice"));
		
		element111.click();
		
		Thread.sleep(3000);

		WebElement element3 = driver.findElement(By.xpath("//span[text()='Login']"));

		element3.click();
		
		
		
		
	}
		
}     