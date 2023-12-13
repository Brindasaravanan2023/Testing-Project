package org.Newtest;

import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testfacebooklogin  {
	
	
	WebDriver driver;
	
	@BeforeTest()
	 public void beforetest() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	    driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   

	}
	
	@Test
	public void loginoperation() {
		
		Facebookloginsearch page = new Facebookloginsearch (driver);
		
		page.searchfacebook("Saravanan", "Saravanan@1990");
		
		
		
		
	}
	

}
