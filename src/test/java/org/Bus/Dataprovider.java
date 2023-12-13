package org.Bus;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	
	static WebDriver driver;
	
	
	@Test(dataProvider = "test1")
	
	public void login(String username, String password) throws InterruptedException, AWTException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://www.facebook.com/login/");
	   driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.id("loginbutton")).click();

	}
	 @Test(dataProvider = "test2")
	 public void flipkart(String user, String pass) {
		 
		    ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
		    driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders&fromMyOrdersPage=true");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(user);
		   
		   driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(pass);
		   
		   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	}
	
	@DataProvider (name = "test1")
	public Object[][] dataprovider() {
		
		Object[][] data = new Object [3][2];
		
		data [0][0] = "Saravanan";
		data [0][1] = "Saravanan@1990";
		
		data [1][0] = "Brinda";
		data [1][1] = "Brinda@1999";
		
		data [2][0] = "Nigaazhini";
		data [2][1] = "Nigaazhini@2022";
		
		return data;

	}
	
	@DataProvider (name = "test2")
	private Object[][] dataprovider1() {
		
     Object[][] data = new Object [3][2];
		
		data [0][0] = "Saravanan";
		data [0][1] = "Saravanan@1990";
		
		data [1][0] = "Brinda";
		data [1][1] = "Brinda@1999";
		
		data [2][0] = "Nigaazhini";
		data [2][1] = "Nigaazhini@2022";
		
		return data;

	}
	
	
}
